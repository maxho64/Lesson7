package com.company.interfaces;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("Bus ran!");
    }

    @Override
    public void stop() {
        System.out.println("Bus stopped!");
    }
}
