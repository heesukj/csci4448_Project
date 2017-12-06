package com.stockscore.stockscore_new.data.nonEntity;

import java.util.Date;

public class HistoricalPerf {
    private Date[] dateRange;
    private float dailyPrice;

    public Date[] getDateRange() {
        return dateRange;
    }

    public float getDailyPrice() {
        return dailyPrice;
    }

    public void setDateRange(Date[] dateRange) {
        this.dateRange = dateRange;
    }

    public void setDailyPrice(float dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public boolean validDate() {
        return (dateRange[0] != null && dateRange[1] != null && dateRange[0].before(dateRange[1]));
    }

}