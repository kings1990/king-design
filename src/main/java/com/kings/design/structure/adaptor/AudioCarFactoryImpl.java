package com.kings.design.structure.adaptor;

public class AudioCarFactoryImpl implements CarFactory{
    @Override
    public Car createCar() {
        Car c = new Car();
        c.setColor("黑色");
        c.setName("奥迪");
        return c;
    }

    private static volatile AudioCarFactoryImpl INSTANCE = new AudioCarFactoryImpl();

    public AudioCarFactoryImpl() {
    }

    public static AudioCarFactoryImpl getInstance(){
        if(INSTANCE == null){
            synchronized (AudioCarFactoryImpl.class){
                if(INSTANCE == null){
                    INSTANCE =  new AudioCarFactoryImpl();
                }
            }
        }
        return INSTANCE;
    }
}


