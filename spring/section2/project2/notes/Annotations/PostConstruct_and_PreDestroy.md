**Prompt [what is @PostConstruct and @PreDestroy | Try in Copilot Chat](https://m365.cloud.microsoft/chat/entity1-d870f6cd-4aa5-4d42-9626-ab690c041429/eyJpZCI6IlZYTmxjbFl4ZkdoMGRIQnpPaTh2YzNWaWMzUnlZWFJsTFdsdWRDNXZabVpwWTJVdVkyOXRMM3hQU1VRNlpEQXpabUZoWmpFdE1EVmxOUzAwWTJFM0xXRXdNRGd0T0RjMlpESmxOalEzTkRNM2ZESTBPVEExWWpOaUxUUTVZbUl0TkRNelpDMDVOMkZoTFdaaFlqZGtOamcxTVdFM1pId3lNREkyTFRBM0xUSTBWREEyT2pFd09qQTVMakEwTXpJeE9EVmEiLCJzY2VuYXJpbyI6InNoYXJlTGlua1ZpYVJpY2hDb3B5IiwicHJvcGVydGllcyI6eyJwcm9tcHRTb3VyY2UiOiJ1c2VyIiwiY2xpY2tUaW1lc3RhbXAiOiIyMDI2LTA3LTI0VDA2OjEwOjEwLjQ3M1oifSwiY2hhdFR5cGUiOiJ3ZWIiLCJ2ZXJzaW9uIjoxLjF9)**
what is @PostConstruct and @PreDestroy
**Response**
# `@PostConstruct` and `@PreDestroy` in Spring

`@PostConstruct` and `@PreDestroy` are lifecycle annotations used to execute methods during the **initialization** and **destruction** phases of a Spring bean.

***

# 1. `@PostConstruct`

## What is it?

A method annotated with `@PostConstruct` is executed **after the bean is created and dependencies are injected**, but **before the bean is available for use**.

## Why is it used?

To perform initialization tasks such as:

* Loading configuration
* Opening connections
* Initializing cache
* Preloading data

## Example

```java
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService {

    @PostConstruct
    public void init() {
        System.out.println("Database connection initialized.");
    }
}
```

### Execution Flow

```text
Spring Container Starts
        ↓
Bean Created
        ↓
Dependencies Injected
        ↓
@PostConstruct Method Executes
        ↓
Bean Ready for Use
```

***

# 2. `@PreDestroy`

## What is it?

A method annotated with `@PreDestroy` is executed **just before the bean is removed from the Spring container**.

## Why is it used?

To perform cleanup tasks such as:

* Closing database connections
* Releasing resources
* Stopping background threads
* Saving state

## Example

```java
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService {

    @PreDestroy
    public void cleanup() {
        System.out.println("Database connection closed.");
    }
}
```

### Execution Flow

```text
Application Running
        ↓
Application Shutdown
        ↓
@PreDestroy Method Executes
        ↓
Bean Destroyed
```

***

# Complete Example

```java
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public Vehicle() {
        System.out.println("Constructor called");
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Vehicle Bean Initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Vehicle Bean Destroyed");
    }
}
```

### Output

```text
Constructor called
Vehicle Bean Initialized

... application running ...

Vehicle Bean Destroyed
```

***

# Interview Question

### Q: What is the difference between Constructor and `@PostConstruct`?

| Constructor                       | `@PostConstruct`                  |
| --------------------------------- | --------------------------------- |
| Called when object is created     | Called after dependency injection |
| Dependencies may not be available | Dependencies are fully available  |
| Used for object creation          | Used for initialization logic     |

### Example

```java
@Component
public class Car {

    @Autowired
    Engine engine;

    public Car() {
        // engine is null here
    }

    @PostConstruct
    public void init() {
        // engine is available here
        System.out.println(engine);
    }
}
```

***

# Key Points for Interviews

* `@PostConstruct` → Runs once after bean creation and dependency injection.
* `@PreDestroy` → Runs once before bean destruction.
* Used for bean lifecycle management.
* Commonly used for initialization and cleanup logic.
* `@PreDestroy` works only when the Spring container shuts down gracefully.
* Package used in modern Spring:

```java
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
```

### Easy Memory Trick

```text
@PostConstruct  -> After Creation -> Initialize
@PreDestroy     -> Before Destruction -> Cleanup
```
