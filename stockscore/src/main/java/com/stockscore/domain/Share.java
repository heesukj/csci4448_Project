package com.stockscore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Share {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	/* Add dependency in pom.xml 
	for this "javax.validation.constraints.NotNull" 3rd party library */
	@NotNull 
	private Integer userId;
	
	@NotNull 
	private Integer stockId;
	
	private String shareToEmail;
	

}

/*create table Share ( 
    id INT NOT NULL auto_increment,
    user_id INT NOT NULL,
    stock_id INT NOT NULL,
    share_to_email VARCHAR(20) default NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES User(id),
    FOREIGN KEY (stock_id) REFERENCES Stock(id)
    );*/
