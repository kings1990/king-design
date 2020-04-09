package com.kings.design.creational.singleton;

/**
 * <p class="detail">
 * 功能:双重检查懒汉式 (可用，推荐)
 * 
 * getInstance()加了锁的处理，保证了同一时刻只能有一个线程访问并获得实例，
 * 但是缺点也很明显，因为synchronized是修饰整个方法，每个线程访问都要进行同步，
 * 而其实这个方法只执行一次实例化代码就够了，每次都同步方法显然效率低下，
 * 为了改进这种写法，就有了下面的双重检查懒汉式。
 * 
 * synchronized针对静态方法->锁[该类的字节码对象]
 * </p>
 *
 * @author Kings
 * @date 2020.04.09
 */
public class SingletonLanhanSyncDoubleCheck {
    private static volatile SingletonLanhanSyncDoubleCheck INSTANCE = new SingletonLanhanSyncDoubleCheck();

    public SingletonLanhanSyncDoubleCheck() {
    }

    public static SingletonLanhanSyncDoubleCheck getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonLanhanSyncDoubleCheck.class){
                if(INSTANCE == null){
                    INSTANCE =  new SingletonLanhanSyncDoubleCheck();    
                }
            }
        }
        return INSTANCE;
    }
}


