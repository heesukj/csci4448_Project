package com.stockscore.stockscore_new.business.domain;

/**
 * Created by heesukjang on 11/28/17.
 * this Domain class StockFavorite is a combination of two Entities: Stock.java and Favorite.java
 */
public class StockFavorite {
    private Integer userId;
    private Integer stockId;
    private String stockTicker;
    private String stockName;

    // getters and setters


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockTicker() {
        return stockTicker;
    }

    public void setStockTicker(String stockTicker) {
        this.stockTicker = stockTicker;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
