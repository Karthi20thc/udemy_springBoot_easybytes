**Prompt [what are spring beans and give example | Try in Copilot Chat](https://m365.cloud.microsoft/chat/entity1-d870f6cd-4aa5-4d42-9626-ab690c041429/eyJpZCI6IlZYTmxjbFl4ZkdoMGRIQnpPaTh2YzNWaWMzUnlZWFJsTFdsdWRDNXZabVpwWTJVdVkyOXRMM3hQU1VRNlpEQXpabUZoWmpFdE1EVmxOUzAwWTJFM0xXRXdNRGd0T0RjMlpESmxOalEzTkRNM2ZHUmtZbUZrTUdOa0xUSm1aVGN0TkRBeU9TMDRNamN4TFdNM09UVmlOV1U0TVRVMU1Yd3lNREkyTFRBM0xUSXdWREEwT2pRNE9qRXpMalkwTWpBNE9ESmEiLCJzY2VuYXJpbyI6InNoYXJlTGlua1ZpYVJpY2hDb3B5IiwicHJvcGVydGllcyI6eyJwcm9tcHRTb3VyY2UiOiJ1c2VyIiwiY2xpY2tUaW1lc3RhbXAiOiIyMDI2LTA3LTIwVDA0OjQ4OjE2LjQ5OFoifSwiY2hhdFR5cGUiOiJ3ZWIiLCJ2ZXJzaW9uIjoxLjF9)**
what are spring beans and give example
**Response**
# Spring Beans

A **Spring Bean** is an object that is **created, managed, and maintained by the Spring IoC (Inversion of Control) Container**.

Instead of creating objects using `new`, Spring creates and manages them for you.

## Why use Beans?

* Reduces tight coupling between classes.
* Supports Dependency Injection (DI).
* Easier to test and maintain.
* Spring manages the bean lifecycle automatically.

***

# Example Without Spring

```java
public class UserService {
    private UserRepository repository = new UserRepository();
}
```

Here, `UserService` is tightly coupled to `UserRepository`.

***

# Example With Spring Bean

## UserRepository Bean

```java
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String getUser() {
        return "Karthik";
    }
}
```

## UserService Bean

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void displayUser() {
        System.out.println(repository.getUser());
    }
}
```

### What happens?

1. Spring creates a bean of `UserRepository`.
2. Spring creates a bean of `UserService`.
3. Spring injects `UserRepository` into `UserService`.
4. You don't need to use `new UserRepository()`.

***

# Ways to Create Beans

## 1. Using Stereotype Annotations

```java
@Component
public class MyBean {
}
```

Common stereotypes:

```java
@Component
@Service
@Repository
@Controller
```

***

## 2. Using `@Bean`

```java
@Configuration
public class AppConfig {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
}
```

Spring registers the returned object as a bean.

***

# Bean Lifecycle

```text
Spring Container Starts
        ↓
Bean Created
        ↓
Dependencies Injected
        ↓
Bean Ready to Use
        ↓
Application Stops
        ↓
Bean Destroyed
```

***

# Real-World Example

Think of a **bean as an employee managed by HR**.

* Employee = Bean
* Spring Container = HR
* HR hires employees (creates objects)
* HR assigns teams (injects dependencies)
* HR manages the employee's lifecycle

Similarly, Spring creates and manages beans for your application.

***

# Interview Definition

> A Spring Bean is an object that is instantiated, configured, and managed by the Spring IoC Container. Beans are used to implement dependency injection and reduce tight coupling between components in a Spring application.
