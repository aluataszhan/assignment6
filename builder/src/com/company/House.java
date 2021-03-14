package com.company;

public class House {
    private boolean walls;
    private boolean doors;
    private boolean windows;
    private boolean roof;
    private boolean garage;

    public House() {
        walls = false;
        doors = false;
        windows = false;
        roof = false;
        garage = false;
    }

    public House(boolean walls, boolean doors, boolean windows, boolean roof, boolean garage) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
        this.garage = garage;
    }

    public boolean isWalls() {
        return walls;
    }

    public void setWalls(boolean walls) {
        this.walls = walls;
    }

    public boolean isDoors() {
        return doors;
    }

    public void setDoors(boolean doors) {
        this.doors = doors;
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", doors=" + doors +
                ", windows=" + windows +
                ", roof=" + roof +
                ", garage=" + garage +
                '}';
    }
}
