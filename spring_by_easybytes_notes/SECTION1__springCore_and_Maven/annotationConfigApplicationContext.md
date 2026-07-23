**Prompt [AnnotationConfigApplicationContext()   general... | Try in Copilot Chat](https://m365.cloud.microsoft/chat/entity1-d870f6cd-4aa5-4d42-9626-ab690c041429/eyJpZCI6IlZYTmxjbFl4ZkdoMGRIQnpPaTh2YzNWaWMzUnlZWFJsTFdsdWRDNXZabVpwWTJVdVkyOXRMM3hQU1VRNlpEQXpabUZoWmpFdE1EVmxOUzAwWTJFM0xXRXdNRGd0T0RjMlpESmxOalEzTkRNM2ZEazRaamxoWkROaExXVmtNVFF0TkdFeFpTMWhZakV3TFRZeFpESTFNbVpqT0RJd09Yd3lNREkyTFRBM0xUSXdWREV5T2pNek9qUXpMams0TlRNNE16aGEiLCJzY2VuYXJpbyI6InNoYXJlTGlua1ZpYVJpY2hDb3B5IiwicHJvcGVydGllcyI6eyJwcm9tcHRTb3VyY2UiOiJ1c2VyIiwiY2xpY2tUaW1lc3RhbXAiOiIyMDI2LTA3LTIwVDEyOjMzOjQ0LjgxMloifSwiY2hhdFR5cGUiOiJ3ZWIiLCJ2ZXJzaW9uIjoxLjF9)**
AnnotationConfigApplicationContext()   general syntax structure
**Response**
# `AnnotationConfigApplicationContext()` - General Syntax Structure

`AnnotationConfigApplicationContext` is a Spring IoC container used to create and manage beans defined using Java-based configuration (`@Configuration`, `@Bean`, `@Component`, etc.).

## 1. Basic Syntax

```java
ApplicationContext context =
        new AnnotationConfigApplicationContext(ConfigClass.class);
```

Example:

```java
ApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);
```

Here:

* `AnnotationConfigApplicationContext` → Spring container
* `AppConfig.class` → Configuration class annotated with `@Configuration`
* `context` → Used to retrieve Spring beans

***

## 2. Complete Example

### Configuration Class

```java
@Configuration
public class AppConfig {

    @Bean
    public Laptop laptop() {
        return new Laptop();
    }
}
```

### Main Class

```java
public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Laptop laptop = context.getBean(Laptop.class);

        laptop.compile();
    }
}
```

***

## 3. Multiple Configuration Classes

```java
ApplicationContext context =
        new AnnotationConfigApplicationContext(
                AppConfig.class,
                DatabaseConfig.class
        );
```

***

## 4. Component Scanning Configuration

```java
@Configuration
@ComponentScan("com.example")
public class AppConfig {
}
```

```java
ApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);
```

Spring scans the package and automatically creates beans for classes annotated with:

* `@Component`
* `@Service`
* `@Repository`
* `@Controller`

***

## 5. No-Argument Constructor

```java
AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext();

context.register(AppConfig.class);
context.refresh();
```

Steps:

1. Create context
2. Register configuration class
3. Call `refresh()`
4. Retrieve beans

***

## Interview Answer (Short)

```java
ApplicationContext context =
        new AnnotationConfigApplicationContext(ConfigClass.class);
```

* Creates a Spring IoC container.
* Reads configuration from Java configuration classes.
* Manages bean creation, dependency injection, and bean lifecycle.
* Commonly used in Spring Core applications without XML configuration.
