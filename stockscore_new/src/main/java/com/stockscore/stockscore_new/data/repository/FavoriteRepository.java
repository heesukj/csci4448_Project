//package com.stockscore.stockscore_new.data.repository;
//
//import com.stockscore.stockscore_new.data.entity.Favorite;
//import com.stockscore.stockscore_new.data.entity.Stock;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//
///**
// * Created by heesukjang on 11/28/17.
// */
//
//@Repository
//public interface FavoriteRepository extends CrudRepository<Favorite, Integer> {
//
//    List<Favorite> getAllFavorite();
//
//    Favorite addStock(Stock stock);
//
//    void removeStock(Stock stock);
//
//}