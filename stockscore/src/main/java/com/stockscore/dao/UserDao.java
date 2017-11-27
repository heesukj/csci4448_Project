/* DAO: uses Hibernate (a library) to modify the database => tell Hibernate what to do 
 * => does CRUD operations to modify the database */

package com.stockscore.dao;

import com.stockscore.domain.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao {

    private SessionFactory factory;

    public UserDao() {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Exception ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    // we need Transaction when we write, not when you read
    public Integer createUser(User user) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer id = null;

        try {
            tx = session.beginTransaction();
            id = (Integer) session.save(user);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return id;
    }

    public List<User> getUsers() {

        Session session = factory.openSession();
        List<User> users = null;

        try {
            users = session.createCriteria(User.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return users;
    }
    //
    public User getUser(Integer id) {
        Session session = factory.openSession();
        User user = null;

        try {
            // tell Hibernate to go to User table and get the user id and cast to User
            user = (User) session.get(User.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return user;
    }

    public User retrieveUserbyEmail(String email) {

        Session session = factory.openSession();
        User user = null;

        try {
            user = (User) session.createCriteria(User.class, "user").add(Restrictions.eq("user.email", email)).uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return user;
	}

	/*
	public void updateUserById(Integer id) {
		try {
			entityManager.merge(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUserById(Integer id) {
		try {
			entityManager.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

}
