package com.kings.design.structure.composite;

public class Lol extends Game{

    public Lol(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("游戏名称:" + getName());
    }
}


