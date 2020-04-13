package com.kings.design.structure.bridge;

public class WhiteColor implements Color{
    @Override
    public void addColor(String carType) {
        System.out.println("白色" + carType);
    }
}


