package com.kings.design.structure.proxy.staticmod;


public class Test {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        proxy.save();
    }
}
