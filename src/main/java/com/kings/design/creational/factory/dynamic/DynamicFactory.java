package com.kings.design.creational.factory.dynamic;

import com.kings.design.creational.factory.AbstractPizza;

public interface DynamicFactory {
    AbstractPizza createPizza(String type);
}

    