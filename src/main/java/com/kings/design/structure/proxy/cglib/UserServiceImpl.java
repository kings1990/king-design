package com.kings.design.structure.proxy.cglib;

import com.kings.design.structure.proxy.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("save user");
    }
}
