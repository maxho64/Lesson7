package com.company.test;

import java.util.Date;

public class Invoice extends AbstractDocument implements Document {
    public double amountPerMonth;
    public String departmentCode;

    public Invoice() {
    }

    public Invoice(double amountPerMonth, Date date, String number, String departmentCode) {
        super(number, date);
        this.amountPerMonth = amountPerMonth;
        this.departmentCode = departmentCode;
    }

    @Override
    public void print() {
        System.out.println("Invoice{" +
                "amountPerMonth=" + amountPerMonth +
                ", date=" + date +
                ", number='" + number + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}');
    }

    public void method(){

    }
}
