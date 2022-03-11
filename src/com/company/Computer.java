package com.company;

import com.company.inner.HDD;
import com.company.inner.RAM;

public class Computer {

    double amount;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(){

    }

    public Computer(double amount, String model,
                    RAM ram, HDD hdd) {
        this.amount = amount;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
}
