**Prompt [@Configuration and @Bean what is it and where it... | Try in Copilot Chat](https://m365.cloud.microsoft/chat/entity1-d870f6cd-4aa5-4d42-9626-ab690c041429/eyJpZCI6IlZYTmxjbFl4ZkdoMGRIQnpPaTh2YzNWaWMzUnlZWFJsTFdsdWRDNXZabVpwWTJVdVkyOXRMM3hQU1VRNlpEQXpabUZoWmpFdE1EVmxOUzAwWTJFM0xXRXdNRGd0T0RjMlpESmxOalEzTkRNM2ZEUTFZekJqTXpZNExXRmxObU10TkRKalpTMDVZakkxTFdNMllqY3pPR0U0T0RNd1kzd3lNREkyTFRBM0xUSXdWREEzT2pFeU9qUTBMamt4TWpBeE1EZGEiLCJzY2VuYXJpbyI6InNoYXJlTGlua1ZpYVJpY2hDb3B5IiwicHJvcGVydGllcyI6eyJwcm9tcHRTb3VyY2UiOiJ1c2VyIiwiY2xpY2tUaW1lc3RhbXAiOiIyMDI2LTA3LTIwVDA3OjEyOjQ1LjA3OVoifSwiY2hhdFR5cGUiOiJ3ZWIiLCJ2ZXJzaW9uIjoxLjF9)**
@Configuration and @Bean what is it and where it is used
**Response**
# `@Configuration` and `@Bean` in Spring

These annotations are used in **Java-based Spring configuration** to define and manage Spring Beans.

***

## 1. `@Configuration`

### What is it?

`@Configuration` tells Spring that a class contains bean definitions and acts as a configuration source.

```java
@Configuration
public class AppConfig {
}
```

### Purpose

* Replaces XML configuration.
* Used to define Spring Beans using Java code.
* Spring scans this class and registers beans in the IoC Container.

***

## 2. `@Bean`

### What is it?

`@Bean` is used on a method to tell Spring:

> "Execute this method and register the returned object as a Spring Bean."

```java
@Configuration
public class AppConfig {

    @Bean
    public Employee employee() {
        return new Employee();
    }
}
```

Spring creates and manages this `Employee` object.

***

## Example

### Employee.java

```java
public class Employee {

    public void work() {
        System.out.println("Employee is working");
    }
}
```

### AppConfig.java

```java
@Configuration
public class AppConfig {

    @Bean
    public Employee employee() {
        return new Employee();
    }
}
```

### Main Class

```java
ApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);

Employee employee = context.getBean(Employee.class);

employee.work();
```

### Output

```text
Employee is working
```

***

## When do we use `@Bean`?

Use `@Bean` when:

### 1. You cannot modify the source code

Suppose a class comes from a third-party library.

```java
public class AmazonS3Client {
}
```

You cannot add:

```java
@Component
```

So use:

```java
@Configuration
public class AppConfig {

    @Bean
    public AmazonS3Client amazonS3Client() {
        return new AmazonS3Client();
    }
}
```

***

### 2. Complex Object Creation

```java
@Bean
public DataSource dataSource() {
    DataSource ds = new DataSource();
    ds.setUrl("jdbc:mysql://localhost:3306/test");
    ds.setUsername("root");
    ds.setPassword("root");
    return ds;
}
```

***

## `@Component` vs `@Bean`

### `@Component`

Applied directly on the class.

```java
@Component
public class Employee {
}
```

Spring automatically creates the bean during component scanning.

***

### `@Bean`

Applied on a method inside a `@Configuration` class.

```java
@Configuration
public class AppConfig {

    @Bean
    public Employee employee() {
        return new Employee();
    }
}
```

You manually control bean creation.

***

## Interview Answer

### What is `@Configuration`?

* Marks a class as a Spring configuration class.
* Replaces XML configuration.
* Contains bean definitions.
* Spring scans it and registers beans in the IoC container.

### What is `@Bean`?

* Marks a method whose return object should be managed by Spring.
* Used to create and configure beans manually.
* Helpful for third-party classes and complex bean creation.

### Relationship

```text
@Configuration Class
        |
        └── @Bean Methods
                    |
                    └── Spring Beans
```

So, **`@Configuration` defines the configuration class, and `@Bean` defines the beans that Spring should create and manage.**
