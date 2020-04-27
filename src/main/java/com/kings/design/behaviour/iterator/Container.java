package com.kings.design.behaviour.iterator;

public interface Container {
    void add(Object obj);

    Object get(int index);

    int size();

    MyIterator iterator();
}

    