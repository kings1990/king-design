package com.kings.design.structure.adaptor;

public class TestCase {
    public static void main(String[] args) {
        CarAdaptorImpl carAdaptor = new CarAdaptorImpl();
        Car audioCar = carAdaptor.createCar("audio");
        System.out.println(audioCar.getColor() + audioCar.getName());

        Car bmCar = carAdaptor.createCar("bm");
        carAdaptor.changeCarColor(bmCar,"红色");
        System.out.println(bmCar.getColor() + bmCar.getName());
    }
}


