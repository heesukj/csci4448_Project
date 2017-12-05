package com.stockscore.stockscore.nonEntities;

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
