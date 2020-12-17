package com.kings.design.structure.decorate;

public class EggCakeDecorate extends CakeDecorate {
    public EggCakeDecorate(Cake cake) {
        super(cake);
    }
    
    @Override
    public String name() {
        return "鸡蛋" + super.name();
    }
    
    @Override
    public Double price() {
        return super.price() + 1.5;
    }
}


