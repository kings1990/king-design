package com.kings.design.behaviour.interpreter;

//终结解释器
public class ValueNode implements Node {
    int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}


