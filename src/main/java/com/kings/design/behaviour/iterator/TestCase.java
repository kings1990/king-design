package com.kings.design.behaviour.iterator;

public class TestCase {
    public static void main(String[] args) {
        Container container = new ContainerImpl();
        container.add("1");
        container.add("2");
        container.add("3");
        container.add("4");
        
        MyIterator iterator = container.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


