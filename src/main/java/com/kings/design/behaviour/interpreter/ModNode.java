package com.kings.design.behaviour.interpreter;

public class ModNode extends SymbolNode {
    
    public ModNode(Node left, Node right) {
        super(left, right);
    }
    
    @Override
    public int interpret() {
        return left.interpret() % right.interpret();
    }
}


