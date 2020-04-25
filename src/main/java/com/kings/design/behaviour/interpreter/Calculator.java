package com.kings.design.behaviour.interpreter;

import java.util.Stack;

public class Calculator {
    private Node node;
    private String statement;

    public void build(String statement) {
        Node left = null;
        Node right = null;
        //提供环境 存储一些关系
        //node存入stack中存储之前已经确定了表达式的顺序和解释完成的结果
        Stack stack = new Stack();
        String[] statementArray = statement.split(" ");
        for (int i = 0; i < statementArray.length; i++) {
            String s = statementArray[i];
            if ("*".equalsIgnoreCase(s)) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArray[++i]);
                right = new ValueNode(val);
                stack.push(new MultiplyNode(left, right));
            } else if ("+".equalsIgnoreCase(s)) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArray[++i]);
                right = new ValueNode(val);
                stack.push(new AddNode(left, right));
            } else if ("%".equalsIgnoreCase(s)) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArray[++i]);
                right = new ValueNode(val);
                stack.push(new ModNode(left, right));
            } else {
                stack.push(new ValueNode(Integer.parseInt(s)));
            }
        }
        //这个node包含了所有的数字以及符号
        this.node = (Node) stack.pop();
    }
    
    public int compute(){
        return node.interpret();
    }

}


