package com.stockscore.stockscore_new.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by heesukjang on 12/6/17.
 */



@Controller
@RequestMapping(value="stockscore")
public class StockScoreController {

    //    @RequestMapping(method= RequestMethod.GET)
//    public String getFavorite(@RequestParam(value="stockTicker", required=false)String ticker, Model model) {
//        List<StockFavorite> stockFavoriateList = this.favoriteService.geFavoriteForStockTicker(ticker);
//        model.addAttribute("stockFavorite", stockFavoriateList);
//        return "favorite";
//    }

    @RequestMapping(method= RequestMethod.GET)
    public String getStockScore() {
        return "stockscore";
    }

}
