package com.stockscore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stockscore.dao.UserDao;
import com.stockscore.domain.User;

import java.util.List;

// all of the service classes need to be 'Component' (means a way for Spring to know about -> Spring component)
// @Component works with @Autowired

@Component
public class UserService {
	
	@Autowired 
	private UserDao userDao;

    public User createUser(User newUser) {

        Integer id = userDao.createUser(newUser);

        User user = new User();
        user.setId(id);
        user.setEmail(newUser.getEmail());
        user.setFirstName(newUser.getFirstName());
        user.setLastName(newUser.getLastName());
        user.setPassword(newUser.getPassword());
        return user;
    }

	public List<User> getUsers() {
		return userDao.getUsers();
	}

    public User getUser(Integer id) {
        return userDao.getUser(id);
    }

    public User getUserByEmail(String email) {
        return userDao.retrieveUserbyEmail(email);
    }
}
