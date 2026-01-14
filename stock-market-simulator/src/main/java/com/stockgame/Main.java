package com.stockgame;

import java.math.BigDecimal;
import yahoofinance.*;

public class Main {
    public static void main(String[] args) {

        Stock stock = YahooFinance.get("INTC");

        BigDecimal price = stock.getQuote().getPrice();
        BigDecimal change = stock.getQuote().getChangeInPercent();
        BigDecimal peg = stock.getStats().getPeg();
        BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();

        stock.print();
    }
}