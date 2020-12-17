package com.kings.design.structure.decorate;

public class CakeImpl implements Cake {
    @Override
    public String name() {
        return "普通蛋糕";
    }
    
    @Override
    public Double price() {
        return 5.0;
    }
}


