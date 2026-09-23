package com.eazybytes.demo.config;

import com.eazybytes.demo.mybeans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    // method
    @Bean
    Vehicle primaryVehicle(){
        // This is the class from another package
        var veh = new Vehicle();
        // System.out.println(this.getClass().getSimpleName());
        veh.setName("Hyundai" + " " + this.getClass().getSimpleName());

        // we are returning java object
        return veh;
    }

    @Bean
    String hello(){
        return "hello world";
    }

    @Bean
    Integer luckyNumber(){
        return 14;
    }
}
