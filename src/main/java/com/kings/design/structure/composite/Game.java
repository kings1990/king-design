package com.kings.design.structure.composite;

import lombok.Data;

@Data
public abstract class Game {
    private String name;
    
    public Game(String name){
        this.name = name;
    }
    
    public abstract void display();
}


