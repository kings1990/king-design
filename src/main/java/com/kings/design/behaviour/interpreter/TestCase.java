package com.kings.design.behaviour.interpreter;

public class TestCase {
    public static void main(String[] args) {
        String statement = "3 * 2 + 4 % 7";
        Calculator c = new Calculator();
        c.build(statement);
        System.out.println(statement + " = " + c.compute());
    }
}


