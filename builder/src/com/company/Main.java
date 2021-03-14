package com.company;

public class Main {

    public static void main(String[] args) {
        House house = new HouseBuilder().buildDoors().buildWalls().buildGarage().getResult();

        System.out.println(house.toString());
    }
}
