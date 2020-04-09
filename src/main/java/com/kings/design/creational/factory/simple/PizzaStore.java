package com.kings.design.creational.factory.simple;

import com.kings.design.creational.factory.AbstractPizza;

/**
 * <p class="detail">
 * 功能:披萨商店
 * </p>
 *
 * @author Kings
 * @date 2020.04.08
 */
public class PizzaStore {

    private SimplePizzaFactory pizzaFactory;

    /**
     * Instantiates a new Pizza store.
     *
     * @param pizzaFactory the pizza factory
     */
    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    /**
     * <p class="detail">
     * 功能:预订披萨
     * </p>
     *
     * @param type :
     * @author Kings
     * @date 2020.04.08
     */
    public void orderPizza(String type) {
        System.out.println("客户开始预订pizza,类型:" + type);
        AbstractPizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.make();
        pizza.complete();
    }
}


