package com.kings.design.structure.adaptor;

public class BmCarFactoryImpl implements CarFactory{
    @Override
    public Car createCar() {
        Car c = new Car();
        c.setColor("白色");
        c.setName("宝马");
        return c;
    }
}