Annotation Interface Controller
@Target(TYPE)
@Retention(RUNTIME)
@Documented
@Component
public @interface Controller
Indicates that an annotated class is a "Controller" (for example, a web controller).
This annotation serves as a specialization of @Component, allowing for implementation classes to be autodetected through classpath scanning. It is typically used in combination with annotated handler methods based on the RequestMapping annotation.

Since:
2.5
Author:
Arjen Poutsma, Juergen Hoeller
See Also:
Component RequestMapping ClassPathBeanDefinitionScanner