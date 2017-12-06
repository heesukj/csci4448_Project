package com.stockscore.stockscore_new.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by heesukjang on 12/4/17.
 * better to build a Controller per URL path (no right or wrong) => include about 5-6 methods: Get, Put, Post, Delete
 */

@Controller
@RequestMapping(value="/stockscore")   // url path
public class StockScoreController {

    // --------- Get a StockScore ---------
    @RequestMapping(method= RequestMethod.GET)
    public String getStockScore() {
        return "stockscore";    //That string is actually going to get translated by the Thymeleaf engine into the name of a template. In our resources directory
    }
}
