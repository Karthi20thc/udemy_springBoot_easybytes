**Prompt [# Different ways to name a Bean.    1. @Bean    ... | Try in Copilot Chat](https://m365.cloud.microsoft/chat/entity1-d870f6cd-4aa5-4d42-9626-ab690c041429/eyJpZCI6IlZYTmxjbFl4ZkdoMGRIQnpPaTh2YzNWaWMzUnlZWFJsTFdsdWRDNXZabVpwWTJVdVkyOXRMM3hQU1VRNlpEQXpabUZoWmpFdE1EVmxOUzAwWTJFM0xXRXdNRGd0T0RjMlpESmxOalEzTkRNM2ZHRXlaamd5T1RnMkxUQmtNRGN0TkRjMlpDMWhaVGcxTFRNMU1qWTFNVGMxTnpFNVlYd3lNREkyTFRBM0xUSXlWREE0T2pNM09qVTBMalF3TlRnM01EUmEiLCJzY2VuYXJpbyI6InNoYXJlTGlua1ZpYVJpY2hDb3B5IiwicHJvcGVydGllcyI6eyJwcm9tcHRTb3VyY2UiOiJ1c2VyIiwiY2xpY2tUaW1lc3RhbXAiOiIyMDI2LTA3LTIyVDA4OjM3OjU0LjUwN1oifSwiY2hhdFR5cGUiOiJ3ZWIiLCJ2ZXJzaW9uIjoxLjF9)**
# Different ways to name a Bean.    1. @Bean     2. Bean Aliasing    3. @Description   expalin and give ex for each
**Response**
# Different Ways to Name a Spring Bean

## 1. Using `@Bean`

When a bean is created using the `@Bean` annotation, the **method name becomes the bean name by default**.

### Example

```java
@Configuration
public class AppConfig {

    @Bean
    public Vehicle vehicle() {
        return new Vehicle();
    }
}
```

### Bean Name

```text
vehicle
```

Here, Spring registers the bean with the name **vehicle** (same as the method name).

### Custom Bean Name

You can explicitly provide a bean name.

```java
@Configuration
public class AppConfig {

    @Bean("myVehicle")
    public Vehicle vehicle() {
        return new Vehicle();
    }
}
```

### Bean Name

```text
myVehicle
```

### Accessing the Bean

```java
Vehicle v = context.getBean("myVehicle", Vehicle.class);
```

***

## 2. Bean Aliasing

A bean alias allows a single bean to have **multiple names**.

### Example

```java
@Configuration
public class AppConfig {

    @Bean({"car", "vehicle", "myVehicle"})
    public Vehicle vehicle() {
        return new Vehicle();
    }
}
```

### Registered Names

```text
car
vehicle
myVehicle
```

All three names refer to the **same bean instance**.

### Accessing Through Different Names

```java
Vehicle v1 = context.getBean("car", Vehicle.class);
Vehicle v2 = context.getBean("vehicle", Vehicle.class);
Vehicle v3 = context.getBean("myVehicle", Vehicle.class);
```

### Verification

```java
System.out.println(v1 == v2); // true
System.out.println(v2 == v3); // true
```

### When to Use

* Supporting old bean names for backward compatibility.
* Giving meaningful names in different modules.
* Making configuration easier to understand.

***

## 3. Using `@Description`

`@Description` **does NOT rename a bean**.

It is used only to provide metadata/documentation about a bean.n

### Example

```java
@Configuration
public class AppConfig {

    @Bean
    @Description("Represents the primary vehicle used in the application")
    public Vehicle vehicle() {
        return new Vehicle();
    }
}
```

### Bean Name

```text
vehicle
```

### Description

```text
Represents the primary vehicle used in the application
```

### Use Case

* Documentation purposes.
* Helps developers understand the bean's purpose.
* Useful when inspecting bean definitions.

### Important Note

❌ `@Description` does not create or change the bean name.

✅ It only adds descriptive metadata.

***

# Summary

| Method                     | Purpose                       | Bean Name                 |
| -------------------------- | ----------------------------- | ------------------------- |
| `@Bean`                    | Creates bean and assigns name | Method name by default    |
| `@Bean("myBean")`          | Creates bean with custom name | `myBean`                  |
| `@Bean({"bean1","bean2"})` | Creates aliases for same bean | `bean1`, `bean2`          |
| `@Description("...")`      | Adds documentation/metadata   | Does not affect bean name |

### Interview Answer (One-Liner)

> A Spring bean can be named using the `@Bean` annotation (default or custom name), can have multiple aliases using `@Bean({"name1","name2"})`, and `@Description` can be used to provide documentation metadata, although it does not actually change the bean name.
