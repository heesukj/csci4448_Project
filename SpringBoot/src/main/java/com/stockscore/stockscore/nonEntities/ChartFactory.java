package com.stockscore.stockscore.nonEntities;

public class ChartFactory {

    public static Chart createChart(String type, Stock stock, HistoricalPerf historicalPerf) {
        if(type.equalsIgnoreCase("Stock")) return new StockChart(stock, historicalPerf);

        if(type.equalsIgnoreCase("Market")) return new MarketChart(stock, historicalPerf);

        if(type.equalsIgnoreCase("Peer")) return new PeerChart(stock, historicalPerf);

        return null;
    }
}
