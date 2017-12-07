package com.stockscore.stockscore_new.data.entity;

import javax.persistence.*;

/**
 * Created by heesukjang on 11/28/17.
 */

@Entity
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;

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
}


/* create table Favorite (
    id INT NOT NULL auto_increment,
    user_id INT NOT NULL,
    stock_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES User(id),
    FOREIGN KEY (stock_id) REFERENCES Stock(id)
); */