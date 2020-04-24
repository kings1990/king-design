package com.kings.design.structure.proxy.staticmod;


import com.kings.design.structure.proxy.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        proxy.save();
    }
}
