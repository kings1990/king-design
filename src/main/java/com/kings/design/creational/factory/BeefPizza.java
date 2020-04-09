package com.kings.design.creational.factory;

public class BeefPizza extends AbstractPizza {
    @Override
    public void prepare() {
        System.out.println("牛肉披萨开始准备...");
    }

    @Override
    public void make() {
        System.out.println("牛肉披萨开始制作...");
    }

    @Override
    public void complete() {
        System.out.println("牛肉披萨制作完成...");
    }
}


