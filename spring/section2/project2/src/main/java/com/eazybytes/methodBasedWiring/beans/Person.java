package com.eazybytes.methodBasedWiring.beans;

public class Person {

    public Person() {
        System.out.println("person bean created");
    }

    private String name;
    // we are using Vehicle class as dependency.
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
