package com.kings.design.behaviour.interpreter;

//非终结解释器,需要关联node 2*3 分为左和右node
public abstract class SymbolNode implements Node {
    Node left;
    Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}


