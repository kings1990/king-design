package com.kings.design.behaviour.memento;

import lombok.Data;

@Data
public class Memento {
    private int blood;
    private int magic;

    public Memento(int blood, int magic) {
        this.blood = blood;
        this.magic = magic;
    }
    
    
    
}


