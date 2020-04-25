package com.kings.design.behaviour.commond;

//接受命令、对命令进行执行
public class Receive {

    private int num = 0;

    public int add(int value) {
        num += value;
        return num;
    }

    public int multiply(int value) {
        num *= value;
        return num;
    }
}


