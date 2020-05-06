package com.kings.design.behaviour.observer;

public class ObserveImpl implements Observe {
    private Subject weatherSubject;

    public ObserveImpl(Subject subject) {
        this.weatherSubject = subject;
        weatherSubject.register(this);
    }

    @Override
    public void update(int temperature, int airPressure, int humidity) {
        System.out.println("观察者更新【温度:" + temperature + ",气压:" + airPressure + "湿度:" + humidity + "】");
    }
}


