package com.kings.design.behaviour.state;

//定义和Context中的状态相对应的行为
public interface State {
    //获取天气情况
    String getState();
}