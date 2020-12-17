package com.kings.design.structure.bridge;

public class TestCase {
    
    public static void main(String[] args) {
        Car carImpl = new CarImpl();
        BlackColor blackColor = new BlackColor();
        carImpl.setColor(blackColor);
        carImpl.makeCar("宝马");
    }
}


