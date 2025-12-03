Annotation Interface PathVariable
@Target(PARAMETER)
@Retention(RUNTIME)
@Documented
public @interface PathVariable

Annotation which indicates that a method parameter should be bound to a URI template variable. Supported for RequestMapping annotated handler methods.
If the method parameter is Map<String, String> then the map is populated with all path variable names and values.

Since:
3.0
Author:
Arjen Poutsma, Juergen Hoeller
See Also:
RequestMapping RequestMappingHandlerAdapter