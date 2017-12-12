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

        Document doc;
        String rating = "";
        String ratingRefined = "";
        String recommendation = "";
        int ratingInt = 0;

        try {
            doc = Jsoup.connect("https://stocktwits.com/symbol/" + stockTicker).get();
            rating = doc.select(".bullish").text();

            /*-- Trimming off percentage --*/
            ratingRefined = rating.substring(0, rating.length()-1);

            /*-- Translating to INT */
            ratingInt = Integer.parseInt(ratingRefined);
            System.out.println(ratingInt);

            /*-- Giving recommendation --*/
            if (ratingInt < 20){ recommendation = "STRONG SELL"; }
            else if (ratingInt > 20 && ratingInt < 40) { recommendation = "SELL"; }
            else if (ratingInt > 40 && ratingInt < 60) { recommendation = "HOLD"; }
            else if (ratingInt > 60 && ratingInt < 80) { recommendation = "BUY"; }
            else if (ratingInt > 80 && ratingInt <= 100) { recommendation = "STRONG BUY"; }

            System.out.println(recommendation);

            model.addAttribute("bullishSentiment", rating);
            model.addAttribute("recommend", recommendation);
        } catch (IOException e){
            e.printStackTrace();
        }


        return "stockinfo";


    }
}
