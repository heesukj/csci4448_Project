package com.stockscore.stockscore_new.data.nonEntity;


import com.stockscore.stockscore_new.data.entity.Stock;

public class MarketChart extends Chart {

    public MarketChart(Stock stock, HistoricalPerf historicalPerf) {
        this.stock = stock;
        this.historicalPerf = historicalPerf;
    }

    @Override
    public Chart drawChart() {
        return this;
    }
}