package com.eazybytes.autoWiringWithPrimary.beans;


/*
* 1. Since we are implements Coffee we have to overwite Coffee methods*/

import org.springframework.stereotype.Component;

@Component
public class Cappuccino implements Coffee{

    @Override
    public String makeCoffee() {
        return "Cappuccino coffee";
    }
}
