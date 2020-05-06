package com.kings.design.behaviour.observer;

public interface Subject {
    //注册观察者
    void register(Observe observe);

    //移除观察者
    void remove(Observe observe);

    //通知观察者
    void nodify();

}

    