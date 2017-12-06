package com.stockscore.stockscore_new.data.nonEntity;

import com.stockscore.stockscore_new.data.entity.Stock;

public class ChartFactory {

    public static Chart createChart(String type, Stock stock, HistoricalPerf historicalPerf) {
        if(type.equalsIgnoreCase("Stock")) return new StockChart(stock, historicalPerf);

        if(type.equalsIgnoreCase("Market")) return new MarketChart(stock, historicalPerf);

        if(type.equalsIgnoreCase("Peer")) return new PeerChart(stock, historicalPerf);

        return null;
    }
}