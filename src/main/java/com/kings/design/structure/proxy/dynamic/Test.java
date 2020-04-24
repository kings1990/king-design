package com.kings.design.structure.proxy.dynamic;


import com.kings.design.structure.proxy.UserService;
import com.kings.design.structure.proxy.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ((UserService) new ProxyFactory(userService).getProxyInstance()).save();
    }
}
