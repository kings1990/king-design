package com.kings.design.creational.factory.simple;

import com.kings.design.creational.factory.AbstractPizza;
import com.kings.design.creational.factory.BeefPizza;
import com.kings.design.creational.factory.VeggPizza;

/**
 * <p class="detail">
 * 功能:披萨工厂
 * 如果程序稳定再加入一个新店需要新增pizzao种类
 * 此时我们应该修改Factory,但是修改的话会影响其他的分店，这就是简单工程模式的瓶颈
 * </p>
 *
 * @author Kings
 * @date 2020.04.08
 */
public class SimplePizzaFactory {
    /**
     * <p class="detail">
     * 功能:创建披萨对象
     * </p>
     *
     * @param type :
     * @return abstract pizza
     * @author Kings
     * @date 2020.04.08
     */
    public AbstractPizza createPizza(String type) {
        if ("Vege".equals(type)) {
            return new VeggPizza();
        } else if ("Beef".equals(type)) {
            return new BeefPizza();
        } else {
            return null;
        }
    }
}


