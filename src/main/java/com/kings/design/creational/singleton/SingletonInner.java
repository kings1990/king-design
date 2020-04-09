package com.kings.design.creational.singleton;

/**
 * <p class="detail">
 * 功能:静态内部类 (可用、推荐)
 * 
 * 静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成对象的实例化。
 * 同时，因为类的静态属性只会在第一次加载类的时候初始化，也就保证了SingletonInstance中的对象只会被实例化一次，并且这个过程也是线程安全的
 * 
 * </p>
 *
 * @author Kings
 * @date 2020.04.09
 */
public class SingletonInner {

    public static class SingletonInnerClass {
        private static  SingletonInner INSTANCE = new SingletonInner();
    }

    public static SingletonInner getInstance(){
        return SingletonInnerClass.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(1);
        SingletonInner.getInstance();
    }
}


