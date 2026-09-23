package com.eazybytes.methodBasedWiring;

import com.eazybytes.methodBasedWiring.beans.Car;
import com.eazybytes.methodBasedWiring.beans.Engine;
import com.eazybytes.methodBasedWiring.beans.Person;
import com.eazybytes.methodBasedWiring.beans.Vehicle;
import com.eazybytes.methodBasedWiring.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MethodBasedWiring {
    static void main() {
        var context = new AnnotationConfigApplicationContext(Config.class);

        // getting vehicle bean object and person bean object
        var veh =  context.getBean(Vehicle.class);
        var person =  context.getBean(Person.class);


        System.out.println(veh.getName());
        // This result is coming from the toString method inside vehicle class
        System.out.println(person.getVehicle());



        // Auto-wiring
        var car =  context.getBean(Car.class);
        var engine =  context.getBean(Engine.class);


        System.out.println(car.getName());
        System.out.println(car.getEngine());
        System.out.println(engine.getName());

        // Refer vehicle Bean
        context.close();
    }
}
