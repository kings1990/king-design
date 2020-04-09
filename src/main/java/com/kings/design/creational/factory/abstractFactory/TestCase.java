package com.kings.design.creational.factory.abstractFactory;

public class TestCase {
    public static void consumer(String foodType,String pizzaType,String typeMilk,String type){
        if("pizza".equals(foodType)){
            if("cold".equals(type)){
                if("Vege".equals(pizzaType)){
                    ColdFoodFactory cff = new ColdFoodFactory();
                    cff.createPizza(pizzaType);
                }    
            }
        }
    }
    
    public static void main(String[] args) {
        consumer("pizza","Vege",null,"cold");
    }
}


