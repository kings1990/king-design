package com.kings.design.creational.factory;

public class AppleMilk extends AbstractMilk{
    @Override
    public void prepare() {
        System.out.println("苹果牛奶开始准备...");
    }

    @Override
    public void make() {
        System.out.println("苹果牛奶开始制作...");
    }

    @Override
    public void complete() {
        System.out.println("苹果牛奶制作完成...");
    }
}


