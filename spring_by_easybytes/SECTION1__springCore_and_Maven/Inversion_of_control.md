**Prompt [what is inversion of control in spring | Try in Copilot Chat](https://m365.cloud.microsoft/chat/entity1-d870f6cd-4aa5-4d42-9626-ab690c041429/eyJpZCI6IlZYTmxjbFl4ZkdoMGRIQnpPaTh2YzNWaWMzUnlZWFJsTFdsdWRDNXZabVpwWTJVdVkyOXRMM3hQU1VRNlpEQXpabUZoWmpFdE1EVmxOUzAwWTJFM0xXRXdNRGd0T0RjMlpESmxOalEzTkRNM2ZHSXdNMlU0WW1ZeUxXSXpaRGN0TkRKaE1DMWhOR1JsTFdJME1tVXhaV1U0WmpFMVlYd3lNREkyTFRBM0xURTBWREV4T2pNd09qUTBMakk1T1RJMk9ESmEiLCJzY2VuYXJpbyI6InNoYXJlTGlua1ZpYVJpY2hDb3B5IiwicHJvcGVydGllcyI6eyJwcm9tcHRTb3VyY2UiOiJ1c2VyIiwiY2xpY2tUaW1lc3RhbXAiOiIyMDI2LTA3LTE0VDExOjMwOjQ0Ljc2OVoifSwiY2hhdFR5cGUiOiJ3ZWIiLCJ2ZXJzaW9uIjoxLjF9)**
what is inversion of control in spring
**Response**
# Inversion of Control (IoC) in Spring

**Inversion of Control (IoC)** is a design principle where the control of creating and managing objects is transferred from the programmer to the Spring Framework.

Instead of your code creating dependencies using `new`, Spring creates the objects and injects them where needed.

## Without IoC

Here, `UserService` creates its own dependency:

```java
class UserRepository {
    public void getUser() {
        System.out.println("Fetching User");
    }
}

class UserService {
    private UserRepository repository = new UserRepository();

    public void fetchUser() {
        repository.getUser();
    }
}****
```

### Problem

* Tight coupling
* Hard to test
* Dependency changes require code changes

***

## With IoC

Spring manages the objects (beans) and injects dependencies.

```java
@Repository
public class UserRepository {
    public void getUser() {
        System.out.println("Fetching User");
    }
}

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void fetchUser() {
        repository.getUser();
    }
}
```

### What happens?

1. Spring creates `UserRepository`.
2. Spring creates `UserService`.
3. Spring injects `UserRepository` into `UserService`.
4. Your code simply uses the service.

***

# IoC Container

The **IoC Container** is the core of Spring.

It is responsible for:

* Creating objects (Beans)
* Managing bean lifecycle
* Injecting dependencies
* Configuring beans

Two main containers:

1. **BeanFactory** (basic)
2. **ApplicationContext** (advanced and commonly used)

```java
ApplicationContext context =
    new AnnotationConfigApplicationContext(AppConfig.class);
```

***

# Dependency Injection (DI)

**Dependency Injection is the implementation of IoC in Spring.**

There are three types:

## 1. Constructor Injection (Recommended)

```java
@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
}
```
****
### Advantages

* Immutable dependencies
* Easier testing
* Recommended by Spring

***

## 2. Setter Injection

```java
@Service
public class UserService {

    private UserRepository repository;

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }
}
```

***

## 3. Field Injection

```java
@Service
public class UserService {

    @Autowired
    private UserRepository repository;
}
```

### Disadvantage

* Difficult to unit test
* Hides dependencies

***

# Real-World Analogy

### Without IoC

You want coffee:

```text
You → Go to kitchen → Make coffee
```

You are responsible for creating the coffee.

### With IoC

```text
You → Ask waiter for coffee
Waiter → Brings coffee
```

You don't create it; someone else provides it.

Here:

* **You** = UserService
* **Coffee** = Dependency (UserRepository)
* **Waiter** = Spring IoC Container

***

# Why Use IoC?

✅ Loose coupling

✅ Better testability

✅ Easy maintenance

✅ Reusable components

✅ Centralized object management

✅ Easier configuration

***

# Interview Answer

> **Inversion of Control (IoC)** is a design principle in which the responsibility of creating and managing objects is transferred from application code to the Spring container. Spring achieves IoC through **Dependency Injection (DI)**, where required dependencies are automatically provided to classes rather than being created using the `new` keyword. This reduces coupling, improves maintainability, and makes applications easier to test.

### One-Line Definition

> **IoC means Spring controls the creation and lifecycle of objects instead of the application code managing them directly.**
