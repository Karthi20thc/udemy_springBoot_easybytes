package com.eazybytes.autoWiringWithPrimary.beans;

import com.eazybytes.autoWiringWithPrimary.beans.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiringWithPrimary {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var coffeeShopBean = context.getBean(CoffeeShop.class);

        Coffee coffee = coffeeShopBean.getCoffee();
        System.out.println(coffee);

    }
}
