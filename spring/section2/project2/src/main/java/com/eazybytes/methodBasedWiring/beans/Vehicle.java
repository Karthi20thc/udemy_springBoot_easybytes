package com.eazybytes.methodBasedWiring.beans;

/*

1. toString will be used to display the content of the Vehicle object

*/


public class Vehicle  {


    public Vehicle() {
        System.out.println("vehicle bean created");
    }

    private String name;

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
