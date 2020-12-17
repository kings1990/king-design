package com.kings.design.behaviour.strategy;

public class Room {
    private double price;
    private Card card;
    
    public void setCard(Card card) {
        this.card = card;
    }
    
    public double getPrice() {
        if (card == null) {
            return price;
        }
        return card.discount(price);
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}


