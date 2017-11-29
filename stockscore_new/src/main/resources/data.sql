INSERT INTO USER (first_name, last_name, email, password) VALUES ('Bob', 'Smith', 'bobsmith@gmail.com', 'qwerty');
INSERT INTO USER (first_name, last_name, email, password) VALUES ('John', 'Rachael', 'johnrachael@gmail.com', '12qwerty');
INSERT INTO USER (first_name, last_name, email, password) VALUES ('Sung', 'Kim', 'sungkim@gmail.com', 'qyurty44');
INSERT INTO USER (first_name, last_name, email, password) VALUES ('Bee', 'Sweet', 'beesweet@gmail.com', 'asdf19');
INSERT INTO USER (first_name, last_name, email, password) VALUES ('Xai', 'Zing', 'xaizing@gmail.com', 'zxcvb');

INSERT INTO STOCK (stock_name, stock_ticker, market_index, stock_indus) VALUES ('NETFLIX INC COM', 'NFLX', 'NASDAQ', 'Technology: Software & IT Services');
INSERT INTO STOCK (stock_name, stock_ticker, market_index, stock_indus) VALUES ('APPLE INC COM', 'AAPL', 'NASDAQ', 'Technology: Computers, Phones & Household Electronics');
INSERT INTO STOCK (stock_name, stock_ticker, market_index, stock_indus) VALUES ('MACYS INC COM', 'M', 'NYSE', 'Consumer Cyclicals: Diversified Retail');
INSERT INTO STOCK (stock_name, stock_ticker, market_index, stock_indus) VALUES ('EXXON MOBIL CORP COM', 'XOM', 'NYSE', 'Energy: Oil & Gas');

INSERT INTO SHARE (user_id, stock_id, email_to_share_with) VALUES ((SELECT user_id FROM USER WHERE last_name = 'Smith'), (SELECT stock_id FROM STOCK WHERE stock_ticker = 'XOM'), 'bobsmith@gmail.com');

INSERT INTO FAVORITE (user_id, stock_id) VALUES ((SELECT user_id FROM USER WHERE last_name = 'Zing'), (SELECT stock_id FROM STOCK WHERE stock_ticker = 'AAPL'));
INSERT INTO FAVORITE (user_id, stock_id) VALUES ((SELECT user_id FROM USER WHERE last_name = 'Kim'), (SELECT stock_id FROM STOCK WHERE stock_ticker = 'M'));
INSERT INTO FAVORITE (user_id, stock_id) VALUES ((SELECT user_id FROM USER WHERE last_name = 'Rachael'), (SELECT stock_id FROM STOCK WHERE stock_ticker = 'NFLX'));
