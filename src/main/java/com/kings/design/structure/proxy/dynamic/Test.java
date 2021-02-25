package com.kings.design.structure.proxy.dynamic;


import com.kings.design.structure.proxy.TestMapper;
import com.kings.design.structure.proxy.UserService;
import com.kings.design.structure.proxy.UserServiceImpl;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        UserService userService = new UserServiceImpl();
        ((UserService) new ProxyFactory(userService).getProxyInstance()).save();

        MapperProxy mapperProxy = new MapperProxy(TestMapper.class);
        ((TestMapper)Proxy.newProxyInstance(mapperProxy.getClass().getClassLoader(), new Class[] { mapperProxy.getCls() }, mapperProxy)).selectXyz();
        
    }
}
