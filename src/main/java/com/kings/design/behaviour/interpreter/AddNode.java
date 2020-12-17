package com.kings.design.behaviour.interpreter;

public class AddNode extends SymbolNode {
    
    public AddNode(Node left, Node right) {
        super(left, right);
    }
    
    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}


