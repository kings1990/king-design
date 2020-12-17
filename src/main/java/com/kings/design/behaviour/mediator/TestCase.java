package com.kings.design.behaviour.mediator;

public class TestCase {
    public static void main(String[] args) {
        MeditorImpl meditor = new MeditorImpl();
        PersonSeller personSeller = new PersonSeller("老张", meditor);
        PersonBuyer personBuyer = new PersonBuyer("老王", meditor);
        meditor.setPersonSeller(personSeller);
        meditor.setPersonBuyer(personBuyer);
        
        personSeller.contact("我有3套房,我要卖");
        personBuyer.contact("我想买套房结婚生娃");
    }
}


