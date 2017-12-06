package com.stockscore.stockscore.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/stockinfo")
public class LandingPageController {
    //public String getStockInfo(@RequestParam(value="stockTicker", required=false, defaultValue="AAPL") String stockTicker, Model model)
    @RequestMapping(method= RequestMethod.GET)
    public String getStockInfo(@RequestParam(value="stockTicker") String stockTicker, Model model) {
        model.addAttribute("stockTicker", stockTicker);

        return "stockinfo";


    }
}
