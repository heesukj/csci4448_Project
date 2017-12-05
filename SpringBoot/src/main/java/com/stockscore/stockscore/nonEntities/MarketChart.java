package com.stockscore.stockscore.nonEntities;

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
