package com.kings.design.behaviour.mediator;

import lombok.Data;

@Data
public abstract class Person {
    private String name;
    protected Meditor meditor;

    public Person(String name, Meditor meditor) {
        this.name = name;
        this.meditor = meditor;
    }
}


