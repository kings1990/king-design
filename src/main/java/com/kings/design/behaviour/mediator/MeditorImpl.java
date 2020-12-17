package com.kings.design.behaviour.mediator;

public class MeditorImpl extends Meditor {
    
    public PersonSeller personSeller;
    public PersonBuyer personBuyer;
    
    @Override
    public void contact(String message, Person person) {
        if (person == personSeller) {
            personBuyer.getMessage(message);
        } else {
            personSeller.getMessage(message);
        }
    }
    
    public void setPersonSeller(PersonSeller personSeller) {
        this.personSeller = personSeller;
    }
    
    public void setPersonBuyer(PersonBuyer personBuyer) {
        this.personBuyer = personBuyer;
    }
    
    
}


