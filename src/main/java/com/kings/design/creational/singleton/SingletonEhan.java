package com.kings.design.creational.singleton;

/**
 * <p class="detail">
 * 功能:同步方法的懒汉式 (可用)
 * 
 * 在类加载的时候就完成了实例化，避免了多线程的同步问题。当然缺点也是有的，
 * 因为类加载时就实例化了，没有达到Lazy Loading (懒加载) 的效果，如果该实例没被使用，内存就浪费了
 * </p>
 *
 * @author Kings
 * @date 2020.04.09
 */
public class SingletonEhan {
    private static final SingletonEhan INSTANCE = new SingletonEhan();

    public SingletonEhan() {
    }

    public static synchronized SingletonEhan getInstance(){
        return INSTANCE;
    }
}


