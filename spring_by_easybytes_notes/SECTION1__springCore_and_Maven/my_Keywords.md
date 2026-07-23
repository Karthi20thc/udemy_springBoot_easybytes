# Spring Core


# <u>key components of Spring Core and DI</u>

   1. [IoC](./Inversion_of_control.md) (Inversion of Control)
   
   2. DI (Dependency Injection)
       1. what is loose coupling?
       2. Advantages of IoC and DI
   
   3. Spring Beans
       1. How Beans are created?
          1. XML configuration (Legacy Approach)
          2. Annotations (eg. @Component , @Service)
          3. Java-Based configuration (via @Configuration and @Bean methods)
   
       2. Bean lifecycle Management
   
   4. Spring IoC Container (BeanFactory)
       1. DI
       2. Bean Management
       3. Lifecycle Management
       4. BeanFactory interface
   
      

   5. Spring Context (ApplicationContext) Advanced Container.
      * Extends BeanFactory: Inherits all IoC Container capabilities

      * Features 
         * Internationalization Support (i18n) - message sources for multiple languages.
         * Application Events - Publish / listen to events inside spring
         * Resource Loading - Read resources from classpath, filesystem ,URL
         * Environment and Profiles - application.properties, active profiles, etc.
         * Auto-scan and Annotations - Component scanning (@Component, @Service)
         * AOP Integration - Aspect Oriented Programming support.

      ApplicationContext
                |
                |--- extends BeanFactory (IoC Container)

# [How to Create Beans - @Bean and @COnfiguration](./Bean_and_Configuration.md)

   * @Configuration
   * @Bean
   * [AnnotationConfigApplicationContext()](./annotationConfigApplicationContext.md)
   * [.getBean()](./getBean.md)