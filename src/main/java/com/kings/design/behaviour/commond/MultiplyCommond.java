package com.kings.design.behaviour.commond;

public class MultiplyCommond extends CommondInterface {
    
    @Override
    public int execute(int value) {
        this.value = value;
        System.out.print("*" + value);
        return receive.multiply(value);
    }
    
    @Override
    public int reset() {
        System.out.print("撤销*" + value);
        return receive.multiply(1) / value;
    }
}


