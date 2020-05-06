package com.kings.design.behaviour.observer;

public class TestCase {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        ObserveImpl observe = new ObserveImpl(weatherSubject);
        weatherSubject.setWeather(10, 10, 10);
    }
}


