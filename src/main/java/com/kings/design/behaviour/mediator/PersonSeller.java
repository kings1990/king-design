package com.kings.design.behaviour.mediator;

public class PersonSeller extends Person {

    public PersonSeller(String name, Meditor meditor) {
        super(name, meditor);
    }

    public void contact(String message) {
        meditor.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("我是房主我叫" + getName() + "接收了您的信息：" + message);
    }
}


