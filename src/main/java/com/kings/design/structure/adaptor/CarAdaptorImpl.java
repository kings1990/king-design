package com.kings.design.structure.adaptor;

public class CarAdaptorImpl implements CarAdaptor {
    //spring使用注入的形式实现new
    private AudioCarFactoryImpl audioCarFactory = new AudioCarFactoryImpl();
    private BmCarFactoryImpl bmCarFactory = new BmCarFactoryImpl();

    public Car createCar(String carType) {
        //适配类型
        Car car;
        if ("audio".equals(carType)) {
            car = audioCarFactory.createCar();
        } else if ("bm".equals(carType)) {
            car = bmCarFactory.createCar();
        } else {
            return null;
        }
        return car;
    }


    @Override
    public Car changeCarColor(Car c, String color) {
        c.setColor(color);
        return c;
    }
}


