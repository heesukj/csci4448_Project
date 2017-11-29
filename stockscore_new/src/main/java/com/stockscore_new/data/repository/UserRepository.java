// the same as "UserService" class that talks to UserDao
package com.stockscore_new.data.repository;

import com.stockscore_new.data.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by heesukjang on 11/27/17.
 */

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

    User getUserById(Integer id);

    User getUserByEmail(String email);

    User createUser(User user);

    boolean isUserExist(User newUser);

    List<User> findAllusers();

    void saveUser(User newUser);

    void updateExistingUser(User currentUser);

    void deleteUserById(Integer id);
}
