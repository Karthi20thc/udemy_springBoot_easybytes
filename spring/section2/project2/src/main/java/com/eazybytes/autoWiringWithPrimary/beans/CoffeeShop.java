package com.eazybytes.autoWiringWithPrimary.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
* 1. since we made a dependency field Coffee we need to add Constructor
* 2. for fields with final keywords you cant create setter method
* 3. we are not using @Autowired because we have only single constructor at this time.*/

@Component
public class CoffeeShop {

    // making Coffee as dependency
    private final Coffee coffee;

    public Coffee getCoffee() {
        return coffee;
    }

    // refer 1
    //@Autowired refer 3
    public CoffeeShop(Coffee coffee) {
        this.coffee = coffee;
    }




}
