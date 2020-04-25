package com.kings.design.behaviour.commond;

public class AddCommond extends CommondInterface {
    private int value;

    @Override
    public int execute(int value) {
        this.value = value;
        System.out.print("+" + value);
        return receive.add(value);
    }

    @Override
    public int reset() {
        System.out.print("撤销+" + value);
        return receive.add(-value);
    }
}


