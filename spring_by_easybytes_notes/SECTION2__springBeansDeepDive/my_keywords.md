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