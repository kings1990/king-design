package com.kings.design.behaviour.mediator;

import lombok.Data;

@Data
public abstract class Person {
    protected Meditor meditor;
    private String name;
    
    public Person(String name, Meditor meditor) {
        this.name = name;
        this.meditor = meditor;
    }
}


