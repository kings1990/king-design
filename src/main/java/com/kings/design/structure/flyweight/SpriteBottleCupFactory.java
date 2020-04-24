package com.kings.design.structure.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SpriteBottleCupFactory {
    private static Map<String,SpriteBottleCup> pool = new ConcurrentHashMap<>();
    
    public static SpriteBottleCup getCup(String color,SpriteBottleCup spriteBottleCup){
        if(pool.get(color) != null){
            return pool.get(color);
        }
        
        SpriteBottleCup cup = new ActivitySpriteBottleCup(color,spriteBottleCup);
        //ConcurrentHashMap 不允许put null
        if(spriteBottleCup != null){
            pool.put(color,spriteBottleCup);    
        }
        return cup;
    }
}


