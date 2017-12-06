package com.stockscore.stockscore_new.data.nonEntity;


import com.stockscore.stockscore_new.data.entity.Stock;

public class PeerChart extends Chart {

    public PeerChart(Stock stock, HistoricalPerf historicalPerf) {
        this.stock = stock;
        this.historicalPerf = historicalPerf;
    }

    @Override
    public Chart drawChart() {
        return this;
    }
}