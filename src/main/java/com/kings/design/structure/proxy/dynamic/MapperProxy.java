package com.kings.design.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MapperProxy implements InvocationHandler {
    private Class cls;

    public MapperProxy(Class cls) {
        this.cls = cls;
    }

    public Class getCls() {
        return cls;
    }

    public void setCls(Class cls) {
        this.cls = cls;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("处理开始...");
        //执行目标对象方法
        Object result = commonExecute(method,args);
        System.out.println("处理结束...");
        return result;
    }
    
    public Object commonExecute(Method method,Object [] args){
        System.out.println("处理xxx");
        System.out.println(args);
        return null;
    }
}


