Annotation Interface Service
@Target(TYPE)
@Retention(RUNTIME)
@Documented
@Component
public @interface Service
Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design (Evans, 2003) as "an operation offered as an interface that stands alone in the model, with no encapsulated state."
May also indicate that a class is a "Business Service Facade" (in the Core J2EE patterns sense), or something similar. This annotation is a general-purpose stereotype and individual teams may narrow their semantics and use as appropriate.

This annotation serves as a specialization of @Component, allowing for implementation classes to be autodetected through classpath scanning.

Since:
2.5
Author:
Juergen Hoeller
See Also:
Component Repository