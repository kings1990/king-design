package com.kings.design.behaviour.commond;

/**
 * <p class="detail">
 * 功能:抽象命令
 * 1.使用interface中加入变量是不符合开发规范的我们的interface中只允许存放抽象的公开放啊
 * 2.抽象类允许放成员变量，允许非抽象放啊
 * 3.static 直接为Receive定义了静态存储空间
 * </p>
 * @author Kings
 * @date 2020.04.25
 */
public abstract class CommondInterface {
    //必须加static(单例)
    static Receive receive = new Receive();
    
    int value;
    
    /**
     * <p class="detail">
     * 功能:执行
     * </p>
     * @param i :
     *
     * @return int
     * @author Kings
     * @date 2020.04.25
     */
    public abstract int execute(int i);
    
    /**
     * <p class="detail">
     * 功能:撤销
     * </p>
     * @return int
     * @author Kings
     * @date 2020.04.25
     */
    public abstract int reset();
}

    