Annotation Interface Repository
@Target(TYPE)
@Retention(RUNTIME)
@Documented
@Component
public @interface Repository
Indicates that an annotated class is a "Repository", originally defined by Domain-Driven Design (Evans, 2003) as "a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects".
Teams implementing traditional Jakarta EE patterns such as "Data Access Object" may also apply this stereotype to DAO classes, though care should be taken to understand the distinction between Data Access Object and DDD-style repositories before doing so. This annotation is a general-purpose stereotype and individual teams may narrow their semantics and use as appropriate.

A class thus annotated is eligible for Spring DataAccessException translation when used in conjunction with a PersistenceExceptionTranslationPostProcessor. The annotated class is also clarified as to its role in the overall application architecture for the purpose of tooling, aspects, etc.

This annotation also serves as a specialization of @Component, allowing for implementation classes to be autodetected through classpath scanning.

Since:
2.0
Author:
Rod Johnson, Juergen Hoeller
See Also:
Component
Service
DataAccessException
PersistenceExceptionTranslationPostProcessor