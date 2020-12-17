package com.kings.design.creational.factory.abstractFactory;

import com.kings.design.creational.factory.AbstractMilk;
import com.kings.design.creational.factory.AbstractPizza;
import com.kings.design.creational.factory.AppleMilk;
import com.kings.design.creational.factory.VeggPizza;

public class ColdFoodFactory implements AbstractFactoryI {
    @Override
    public AbstractPizza createPizza(String type) {
        if ("Vege".equals(type)) {
            VeggPizza veggPizza = new VeggPizza();
            veggPizza.prepare();
//            veggPizza.make(); 生冷不需要make
            veggPizza.complete();
            return veggPizza;
        } else {
            return null;
        }
    }

    @Override
    public AbstractMilk createMilk(String type) {
        if ("Apple".equals(type)) {
            AppleMilk milk = new AppleMilk();
            milk.prepare();
//            milk.make(); 生冷不需要make
            milk.complete();
            return milk;
        } else {
            return null;
        }
    }
}


