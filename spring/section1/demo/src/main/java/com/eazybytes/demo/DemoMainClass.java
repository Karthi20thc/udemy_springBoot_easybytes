package com.eazybytes.demo;

import com.eazybytes.demo.config.ProjectConfig;
import com.eazybytes.demo.mybeans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainClass {
    static void main() {
        System.out.println("Hello world");
        
        // creating manual java objects.
        Vehicle vehi = new Vehicle();
        vehi.setName("BMW");

        // wrong
        // System.out.println(vehi);

        // correct
        System.out.println("vehicle from non-spring context " + vehi.getName());

        // Initilize spring container---------------------------------------------------------------------------------

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh =   context.getBean(Vehicle.class);

        System.out.println(veh.getName());

        // using bean name instead of className
        var veh2 =  (Vehicle) context.getBean("primaryVehicle");
        System.out.println(veh2.getName());


    }


}
