package com.kings.design.structure.proxy.cglib;


import com.kings.design.structure.proxy.UserService;
import com.kings.design.structure.proxy.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserService proxy = (UserService)new ProxyFactory(userService).getProxyInstance();
        
        proxy.save();
    }
}
