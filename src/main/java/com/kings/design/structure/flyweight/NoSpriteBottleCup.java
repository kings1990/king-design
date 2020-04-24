package com.kings.design.structure.flyweight;


/**
 * <p class="detail">
 * 功能:非共享对象
 * </p>
 *
 * @author Kings
 * @date 2020.04.23
 */
public class NoSpriteBottleCup implements SpriteBottleCup{
    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String getQrCode(String difference) {
        return difference + "制作完成";
    }
}


