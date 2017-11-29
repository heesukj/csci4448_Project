// REST service talks to UserRepository (= UserService)

package com.stockscore_new.data.webservice;

//import com.stockscore_new.data.CustomErrorType;
import com.stockscore_new.data.entity.User;
import com.stockscore_new.data.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by heesukjang on 11/27/17.
 */

// Rest service to Database

@RestController
public class UserController {

    // Rest endpoints that talk to Service
    // tell Spring to find a component of UserService and use that
    // one as an instance (not having constructor to instantiate)

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;



    //use this to test if the rest service is working
    @RequestMapping("/test")
    public String test() {
        return "test";
    }
    // Get request on Rest with endpoint /users

// --------- Retrieve ALL Users  => NO_CONTENT(204, "No Content") ---------
    @RequestMapping(value="/users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() {

        List<User> allUsers = userRepository.findAllusers();

        if (allUsers == null) {     // if allUsers do not exist (empty)
            return new ResponseEntity<List<User>>(allUsers, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(allUsers, HttpStatus.OK);
    }

// --------- Retrieve SINGLE User => NOT_FOUND(404, "Not Found") ---------
    @RequestMapping(value="/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUser(@PathVariable("id") Integer id) {
        logger.info("Fetching User with id {}", id);

        User user = userRepository.getUserById(id);

        if (user == null) {
            logger.error("User with id {} not found.", id);
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
        }
//        return ResponseEntity.ok(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

// --------- Login (username = email, password, RequestBody(exist only in POST) =  records of a user in JSON format) ---------
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public ResponseEntity<User> login(@RequestBody User user) {

        User userFromDb = userRepository.getUserByEmail(user.getEmail());

        if (userFromDb != null) {     // if this userFromDb exists
            //check if the password matches
            if (userFromDb.getPassword() != user.getPassword()) {
                //TODO: invalid password, return error => UNAUTHORIZED(401, "Unauthorized")
                return new ResponseEntity<User>(userFromDb, HttpStatus.UNAUTHORIZED);
            }
           
        } else {      // if this userFromDb does not exist
            //TODO: report error "user does not exist"
            return new ResponseEntity<User>(userFromDb, HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<User>(userFromDb, HttpStatus.OK);
    }
    
// --------- Create a User  => CONFLICT(409, "Conflict"), CREATED(201, "Created") ---------
    @RequestMapping(value="/user", method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody User newUser) {
        logger.info("Creating User : {}", newUser);

        if (userRepository.isUserExist(newUser)) {   // if the newUser already exists
            return new ResponseEntity<User>(newUser, HttpStatus.CONFLICT);
        }
        userRepository.saveUser(newUser);   // save the newUser
//        headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<User>(newUser, HttpStatus.CREATED);   // if the newUser does not exist, create one
    }

// --------- Update a User => NOT_FOUND(404, "Not Found") ---------
    @RequestMapping(value="/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User user) {
        logger.info("Updating User with id {}", id);

        User currentUser = userRepository.getUserById(id);

        if (currentUser == null) {
            return new ResponseEntity<User>(currentUser, HttpStatus.NOT_FOUND);
        }
        // when currentUser exists, update (by calling setters) attributes on the currentUser
        currentUser.setFirstName(user.getFirstName());
        currentUser.setLastName(user.getLastName());
        currentUser.setEmail(user.getEmail());
        currentUser.setPassword(user.getPassword());

        userRepository.updateExistingUser(currentUser);   // update the existing user info with the modified currentUser info

//        System.out.println("user: " + user);
        return new ResponseEntity<User>(currentUser, HttpStatus.OK);
    }

// --------- Delete a User => NOT_FOUND(404, "Not Found") ---------

    @RequestMapping(value="/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUser(@PathVariable("id") Integer id) {
        logger.info("Deleting User with id {}", id);

        User userToBeRemoved = userRepository.getUserById(id);

        if (userToBeRemoved == null) {     // if the userToBeRemoved does not exist
            return new ResponseEntity<User>(userToBeRemoved, HttpStatus.NOT_FOUND);
        }
        // otherwise, delete the user by id
        userRepository.deleteUserById(id);    // calling "deleteUserById(id)" returns "no value"

        // NO_CONTENT (void return type): menas the server successfully fulfilled the request
        // and that there is no additional content to send in the response body
        return new ResponseEntity<User>(userToBeRemoved, HttpStatus.NO_CONTENT);
    }

}