// OOP Design Patterns: 1) Model-View-Controller pattern (build a web application here)
//                      2) Repository pattern: grab our data (a bit different than our traditional DAO which get all of the data at one shot)
//                                by going to go back to database multiple times to get our data
// the same as "UserService" class that talks to UserDao
package com.stockscore.stockscore_new.data.repository;

import com.stockscore.stockscore_new.data.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by heesukjang on 11/27/17.
 */

// we get all the methods declared in CrudRepository Interface in this sub-interface UserRepository

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

//    User getUserById(Integer id);

//    User getUserByEmail(String email);
//
//    User createUser(User user);
//
//    boolean isUserExist(User newUser);
//
//    List<User> findAllusers();
//
//    void saveUser(User newUser);
//
//    void updateExistingUser(User currentUser);
//
//    void deleteUserById(Integer id);
}
