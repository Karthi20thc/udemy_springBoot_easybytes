Annotation Interface RequestMapping
@Target({TYPE,METHOD})
@Retention(RUNTIME)
@Documented
@Reflective(org.springframework.web.bind.annotation.ControllerMappingReflectiveProcessor.class)
public @interface RequestMapping

Annotation for mapping web requests onto methods in request-handling classes with flexible method signatures.
Both Spring MVC and Spring WebFlux support this annotation through a RequestMappingHandlerMapping and RequestMappingHandlerAdapter in their respective modules and package structures. For the exact list of supported handler method arguments and return types in each, please use the reference documentation links below:

Spring MVC Method Arguments and Return Values
Spring WebFlux Method Arguments and Return Values
NOTE: This annotation can be used both at the class and at the method level. In most cases, at the method level applications will prefer to use one of the HTTP method specific variants @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, or @PatchMapping.

NOTE: This annotation cannot be used in conjunction with other @RequestMapping annotations that are declared on the same element (class, interface, or method). If multiple @RequestMapping annotations are detected on the same element, a warning will be logged, and only the first mapping will be used. This also applies to composed @RequestMapping annotations such as @GetMapping, @PostMapping, etc.

NOTE: When using controller interfaces (for example, for AOP proxying), make sure to consistently put all your mapping annotations — such as @RequestMapping and @SessionAttributes — on the controller interface rather than on the implementation class.

Since:
2.5
Author:
Juergen Hoeller, Arjen Poutsma, Sam Brannen
See Also:
GetMapping PostMapping PutMapping DeleteMapping PatchMapping