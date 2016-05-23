package com.example.nino.financeapp.model;

/**
 * Created by Nino on 23. 05. 2016.
 */
public class FinanceData {

    private int id;
    private double price;

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public FinanceData(int id, double price) {
        this.id = id;
        this.price = price;
    }
}
