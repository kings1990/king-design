package com.kings.design.structure.decorate;

public class TestCase {
    public static void main(String[] args) {
        Cake cake = new CakeImpl();
        System.out.println(cake.name());
        System.out.println("价格："+cake.price());

        EggCakeDecorate eggCake = new EggCakeDecorate(cake);
        System.out.println(eggCake.name());
        System.out.println("加鸡蛋价格："+eggCake.price());

        CreamCakeDecorate creamEggCake = new CreamCakeDecorate(eggCake);
        System.out.println(creamEggCake.name());
        System.out.println("加奶油鸡蛋价格："+creamEggCake.price());

        BeefCakeDecorate beefCreamEggCake = new BeefCakeDecorate(creamEggCake);
        System.out.println(beefCreamEggCake.name());
        System.out.println("加牛肉奶油鸡蛋价格："+beefCreamEggCake.price());
    }
}


