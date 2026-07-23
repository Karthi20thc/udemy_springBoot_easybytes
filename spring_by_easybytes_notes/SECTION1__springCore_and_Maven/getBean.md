**Prompt [getBean() general syntax | Try in Copilot Chat](https://m365.cloud.microsoft/chat/entity1-d870f6cd-4aa5-4d42-9626-ab690c041429/eyJpZCI6IlZYTmxjbFl4ZkdoMGRIQnpPaTh2YzNWaWMzUnlZWFJsTFdsdWRDNXZabVpwWTJVdVkyOXRMM3hQU1VRNlpEQXpabUZoWmpFdE1EVmxOUzAwWTJFM0xXRXdNRGd0T0RjMlpESmxOalEzTkRNM2ZHUmlPVFEzTWpJMExXWmxPVGN0TkRReVpDMWhZVGRqTFRGaU9EVTFNVEEyT1RGbE5Yd3lNREkyTFRBM0xUSXhWREV3T2pFNE9qQTNMalExTnpNd05EWmEiLCJzY2VuYXJpbyI6InNoYXJlTGlua1ZpYVJpY2hDb3B5IiwicHJvcGVydGllcyI6eyJwcm9tcHRTb3VyY2UiOiJ1c2VyIiwiY2xpY2tUaW1lc3RhbXAiOiIyMDI2LTA3LTIxVDEwOjE4OjA4LjYzNFoifSwiY2hhdFR5cGUiOiJ3ZWIiLCJ2ZXJzaW9uIjoxLjF9)**
getBean() general syntax
**Response**
# `getBean()` General Syntax in Spring

`getBean()` is used to retrieve a bean from the Spring IoC Container (`ApplicationContext`).

## 1. Get Bean by Class Type

```java
MyService service = context.getBean(MyService.class);
```

**Syntax:**

```java
ClassName object = context.getBean(ClassName.class);
```

***

## 2. Get Bean by Bean Name

```java
MyService service = (MyService) context.getBean("myService");
```

**Syntax:**

```java
ClassName object = (ClassName) context.getBean("beanName");
```

***

## 3. Get Bean by Bean Name and Class Type

```java
MyService service = context.getBean("myService", MyService.class);
```

**Syntax:**

```java
ClassName object = context.getBean("beanName", ClassName.class);
```

***

## Complete Example

```java
@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        return new Student();
    }
}
```

```java
AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);

Student student = context.getBean(Student.class);

System.out.println(student);
```

### General Structure

```java
ApplicationContext context = 
        new AnnotationConfigApplicationContext(ConfigClass.class);

ClassName obj = context.getBean(ClassName.class);
```

### When to Use?

* Mostly used in standalone Spring applications.
* Used when you need to manually fetch a bean from the container.
* In Spring Boot, prefer `@Autowired` or Constructor Injection instead of frequently calling `getBean()`.

```java
@Autowired
private Student student;
```

This is the recommended approach in real-world Spring Boot applications.
