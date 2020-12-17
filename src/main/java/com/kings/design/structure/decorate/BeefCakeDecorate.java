package com.kings.design.structure.decorate;

public class BeefCakeDecorate extends CakeDecorate {
    public BeefCakeDecorate(Cake cake) {
        super(cake);
    }
    
    @Override
    public String name() {
        return "牛肉" + super.name();
    }
    
    @Override
    public Double price() {
        return super.price() + 5;
    }
}


