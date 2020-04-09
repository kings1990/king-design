package com.kings.design.creational.factory;


/**
 * <p class="detail">
 * 功能:抽象披萨
 * </p>
 *
 * @author Kings
 * @date 2020.04.08
 */
public abstract class AbstractPizza {

    /**
     * <p class="detail">
     * 功能:准备
     * </p>
     *
     * @author Kings
     * @date 2020.04.08
     */
    public abstract void prepare();

    /**
     * <p class="detail">
     * 功能:制作
     * </p>
     *
     * @author Kings
     * @date 2020.04.08
     */
    public abstract void make();

    /**
     * <p class="detail">
     * 功能:完成
     * </p>
     *
     * @author Kings
     * @date 2020.04.08
     */
    public abstract void complete();
}


