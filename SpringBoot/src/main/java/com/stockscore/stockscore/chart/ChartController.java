package com.stockscore.stockscore.chart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChartController {

    @Autowired
    private ChartService chartService;

    @RequestMapping("/stockpage/{ticker}")
    public String drawChart(@PathVariable("ticker") String ticker, Model model) {
        model.addAttribute("stockTicker", chartService.getChart(ticker).ticker);

        return "stockPage";
    }





}
