Annotation Interface Component
@Target(TYPE)
@Retention(RUNTIME)
@Documented
@Indexed
public @interface Component
Indicates that the annotated class is a component.
Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.

A component may optionally specify a logical component name via the value attribute of this annotation.

Other class-level annotations may be considered as identifying a component as well, typically a special kind of component — for example, the @Repository annotation or AspectJ's @Aspect annotation. Note, however, that the @Aspect annotation does not automatically make a class eligible for classpath scanning.

Any annotation meta-annotated with @Component is considered a stereotype annotation which makes the annotated class eligible for classpath scanning. For example, @Service, @Controller, and @Repository are stereotype annotations. Stereotype annotations may also support configuration of a logical component name by overriding the value() attribute of this annotation via @AliasFor.

As of Spring Framework 6.1, support for configuring the name of a stereotype component by convention (i.e., via a String value() attribute without @AliasFor) is deprecated and will be removed in a future version of the framework. Consequently, custom stereotype annotations must use @AliasFor to declare an explicit alias for this annotation's value() attribute. See the source code declaration of Repository.value() and ControllerAdvice.name() for concrete examples.

Since:
2.5
Author:
Mark Fisher, Sam Brannen
See Also:
Repository Service Controller ClassPathBeanDefinitionScanner
