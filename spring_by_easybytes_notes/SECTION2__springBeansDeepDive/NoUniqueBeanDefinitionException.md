**Prompt [ What is NoUniqueBeanDefinitionException ? give... | Try in Copilot Chat](https://m365.cloud.microsoft/chat/entity1-d870f6cd-4aa5-4d42-9626-ab690c041429/eyJpZCI6IlZYTmxjbFl4ZkdoMGRIQnpPaTh2YzNWaWMzUnlZWFJsTFdsdWRDNXZabVpwWTJVdVkyOXRMM3hQU1VRNlpEQXpabUZoWmpFdE1EVmxOUzAwWTJFM0xXRXdNRGd0T0RjMlpESmxOalEzTkRNM2ZHSXpaR014TURRNUxXUXhNVEV0TkdJNFpDMDVaVGszTFRWa09XSTRNVEl3WkRneE4zd3lNREkyTFRBM0xUSXhWREV4T2pNM09qSXhMalF3TVRNeU56TmEiLCJzY2VuYXJpbyI6InNoYXJlTGlua1ZpYVJpY2hDb3B5IiwicHJvcGVydGllcyI6eyJwcm9tcHRTb3VyY2UiOiJ1c2VyIiwiY2xpY2tUaW1lc3RhbXAiOiIyMDI2LTA3LTIxVDExOjM3OjIxLjU0NloifSwiY2hhdFR5cGUiOiJ3ZWIiLCJ2ZXJzaW9uIjoxLjF9)**
 What is NoUniqueBeanDefinitionException ? give example and how to resolve this
**Response**
# NoUniqueBeanDefinitionException in Spring

`NoUniqueBeanDefinitionException` occurs when Spring finds **more than one bean of the same type**, but it doesn't know which bean to inject.

### In Simple Words

If Spring sees:

> "I need a `Vehicle` bean"

but two beans are available:

* `car`
* `bike`

Spring gets confused and throws:

```java
NoUniqueBeanDefinitionException
```

***

# Example

## Step 1: Create Interface

```java
public interface Vehicle {
    void start();
}
```

***

## Step 2: Create Implementations

```java
@Component
public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car Started");
    }
}
```

```java
@Component
public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Started");
    }
}
```

***

## Step 3: Inject by Type

```java
@Component
public class Driver {

    @Autowired
    private Vehicle vehicle;
}
```

When Spring starts, it finds:

```text
Vehicle
 ├── Car
 └── Bike
```

Now Spring cannot decide which one to inject.

Result:

```text
NoUniqueBeanDefinitionException:
No qualifying bean of type 'Vehicle'
available: expected single matching bean but found 2:
car,bike
```

***

# Why It Happens

Spring performs **dependency injection by type**.

```java
@Autowired
private Vehicle vehicle;
```

Here Spring searches for:

```java
Vehicle
```

But finds:

```java
Car
Bike
```

Since multiple beans match, Spring throws an exception.

***

# How to Resolve It

## 1. Use @Primary (Most Common)

Mark one bean as the default choice.

```java
@Component
@Primary
public class Car implements Vehicle {

}
```

Now:

```java
@Autowired
private Vehicle vehicle;
```

Spring automatically injects:

```java
Car
```

***

## 2. Use @Qualifier

Explicitly tell Spring which bean you want.

### Bean

```java
@Component
public class Car implements Vehicle {
}
```

```java
@Component
public class Bike implements Vehicle {
}
```

### Injection

```java
@Autowired
@Qualifier("car")
private Vehicle vehicle;
```

Spring injects:

```java
Car
```

***

## 3. Constructor Injection with @Qualifier

Recommended approach.

```java
@Component
public class Driver {

    private final Vehicle vehicle;

    public Driver(@Qualifier("car") Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
```

***

## 4. Get Bean by Name

```java
ApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);

Vehicle vehicle =
        context.getBean("car", Vehicle.class);
```

Output:

```java
Car
```

***

# Example Using @Bean

```java
@Configuration
public class AppConfig {

    @Bean
    public Vehicle car() {
        return new Car();
    }

    @Bean
    public Vehicle bike() {
        return new Bike();
    }
}
```

Then:

```java
Vehicle vehicle = context.getBean(Vehicle.class);
```

Throws:

```text
NoUniqueBeanDefinitionException
```

Because:

```text
car
bike
```

both are of type `Vehicle`.

***

# Fix with @Primary

```java
@Bean
@Primary
public Vehicle car() {
    return new Car();
}
```

Now:

```java
Vehicle vehicle = context.getBean(Vehicle.class);
```

returns:

```java
Car
```

***

# Interview Answer

> `NoUniqueBeanDefinitionException` is thrown when Spring finds multiple beans of the same type and cannot determine which one should be injected. It commonly occurs during autowiring by type. We can resolve it using `@Primary`, `@Qualifier`, or by explicitly retrieving the bean by name.\`

### Quick Example

```java
@Autowired
private Vehicle vehicle;
```

Available beans:

```java
Car
Bike
```

Result:

```text
NoUniqueBeanDefinitionException
```

Fix:

```java
@Autowired
@Qualifier("car")
private Vehicle vehicle;
```

or

```java
@Primary
public class Car implements Vehicle {
}
```
