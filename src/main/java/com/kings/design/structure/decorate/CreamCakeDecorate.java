package com.kings.design.structure.decorate;

public class CreamCakeDecorate extends CakeDecorate {
    public CreamCakeDecorate(Cake cake) {
        super(cake);
    }

    @Override
    public String name() {
        return "奶油" + super.name();
    }

    @Override
    public Double price() {
        return super.price() + 2.0;
    }
}


