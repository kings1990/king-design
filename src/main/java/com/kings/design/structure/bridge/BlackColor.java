package com.kings.design.structure.bridge;

public class BlackColor implements Color {
    @Override
    public void addColor(String carType) {
        System.out.println("黑色" + carType);
    }
}


