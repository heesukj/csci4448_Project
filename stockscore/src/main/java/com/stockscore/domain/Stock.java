package com.stockscore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String stockName;
	private String stockTicker;
	private String stockIndus;
	
	// default constructor will be generated
	
	// getters and setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockTicker() {
		return stockTicker;
	}
	public void setStockTicker(String stockTicker) {
		this.stockTicker = stockTicker;
	}
	public String getStockIndus() {
		return stockIndus;
	}
	public void setStockIndus(String stockIndus) {
		this.stockIndus = stockIndus;
	}	
	
}



/*create table Stock ( 
    id INT NOT NULL auto_increment,
    stock_name VARCHAR(20) default NULL,
    stock_ticker VARCHAR(20) default NULL,
    stock_indus  VARCHAR(20) default NULL,
    PRIMARY KEY (id)
    );*/
