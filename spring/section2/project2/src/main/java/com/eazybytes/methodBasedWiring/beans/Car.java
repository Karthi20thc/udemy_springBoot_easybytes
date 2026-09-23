package com.eazybytes.methodBasedWiring.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
1. we have field engine of type Engine, above that we need to @Autowired. This is called Field
    Injection.
2. Don't forget - go to config and add in ComponentScan
3. If you mention @Autowired on top of setter() method, then is called as Setter Injection.

4. what are the drawbacks of field and setter injection,
    1. unit testing is tougher.
    2. cant mark dependency field (Engine) as final keyword.
    3. readability of code is reduced.

5. Constructor Injection
    5.1. By startup of App, spring will create bean of car by invoking the constructor.
    5.2. while invoking car, it has dependency Engine bean, so it will make sure to create Engine
        bean before car bean
    5.3. Engine bean is created first, followed by car bean.
    5.4. If your class Car has only single constructor, then mentioned @Autowired is completely
        optional.

        Advantages:
            5.4.1. we can use final keyword on field. since Engine bean is created first, then car
                bean, so we should be able to create the immutable Car Object. No one should
                able to change the engine dependency once the Car bean is created, we can simple
                make the field as final. If you want to overwrite this dependency, make it a non-final
                (just remove the final keyword.)

    5.5. Imagine Engine bean is not avaliable (comment @Component in Engine class), once we run bean
        of Car will not created, beacuse for Car bean required dependency for wiring Engine is not
        avaliable.

    5.6. A final field can be assigned only once, so commented this.engine = engine in setEngine

6. unsatisifiedDependencyException
        The problem of circular dependency.

*/

@Component
public class Car {

    private String name;

    // @Autowired // Refer point 1
    private final Engine engine; // refer 4.1



    // public Car() {
    //     System.out.println("Car Bean created");
    // }


    @Autowired   // Refer point 5
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Car Bean created");
    }


    // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }


    // @Autowired // refer 3.
    public void setEngine(Engine engine) {
        // this.engine = engine; // refer point 5.6
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void initilize(){
        this.name = "Kia";
    }


}
