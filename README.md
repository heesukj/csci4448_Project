# CSCI 4448 Project 

## Title : Stock Score

### Description : 

Stock Score provides investment information to users.  Users enter a stock ticker and a date range to generate a stock score which indicates if the user should buy, hold or sell a stock. Users can save a score as a favorite or share the score with other users. 


### Team Members:

- Douglas Allen
- Heesuk Jang
- David Zhuzhunashvili

### Score Algorithm

Score = (RealTimeSentiments x 0.6) + (EMA x 0.4)

 ##### Note:
   * RealTimeSentiments:
The feeling or tone of a market, or its crowd psychology, as revealed through the activity and price movement of the securities traded in that market. For example, rising prices would indicate a bullish market sentiment, while falling prices would indicate a bearish market sentiment => Do addition (+) for bullish and subtraction (-) for bearlish indicator in the computation
  * EMA (Exponential Moving Average) = (daily closing stok price - EMA previous day) x (2 / Time Period + 1) + EMA previous day
  
### Introduced APIs for Automating Data Pulls
 * <https://stockinvest.us>
 * <https://www.tradingview.com>
 * <https://stocktwits.com>

