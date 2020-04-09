package com.kings.design.creational.factory.dynamic;

import com.kings.design.creational.factory.AbstractPizza;
import com.kings.design.creational.factory.BeefPizza;
import com.kings.design.creational.factory.VeggPizza;

/**
 * <p class="detail">
 * 功能:罗蒙披萨店
 * </p>
 *
 * @author Kings
 * @date 2020.04.08
 */
public class PizzaStoreLuom implements DynamicFactory{

    @Override
    public AbstractPizza createPizza(String type){
        if ("Vege".equals(type)) {
            return new VeggPizza();
        } else if ("Beef".equals(type)) {
            return new BeefPizza();
        } else {
            return null;
        }
    }
    
    public void orderPizza(String type) {
        System.out.println("客户开始预订pizza,类型:" + type);
        AbstractPizza pizza = createPizza(type);
        pizza.prepare();
        pizza.make();
        pizza.complete();
    }
}


