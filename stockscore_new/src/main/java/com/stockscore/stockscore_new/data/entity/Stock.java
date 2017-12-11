package com.stockscore.stockscore_new.data.entity;

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

    // ONE stock can have MANY favorites
    // "mappedBy = "stock" tells us this relation will be managed by Stock class.
    // for example, if we insert a favorite, then two SQL will be injected if cascadetype=all/save.
    // 1st SQL will inject details in Stock table and 2nd SQL will inject favorite details in favorite table with
    // "stock_id" column of Favorite column pointing to Stock inserted.
//    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<Favorite> favorites;
//
//
//    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<Share> shares;

    // default constructor will be generated

    // getters and setters: Code -> Generate... -> getters and setters

//    public Set<Favorite> getFavorites() {
//        return favorites;
//    }
//
//    public void setFavorites(Set<Favorite> favorites) {
//        this.favorites = favorites;
//    }
//
//    public Set<Share> getShares() {
//        return shares;
//    }
//
//    public void setShares(Set<Share> shares) {
//        this.shares = shares;
//    }

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
