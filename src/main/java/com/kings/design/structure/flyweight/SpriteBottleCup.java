package com.kings.design.structure.flyweight;

/**
 * <p class="detail">
 * 功能:抽象享元类
 * </p>
 *
 * @author Kings
 * @date 2020.04.23
 */
public interface SpriteBottleCup {

    /**
     * <p class="detail">
     * 功能:内部状态
     * </p>
     *
     * @return string color
     * @author Kings
     * @date 2020.04.23
     */
    String getColor();

    /**
     * <p class="detail">
     * 功能:外部状态
     * </p>
     *
     * @param difference :
     * @return string
     * @author Kings
     * @date 2020.04.23
     */
    String getQrCode(String difference);
}

    