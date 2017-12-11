package com.stockscore.stockscore_new.web.application;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
@RequestMapping(value="/stockinfo")
public class LandingPageController {
    //public String getStockInfo(@RequestParam(value="stockTicker", required=false, defaultValue="AAPL") String stockTicker, Model model)
    @RequestMapping(method= RequestMethod.GET)
    public String getStockInfo(@RequestParam(value="stockTicker") String stockTicker, Model model) {
        model.addAttribute("stockTicker", stockTicker);

        /*-- Doug's Retcon'd code --*/
        Document doc;
        String rating = "WrongAns";
        try {
            doc = Jsoup.connect("https://stocktwits.com/symbol/" + stockTicker).get();
            rating = doc.select(".bullish").text();
            System.out.println(rating);
            model.addAttribute("bullishSentiment", rating);
        } catch (IOException e){
            e.printStackTrace();
        }
        /* ------------------------- */

        return "stockinfo";


    }
}
