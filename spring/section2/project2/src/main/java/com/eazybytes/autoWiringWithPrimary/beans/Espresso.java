package com.eazybytes.autoWiringWithPrimary.beans;


import org.springframework.stereotype.Component;

@Component
public class Espresso implements Coffee{
    @Override
    public String makeCoffee() {
        return "Espresso coffee";
    }
}
