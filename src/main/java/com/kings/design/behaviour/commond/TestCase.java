package com.kings.design.behaviour.commond;

public class TestCase {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        CommondInterface addCommond = new AddCommond();
        invoker.setCommondInterface(addCommond);
        invoker.compute(1);
        invoker.compute(2);
        invoker.compute(3);
        invoker.compute(4);
        invoker.undo();
        

        CommondInterface multiplyCommond = new MultiplyCommond();
        invoker.setCommondInterface(multiplyCommond);
        invoker.compute(10);
        invoker.undo();
    }
}


