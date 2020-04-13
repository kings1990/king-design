package com.kings.design.structure.adaptor;

public class AudioCarFactoryImpl implements CarFactory{
    @Override
    public Car createCar() {
        Car c = new Car();
        c.setColor("黑色");
        c.setName("奥迪");
        return c;
    }
}


