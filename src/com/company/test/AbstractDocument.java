package com.company.test;

import java.util.Date;

public class AbstractDocument {
    public String number;
    public Date date;

    public AbstractDocument() {
    }

    public AbstractDocument(String number, Date date) {
        this.number = number;
        this.date = date;
    }
}
