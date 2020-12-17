package com.kings.design.behaviour.commond;

//代表计算器的按钮
public class Invoker {
    CommondInterface commondInterface;
    
    public void setCommondInterface(CommondInterface commondInterface) {
        this.commondInterface = commondInterface;
    }
    
    public void compute(int value) {
        int i = commondInterface.execute(value);
        System.out.println("计算成功，结果是：" + i);
    }
    
    public void undo() {
        int i = commondInterface.reset();
        System.out.println("撤销成功，结果是：" + i);
    }
}


