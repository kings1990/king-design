package com.kings.design.creational.singleton;

/**
 * <p class="detail">
 * 功能:普通懒汉式(线程不安全，不可用)
 * 
 * 只有在方法第一次被访问时才会实例化，达到了懒加载的效果。
 * 但是这种写法有个致命的问题，就是多线程的安全问题。假设对象还没被实例化，
 * 然后有两个线程同时访问，那么就可能出现多次实例化的结果，所以这种写法不可采用
 * </p>
 *
 * @author Kings
 * @date 2020.04.09
 */
public class SingletonLanhan {
    private static SingletonLanhan INSTANCE;

    public SingletonLanhan() {
    }

    public static SingletonLanhan getInstance(){
        if(INSTANCE == null){
            return new SingletonLanhan();
        }
        return INSTANCE;
    }
}


