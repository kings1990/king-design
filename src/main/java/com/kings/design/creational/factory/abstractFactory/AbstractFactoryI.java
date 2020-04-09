package com.kings.design.creational.factory.abstractFactory;

import com.kings.design.creational.factory.AbstractMilk;
import com.kings.design.creational.factory.AbstractPizza;

public interface AbstractFactoryI {
    AbstractPizza createPizza(String type);

    AbstractMilk createMilk(String type);
}


