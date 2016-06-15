package com.example.nino.financeapp.model;

/**
 * Created by Nino on 23. 05. 2016.
 */
public class FinanceData {

    private String symbol;
    private Main main;


    public FinanceData(String symbol, float ask, float bid) {
        this.symbol = symbol;
        this.main = new Main(ask, bid);

    }

    public String getSymbol() {
        return symbol;
    }

    public Main getMain() {
        return main;
        //tudi tukaj se mi ne zdi vse v redu
    }
}
