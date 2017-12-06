package com.stockscore.stockscore.nonEntities;

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
