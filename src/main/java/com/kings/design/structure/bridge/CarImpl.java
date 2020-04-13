package com.kings.design.structure.bridge;

public class CarImpl extends Car{
    
    @Override
    void makeCar(String carType) {
        color.addColor(carType);
    }
}


