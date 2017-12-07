package com.stockscore.stockscore_new.business.service;

import com.stockscore.stockscore_new.business.domain.StockFavorite;
import com.stockscore.stockscore_new.data.entity.Stock;
import com.stockscore.stockscore_new.data.repository.FavoriteRepository;
import com.stockscore.stockscore_new.data.repository.StockRepository;
import com.stockscore.stockscore_new.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//package com.stockscore.stockscore_new.business.service;
////
////import com.stockscore.stockscore_new.business.domain.StockFavorite;
////import com.stockscore.stockscore_new.data.entity.Stock;
////import com.stockscore.stockscore_new.data.repository.FavoriteRepository;
////import com.stockscore.stockscore_new.data.repository.StockRepository;
//
//import com.stockscore.stockscore_new.data.repository.FavoriteRepository;
//import com.stockscore.stockscore_new.data.repository.StockRepository;
//import com.stockscore.stockscore_new.data.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
////import java.util.ArrayList;
///**
// * Created by heesukjang on 11/28/17.
// * use the Service stereotype @Service for a component (rather than @Component), but this
// * way we can get this autoconfigured into our application context at runtime.
// */
//
@Service
public class FavoriteService {
    // Add three dependencies
    private UserRepository userRepository;
    private StockRepository stockRepository;
    private FavoriteRepository favoriteRepository;

    @Autowired
    public FavoriteService(UserRepository userRepository, StockRepository stockRepository, FavoriteRepository favoriteRepository) {
        this.userRepository = userRepository;
        this.stockRepository = stockRepository;
        this.favoriteRepository = favoriteRepository;
    }
//    three methods: getAllFavorite():List / addStock(stock:Stock):Favorite / removeStock(stock:Stock):void

    public List<StockFavorite> getUserFavorite(String stockTicker) {
        // got StockRepository

        Iterable<Stock> stocks = this.stockRepository.findAll();  // get all the stocks

        Map<Integer, StockFavorite> stockFavoriteMap = new HashMap<>();

        stocks.forEach(stock -> {   // set the value on stockf
            StockFavorite stockFavorite = new StockFavorite();
            stockFavorite.setStockId(stock.getId());
            stockFavorite.setStockTicker(stock.getStockTicker());
            stockFavorite.setStockName(stock.getStockName());

            stockFavoriteMap.put(stock.getId(), stockFavorite);  // add stockId as keys and stockFavorite as values
        });

        return null;
    }


//////        Iterable<Favorite> favorites = this.favoriteRepository.findAll();
//////        List<StockFavorite> stockFavorites = new ArrayList<>();
//////        if (favorites != null) {
//////            for (Integer stockId : stockFavoriteMap.keySet()) {
//////                stockFavorites.add(stockFavoriteMap.get(stockId));  // add individual stock into our list, stockFavorites
//////            }
//////        }
//////        return stockFavorites;
////
////
////        List<StockFavorite> stockFavorites = new ArrayList<>();
////        for (Integer stockId : stockFavoriteMap.keySet()) {
////            stockFavorites.add(stockFavoriteMap.get(stockId));  // add individual stock into our list, stockFavorites
////        }
////        return stockFavorites;
////    }
}