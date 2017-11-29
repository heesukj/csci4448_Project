package com.stockscore_new.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by heesukjang on 11/28/17.
 */

@Entity
public class Share {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private User user;
    private Stock stock;
    private String emailToShareWith;

    // getters and setters: Code -> Generate... -> getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public String getEmailToShareWith() {
        return emailToShareWith;
    }

    public void setEmailToShareWith(String emailToShareWith) {
        this.emailToShareWith = emailToShareWith;
    }
}


/* create table Share (
    id INT NOT NULL auto_increment,
    user_id INT NOT NULL,
    stock_id INT NOT NULL,
    share_to_email VARCHAR(20) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES User(id),
    FOREIGN KEY (stock_id) REFERENCES Stock(id)
); */

