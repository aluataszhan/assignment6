package com.company;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship delivers");
    }
}
