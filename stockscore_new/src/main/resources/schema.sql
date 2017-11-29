-- FOUR tables: User, Stock, Share, and Favorite

create table User (
    id INT NOT NULL auto_increment,
    first_name VARCHAR(20) NOT NULL ,
    last_name  VARCHAR(20) NOT NULL ,
    email  VARCHAR(25) NOT NULL UNIQUE,
    password  VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
);

create table Stock (
    id INT NOT NULL auto_increment,
    stock_name VARCHAR(20) NOT NULL,
    stock_ticker VARCHAR(20) NOT NULL,
    market_index VARCHAR(10) default NULL,
    stock_indus  VARCHAR(60) default NULL,
    PRIMARY KEY (id)
);

create table Share (
    id INT NOT NULL auto_increment,
    user_id INT NOT NULL,
    stock_id INT NOT NULL,
    email_to_share_with VARCHAR(20) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES User(id),
    FOREIGN KEY (stock_id) REFERENCES Stock(id)
);

create table Favorite (
    id INT NOT NULL auto_increment,
    user_id INT NOT NULL,
    stock_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES User(id),
    FOREIGN KEY (stock_id) REFERENCES Stock(id)
);

