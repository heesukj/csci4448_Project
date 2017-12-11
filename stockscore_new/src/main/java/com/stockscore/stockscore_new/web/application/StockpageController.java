package com.stockscore.stockscore_new.web.application;

import com.stockscore.stockscore_new.data.entity.User;
import com.stockscore.stockscore_new.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by heesukjang on 12/4/17.
 * better to build a Controller per URL path (no right or wrong) => include about 5-6 methods: Get, Put, Post, Delete
 */

@Controller
@RequestMapping(value="/stockpage")   // url path
public class StockpageController {

    // --------- Get a StockScore ---------
//    @RequestMapping(method= RequestMethod.GET)
//    public String getStockScore() {
//        return "stockpage";    //That string is actually going to get translated by the Thymeleaf engine into the name of a template. In our resources directory
//    }

    // when using @Autowired: don't need to call a constructor to create an instance
    // we get all the built-in CrudRepository methods (like .findOne(id)); thru the instance of userRepository here
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String getStockPageForUser(@RequestParam(value="user", required=true) Integer userId, Model model) {
        // pull the user that has id=5 (
        System.out.println("userId: " + userId);
        User user = (User) userRepository.findOne(userId);
        System.out.println("user name: " + user.getFirstName());
        // when allows to go thru all the elements, call iterator() if the next elem exists and
        // for every favoriate, get stockname from the favorite stock
        System.out.println("user favorires: " + user.getFavorites().iterator().next().getStock().getStockName());
        System.out.println("user shares: " + user.getShares().iterator().next().getStock().getStockTicker());

        // make available in html
        model.addAttribute("user", user);
        model.addAttribute("favorites", user.getFavorites());
        model.addAttribute("shares", user.getShares());

        return "stockpage";    //That string is actually going to get translated by the Thymeleaf engine into the name of a template. In our resources directory
    }
}
