package com.stockscore.stockscore_new.data.repository;

import com.stockscore.stockscore_new.data.entity.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by heesukjang on 11/28/17.
 */

@Repository
public interface StockRepository extends CrudRepository<Stock, Integer> {

//    Boolean validTicker();
}
