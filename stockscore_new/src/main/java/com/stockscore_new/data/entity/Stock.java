package com.stockscore_new.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by heesukjang on 11/28/17.
 */


@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String stockName;
    private String stockTicker;
    private String marketIndex;
    private String stockIndus;

    // default constructor will be generated

    // getters and setters: Code -> Generate... -> getters and setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getStockName() {
        return stockName;
    }
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public String getStockTicker() {
        return stockTicker;
    }
    public void setStockTicker(String stockTicker) {
        this.stockTicker = stockTicker;
    }
    public String getMarketIndex() {
        return marketIndex;
    }
    public void setMarketIndex(String marketIndex) {
        this.marketIndex = marketIndex;
    }
    public String getStockIndus() {
        return stockIndus;
    }
    public void setStockIndus(String stockIndus) {
        this.stockIndus = stockIndus;
    }

}



/* create table Stock (
    id INT NOT NULL auto_increment,
    stock_name VARCHAR(20) default NULL,
    stock_ticker VARCHAR(20) NOT NULL,
    market_index VARCHAR(10) default NULL,
    stock_indus  VARCHAR(60) default NULL,
    PRIMARY KEY (id)
); */
