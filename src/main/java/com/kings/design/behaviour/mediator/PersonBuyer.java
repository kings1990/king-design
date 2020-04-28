package com.kings.design.behaviour.mediator;

public class PersonBuyer extends Person {

    public PersonBuyer(String name, Meditor meditor) {
        super(name, meditor);
    }

    public void contact(String message) {
        meditor.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("我是买房的我叫" + getName() + "接收了您的信息：" + message);
    }
}


