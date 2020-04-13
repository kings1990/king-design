package com.kings.design.structure.bridge;

public abstract class Car {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void makeCar(String carType);

}


