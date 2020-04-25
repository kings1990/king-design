package com.kings.design.behaviour.interpreter;

public class MultiplyNode extends SymbolNode {

    public MultiplyNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}


