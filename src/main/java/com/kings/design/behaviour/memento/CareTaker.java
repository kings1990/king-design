package com.kings.design.behaviour.memento;

//传递备忘录，能够保存备忘录，但不能操作和访问
public class CareTaker {
    private Memento memento;
    
    public Memento getMemento() {
        return memento;
    }
    
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}


