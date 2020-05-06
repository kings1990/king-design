package com.kings.design.behaviour.strategy;

public class TestCase {
    public static void main(String[] args) {
        Room room = new Room();
        room.setPrice(100);
        room.setCard(new StudentCard());
        System.out.println(room.getPrice());

        room.setCard(new VipCard());
        System.out.println(room.getPrice());
    }
}


