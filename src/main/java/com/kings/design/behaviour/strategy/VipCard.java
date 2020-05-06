package com.kings.design.behaviour.strategy;

public class VipCard implements Card {
    @Override
    public double discount(double price) {
        return price * 0.5;
    }
}


