**Prompt [what is @Primary in spring explain and give ex | Try in Copilot Chat](https://m365.cloud.microsoft/chat/entity1-d870f6cd-4aa5-4d42-9626-ab690c041429/eyJpZCI6IlZYTmxjbFl4ZkdoMGRIQnpPaTh2YzNWaWMzUnlZWFJsTFdsdWRDNXZabVpwWTJVdVkyOXRMM3hQU1VRNlpEQXpabUZoWmpFdE1EVmxOUzAwWTJFM0xXRXdNRGd0T0RjMlpESmxOalEzTkRNM2ZEZzNaR1JtTnpjNUxXTTBNR0V0TkRaaVpDMDVObVV6TFRrMVpqaGtNakF5TURjeE1Yd3lNREkyTFRBM0xUSXlWREE1T2pBMU9qVTFMakUwTnpNM016SmEiLCJzY2VuYXJpbyI6InNoYXJlTGlua1ZpYVJpY2hDb3B5IiwicHJvcGVydGllcyI6eyJwcm9tcHRTb3VyY2UiOiJ1c2VyIiwiY2xpY2tUaW1lc3RhbXAiOiIyMDI2LTA3LTIyVDA5OjA1OjU1LjI5OFoifSwiY2hhdFR5cGUiOiJ3ZWIiLCJ2ZXJzaW9uIjoxLjF9)**
what is @Primary in spring explain and give ex
**Response**
# `@Primary` in Spring

`@Primary` is used when **multiple beans of the same type exist** and Spring gets confused about which bean to inject.

By marking one bean as `@Primary`, Spring treats it as the **default bean** and injects it automatically when no specific bean is mentioned.

***

# Problem Without `@Primary`

## Multiple Beans of Same Type

```java
@Configuration
public class AppConfig {

    @Bean
    public Vehicle car() {
        return new Vehicle("Car");
    }

    @Bean
    public Vehicle bike() {
        return new Vehicle("Bike");
    }
}
```

### Injection

```java
@Autowired
private Vehicle vehicle;
```

### Result

```text
NoUniqueBeanDefinitionException
```

Reason:

* Spring found 2 beans of type `Vehicle`
  * car
  * bike
* Spring doesn't know which one to inject.

***

# Using `@Primary`

```java
@Configuration
public class AppConfig {

    @Bean
    @Primary
    public Vehicle car() {
        return new Vehicle("Car");
    }

    @Bean
    public Vehicle bike() {
        return new Vehicle("Bike");
    }
}
```

### Injection

```java
@Autowired
private Vehicle vehicle;
```

### Result

Spring injects:

```java
Vehicle("Car")
```

because `car()` is marked with `@Primary`.

***

# Complete Example

## Vehicle Class

```java
public class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

## Configuration

```java
@Configuration
public class AppConfig {

    @Bean
    @Primary
    public Vehicle car() {
        return new Vehicle("Car");
    }

    @Bean
    public Vehicle bike() {
        return new Vehicle("Bike");
    }
}
```

## Main Class

```java
AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);

Vehicle vehicle = context.getBean(Vehicle.class);

System.out.println(vehicle.getName());
```

### Output

```text
Car
```

***

# `@Primary` vs `@Qualifier`

## Using `@Primary`

```java
@Bean
@Primary
public Vehicle car() {
    return new Vehicle("Car");
}
```

```java
@Autowired
private Vehicle vehicle;
```

Spring injects the primary bean automatically.

***

## Using `@Qualifier`

```java
@Autowired
@Qualifier("bike")
private Vehicle vehicle;
```

Spring injects the specific bean:

```text
Bike
```

even though `car` is marked as `@Primary`.

***

# Priority Order

Spring resolves beans in this order:

### 1. `@Qualifier` ✅ Highest Priority

```java
@Autowired
@Qualifier("bike")
private Vehicle vehicle;
```

### 2. `@Primary`

```java
@Bean
@Primary
public Vehicle car() {
    return new Vehicle("Car");
}
```

### 3. Exception

If neither helps and multiple beans exist:

```text
NoUniqueBeanDefinitionException
```

***

# When to Use `@Primary`

Use `@Primary` when:

1. Multiple beans of the same type exist.
2. One bean should be the default choice.
3. You want to avoid repeatedly using `@Qualifier`.

Example:

```java
@DataSource
@Primary
public DataSource mysqlDataSource() {
    ...
}
```

Spring will use this datasource by default unless another one is explicitly requested.

***

# Interview Answer

> `@Primary` is used when multiple beans of the same type are present in the Spring container. It tells Spring to use that bean as the default choice during dependency injection whenever no `@Qualifier` is specified.
