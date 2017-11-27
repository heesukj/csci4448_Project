// Rest service to Database

package com.stockscore.spring.controllers;

import com.stockscore.domain.User;
import com.stockscore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    // Rest endpoints that talk to Service

    // tell Spring to find a component of UserService and use that one as an instance (not having constructor to instantiate)
	@Autowired
	private UserService userService;

    //use this to test if the rest service is working
	@GetMapping("/test")
	public String test() {
		return "test";
	}
    // Get request on Rest with endpoint /users
	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") Integer id) {
		return userService.getUser(id);
	}

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        User userFromDb = userService.getUserByEmail(user.getEmail());
        if (userFromDb != null) {
            //check if the password matches
            if (userFromDb.getPassword() != user.getEmail()) {
                //TODO: invalid password, return error
            }
        }

        return userFromDb;
    }
	
	@PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

}