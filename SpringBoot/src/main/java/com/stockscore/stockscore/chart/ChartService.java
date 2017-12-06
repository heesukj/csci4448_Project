package com.stockscore.stockscore.chart;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ChartService {

    private List<Chart> charts = new ArrayList<>(Arrays.asList(
            new Chart("AMZN"),
            new Chart("AAPL"),
            new Chart("GOOG")
    ));

    public Chart getChart(String ticker) {
        for(Chart chart : charts) {
            System.out.println(ticker);
            System.out.println(chart.ticker);
            if(chart.ticker.equals(ticker)) {
                return chart;
            }
        }
        Chart newChart = new Chart(ticker);
        charts.add(newChart);
        return newChart;


    }



}
