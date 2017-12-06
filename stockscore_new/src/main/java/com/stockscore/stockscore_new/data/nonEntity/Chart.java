package com.stockscore.stockscore_new.data.nonEntity;

import com.stockscore.stockscore_new.data.entity.Stock;

public  abstract class Chart {
    protected Stock stock;
    protected HistoricalPerf historicalPerf;

    public abstract Chart drawChart();

    public Stock getStock() {
        return stock;
    }

    public HistoricalPerf getHistoricalPerf() {
        return historicalPerf;
    }
}