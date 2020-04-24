package com.kings.design.structure.flyweight;

public class ActivitySpriteBottleCup implements SpriteBottleCup{
    String color;
    SpriteBottleCup spriteBottleCup;

    public ActivitySpriteBottleCup(String color, SpriteBottleCup spriteBottleCup) {
        this.color = color;
        this.spriteBottleCup = spriteBottleCup;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getQrCode(String difference) {
        if(spriteBottleCup == null){
            return "活动结束";
        }
        return spriteBottleCup.getQrCode(difference);
    }
}


