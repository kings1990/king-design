package com.kings.design.structure.adaptor;

public class CarAdaptorImpl implements CarAdaptor {
    
    public Car createCar(String carType) {
        //适配类型
        Car car;
        if ("audio".equals(carType)) {
            car = AudioCarFactoryImpl.getInstance().createCar();
        } else if ("bm".equals(carType)) {
            car = BmCarFactoryImpl.getInstance().createCar();
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


