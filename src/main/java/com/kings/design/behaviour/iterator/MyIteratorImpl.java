package com.kings.design.behaviour.iterator;

public class MyIteratorImpl implements MyIterator {
    Container container;
    int index;
    int size;
    
    public MyIteratorImpl(Container container) {
        this.container = container;
    }
    
    @Override
    public Object next() {
        return container.get(index++);
    }
    
    @Override
    public boolean hasNext() {
        return index < container.size();
    }
}


