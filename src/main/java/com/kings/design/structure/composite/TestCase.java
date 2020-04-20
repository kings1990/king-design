package com.kings.design.structure.composite;

public class TestCase {
    public static void main(String[] args) {
        GameStore all = new GameStore("所有游戏");
        Cs cs = new Cs("cs");
        GameStore gameStoreJj = new GameStore("竞技类游戏");
        Lol lol = new Lol("撸啊撸");
        Wzry wzry = new Wzry("王者荣耀");
        gameStoreJj.add(lol);
        gameStoreJj.add(wzry);

        all.add(cs);
        all.add(gameStoreJj);
        
        
        all.display();
        System.out.println();
        System.out.println("=============================");
        System.out.println();
        gameStoreJj.display();
    }
}


