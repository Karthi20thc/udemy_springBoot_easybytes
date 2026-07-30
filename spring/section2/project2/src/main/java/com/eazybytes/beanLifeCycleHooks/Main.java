package com.eazybytes.beanLifeCycleHooks;

import com.eazybytes.beanLifeCycleHooks.beans.Vehicle;
import com.eazybytes.beanLifeCycleHooks.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(Config.class);

        var veh =  context.getBean(Vehicle.class);

        System.out.println(veh.getName());

        // Refer vehicle Bean
        context.close();
    }
}
