package com.kings.design.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
    int temperature, airPressure, humidity;
    List<Observe> observeList;

    public WeatherSubject() {
        observeList = new ArrayList<>();
    }

    @Override
    public void register(Observe observe) {
        observeList.add(observe);
    }

    @Override
    public void remove(Observe observe) {
        int i = observeList.indexOf(observe);
        if (i >= 0) {
            observeList.remove(i);
        }
    }

    @Override
    public void nodify() {
        for (Observe observe : observeList) {
            observe.update(temperature, airPressure, humidity);
        }
    }

    public void setWeather(int temperature, int airPressure, int humidity) {
        this.temperature = temperature;
        this.airPressure = airPressure;
        this.humidity = humidity;
        //nodify放到别的event类中将减少本类负担[event.nodify(observeList)]，推荐使用监听者模式,解耦事件
        nodify();
        //nodify1();
        //nodify2();
        //nodify3();
    }
}


