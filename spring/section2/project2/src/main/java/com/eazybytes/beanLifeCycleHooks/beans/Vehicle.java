package com.eazybytes.beanLifeCycleHooks.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/*
1. How to populate data into the bean that is created by @Component ?
    Inside the class we need to create a method initilize, we can write logic to populate data into Vehicle
    Bean object, but to make this work we need to tell spring framework to invoke this method, once the bean
    is created or once the object of Vehicle (class) is created.

    1.1. How to invoke initilize method, once bean is created?
        use annotation @PostConstruct from jakarta annoation api.

    1.2 why name @PostConstruct?
        once bean is crated, then only initilize will be inovoked by the framework.



2. If we dont want to use @PostConstrt, spring provides another alternative.
    Adopt and satisfy the contract of an interface InitializingBean.

    Enforces a Contract: The compiler forces the class to override all abstract methods afterPropertiesSet()
    of the interface, or else the class itself must be declared abstract.

3. We have flexibility to inoveke our bussiness logic before the bean is getting destroyed.
    use annotation @PreDestroy on your method destroy.

    3.1 To Test this use context.close() at the end of your Main class.

4. In case if you dont want to use @PreDestroy.
    use Interface DisposableBean and implement abstract method destroy():void

*/

@Component
public class Vehicle implements InitializingBean, DisposableBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

// 1

//    @PostConstruct
//    public void initilize(){
//        this.setName("audi");
//    }


// 2
    @Override
    public void afterPropertiesSet() throws Exception {
        this.name = "Tesla";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying vehicle Bean");
    }

//    @PreDestroy
//    public void destroy(){
//        System.out.println("Destroying vehicle Bean");
//    }
}
