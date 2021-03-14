package com.company;

public class HouseBuilder {
    public House house;

    public HouseBuilder() {
        house = new House();
    }

    public HouseBuilder(House house) {
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public HouseBuilder reset() {
        house = new House();
        return this;
    }

    public HouseBuilder buildWalls() {
        house.setWalls(true);
        return this;
    }

    public HouseBuilder buildDoors() {
        house.setDoors(true);
        return this;
    }

    public HouseBuilder buildWindows() {
        house.setWindows(true);
        return this;
    }

    public HouseBuilder buildRoof() {
        house.setRoof(true);
        return this;
    }

    public HouseBuilder buildGarage() {
        house.setGarage(true);
        return this;
    }

    public House getResult() {
        return house;
    }
}
