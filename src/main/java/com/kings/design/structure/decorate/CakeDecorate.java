package com.kings.design.structure.decorate;

public class CakeDecorate implements Cake {
    Cake cake;
    
    public CakeDecorate(Cake cake) {
        this.cake = cake;
    }
    
    @Override
    public String name() {
        return cake.name();
    }
    
    @Override
    public Double price() {
        return cake.price();
    }
}


