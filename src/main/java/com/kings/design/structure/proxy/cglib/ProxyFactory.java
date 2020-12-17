package com.kings.design.structure.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib子类代理工厂
 * 对UserDao在内存中动态构建一个子类对象
 */
public class ProxyFactory implements MethodInterceptor {
    //维护目标对象
    private final Object target;
    
    public ProxyFactory(Object target) {
        this.target = target;
    }
    
    //给目标对象创建一个代理对象
    Object getProxyInstance() {
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();
        
    }
    
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("开始事务...");
        
        //执行目标对象的方法
        Object returnValue = method.invoke(target, args);
        
        System.out.println("提交事务...");
        
        return returnValue;
    }
}