package com.kings.design.structure.composite;

public class Cs extends Game {


    public Cs(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("游戏名称:" + getName());
    }
}


