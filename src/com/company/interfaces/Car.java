package com.company.interfaces;

public class Car implements Vehicle{

    @Override
    public void run() {
        System.out.println("Car ran!");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped!");
    }
}
