package com.kings.design.structure.proxy.staticmod;


import com.kings.design.structure.proxy.UserService;

public class UserServiceProxy implements UserService {
    
    private UserService userService;
    
    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }
    
    @Override
    public void save() {
        System.out.println("开始事务...");
        userService.save();//执行目标对象的方法
        System.out.println("提交事务...");
    }
}
