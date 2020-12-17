package com.kings.design.structure.adaptor;

import com.kings.design.creational.singleton.SingletonLanhanSyncDoubleCheck;

public class BmCarFactoryImpl implements CarFactory {
    //单例
    private static volatile BmCarFactoryImpl INSTANCE = new BmCarFactoryImpl();
    
    public BmCarFactoryImpl() {
    }
    
    public static BmCarFactoryImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonLanhanSyncDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new BmCarFactoryImpl();
                }
            }
        }
        return INSTANCE;
    }
    
    @Override
    public Car createCar() {
        Car c = new Car();
        c.setColor("白色");
        c.setName("宝马");
        return c;
    }
}