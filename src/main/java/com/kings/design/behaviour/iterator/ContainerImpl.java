package com.kings.design.behaviour.iterator;

/**
 * <p class="detail">
 * 功能:
 * </p>
 *
 * @author Kings
 * @date 2020.04.27
 */
public class ContainerImpl implements Container {
    /**
     * Array.
     */
    Object[] array;
    /**
     * Index.
     */
    int index;

    /**
     * Instantiates a new Container.
     */
    public ContainerImpl() {
        array = new Object[100];
    }

    @Override
    public void add(Object obj) {
        array[index++] = obj;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public MyIterator iterator() {
        return new MyIteratorImpl(this);
    }
}


