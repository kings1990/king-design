package com.kings.design.structure.composite;

public class Wzry  extends Game{

    public Wzry(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("游戏名称:" + getName());
    }
}


