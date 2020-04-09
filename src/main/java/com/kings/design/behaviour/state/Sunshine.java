package com.kings.design.behaviour.state;

class Sunshine implements State {
    
    @Override
    public String getState() {
        return "晴天";
    }
}

class Rain implements State {
    
    @Override
    public String getState() {
        return "下雨";
    }
    
}