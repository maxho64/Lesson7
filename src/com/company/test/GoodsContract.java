package com.company.test;

import java.util.Date;

public class GoodsContract extends AbstractDocument implements Document {
    public double amount;
    public Date date;
    public String type;

    public GoodsContract() {
    }

    public GoodsContract(String number, String type, double amount, Date date) {
        super(number, date);
        this.amount = amount;
        this.date = date;
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("GoodsContract{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}');
    }
}
