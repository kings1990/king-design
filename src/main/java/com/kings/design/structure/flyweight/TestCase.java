package com.kings.design.structure.flyweight;

public class TestCase {
    public static void main(String[] args) {
        SpriteBottleCup bottleCupRed = SpriteBottleCupFactory.getCup("红色",null);
        SpriteBottleCup bottleCupGreen = SpriteBottleCupFactory.getCup("绿色",null);
        SpriteBottleCup bottleCupYellow = SpriteBottleCupFactory.getCup("黄色",null);
        System.out.println(bottleCupYellow.getColor());
        System.out.println(bottleCupYellow.getQrCode("张三的雪碧瓶子"));

        System.out.println("-------------------");

        SpriteBottleCup bottleCupYellowActive = SpriteBottleCupFactory.getCup("黄色",new NoSpriteBottleCup());
        System.out.println(bottleCupYellowActive.getColor());
        System.out.println(bottleCupYellowActive.getQrCode("我的雪碧瓶子"));
    }
}


