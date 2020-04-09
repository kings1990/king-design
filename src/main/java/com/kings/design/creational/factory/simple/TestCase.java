package com.kings.design.creational.factory.simple;

public class TestCase {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("Vege");
        System.out.println("-------------------");
        pizzaStore.orderPizza("Beef");
    }
}


