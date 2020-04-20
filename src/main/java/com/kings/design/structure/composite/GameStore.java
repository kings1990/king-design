package com.kings.design.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class GameStore extends Game {

    private List<Game> gameList;


    public GameStore(String name) {
        super(name);
        gameList = new ArrayList<>();
    }

    public void add(Game game) {
        gameList.add(game);
    }

    @Override
    public void display() {
        System.out.println("--------" + getName());
        for (Game game : gameList) {
            game.display();
        }
    }


}


