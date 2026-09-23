```java
## 1
public interface Coffee {

    // abstract method
    String makeCoffee();

}

## 2
public class Cappuccino implements Coffee{

    @Override
    public String makeCoffee() {
        return "Cappuccino coffee";
    }
}

## 3

public class Espresso implements Coffee{
    @Override
    public String makeCoffee() {
        return "Espresso coffee";
    }
}


## 4

public class CoffeeShop {

    // making Coffee as dependency
    private final Coffee coffee;

}

## 5

public class CoffeeShop {

    // making Coffee as dependency
    private final Coffee coffee;

    public CoffeeShop(Coffee coffee) {
        this.coffee = coffee;
    }

}

## 6

@Component
public class CoffeeShop {

    // making Coffee as dependency
    private final Coffee coffee;

    public CoffeeShop(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }

}

## 2->7
@Component
public class Cappuccino implements Coffee{

    @Override
    public String makeCoffee() {
        return "Cappuccino coffee";
    }
}

## 3->8
@Component
public class Espresso implements Coffee{
    @Override
    public String makeCoffee() {
        return "Espresso coffee";
    }
}

## 6->9
// 1. By looking at the constructor injection, it will try to inject the bean that implements the coffee interface, but it is going to find two beans inside the spring context and with that, it is going to have the ambiguity and due to this ambiguity, the auto wiring is going to fail and the framework is going to throw an exception.

    // we also did not mention @Autowired on top of the constructor because we have a single constructor inside the class, this is completely optional

@Component
public class CoffeeShop {

    // making Coffee as dependency
    private final Coffee coffee;

    // 1
    public CoffeeShop(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }    

}

## 10 // package config-> Class ProjectConfig

@Configuration
@ComponentScan(basePackages = {"autoWiringWithPrimary"})
public class ProjectConfig {
}