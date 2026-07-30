# What is NoUniqueBeanDefinitionException ? [->](./NoUniqueBeanDefinitionException.md#4-get-bean-by-name)
    * Learn what is type casting?

# Different ways to name a Bean. [->](./CustomBeanNames.md) 
    1. @Bean(name=string)
    2. @Bean(value=string)
    3. @Bean(string)
    4. Bean Aliasing ex-  @Bean({string1,string2})
    5. @Description(String)

# chosing the 'Default' Bean [->](./PrimaryBean.md)
    1. @Primary

# Modular config made easy with @Import [->](./Annotations/Import.md)

    1. ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, DatabaseConfig.class);
    2. @Import({})

# Bean creation the Easy way

1. @Component [->](./Annotations/Component.md)
2. @ComponentScan(basePackages={"yourpackageName1","yourpackageName2"}) [->](./Annotations/ComponentScan.md)
3. What is the difference between @Bean and @Component.
   1. If you want to populate some data into the object to bean that is going to be created (rare scenario) use @Bean , we should also able to populate some data into the object bean when we are using @Component annotation as well (Next lecture.)
4. what is stereotype Annotation?  ( In General sterotype - commonly accepted approach.)


# Bean LifeCycle Hooks - @PostConstruct and @PreDestroy 
[AI notes](./Annotations/PostConstruct_and_PreDestroy.md) [code](../src/main/java/com/eazybytes/beanLifeCycleHooks/beans/Vehicle.java#method)

# @Bean vs @Component Therory

# Spring's sterotypes - @Componet, @Service, @Repository, @Controller

1. Layers in a Backend Application
   client request --> Controller Layer --> calls the service Layer (business Logic) --> calls Repositories (fetch or store data CRUD) --> Database

2. @Component - Generic Bean.
3. @Service   - Business Logic Layer.
4. @Controller - Handles Incoming web Request in spring MVC.
5. @RestController - simplified @Controller, return JSON respones.
6. @ComponentScan  - TO enable automatic scanning of these annotations.

    Shortcut - ctrl + N (Intellij)

# Method-Based Bean wiring -Theory.

1. How to establish the dependencies betweeen multiple beans (controller Bean, Service Bean, Repostiory Bean) in spring?
    use AutoWiring to simplify the process. (Automatic)

    ## Manual wiring using method call
    ## Wiring Bean using method parameters

# Method-Based wiring - practical [code](../src/main/java/com/eazybytes/methodBasedWiring/MethodBasedWiring.java)

# Autowiring - Field vs Setter Injection.

1. spring takes care of wiring between beans and injecting dependency automatically.
2. Makes app loosely coupled.

## ways to Autowire

[code](../src/main/java/com/eazybytes/methodBasedWiring/beans/Car.java)
1. By Field Injection (@Autowired on Field)
2. By Setter Injection (@Autowired on setter Method).
3. By Constructor Injection (@Autowired on Constructor)