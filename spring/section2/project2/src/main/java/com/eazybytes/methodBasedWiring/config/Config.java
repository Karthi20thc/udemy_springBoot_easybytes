package com.eazybytes.methodBasedWiring.config;

import com.eazybytes.methodBasedWiring.beans.Person;
import com.eazybytes.methodBasedWiring.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
1. From below vehicle bean and person bean, there is no wiring between the two beans inside
    the spring context. They are maintained two different independent beans

2. Here Beans will be created in independent manner. No dependency b/w them.
    2.1 To establish dependency b/w them using wiring concept.

3.  we are not directly invoking the vehicle() method, which will give bean of the vehicle, Instead
    spring framework will invoke vehicle() method and inject that vehicle bean as dependency to person
    method.

4. to confrim the order of bean creation use sout() inside the constructor into vehicle class and
   person class.

*/

@Configuration
@ComponentScan(basePackages = {"com.eazybytes.methodBasedWiring.beans"})
public class Config {


    // 1. creating vehicle bean
    @Bean
    Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    // 2. creating person bean
//    @Bean
//    Person person(){
//        Person person = new Person();
//        person.setName("Lucy");
//        // 2.1 wiring by method invoking
//        person.setVehicle(veh());
//        return person;
//    }

    // 3. wiring by method input paramater

    @Bean
    Person person(Vehicle vehicle){
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle);
        return person;
    }
}
