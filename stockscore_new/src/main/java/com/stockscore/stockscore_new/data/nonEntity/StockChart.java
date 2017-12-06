package com.stockscore.stockscore_new.data.nonEntity;

import com.stockscore.stockscore_new.data.entity.Stock;

public class StockChart extends Chart {

    public StockChart(Stock stock, HistoricalPerf historicalPerf) {
        this.stock = stock;
        this.historicalPerf = historicalPerf;
    }

    @Override
    public Chart drawChart() {
        return this;
    }
}