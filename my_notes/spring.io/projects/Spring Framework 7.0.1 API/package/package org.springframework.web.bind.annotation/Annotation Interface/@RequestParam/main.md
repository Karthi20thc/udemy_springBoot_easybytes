Annotation Interface RequestParam
@Target(PARAMETER)
@Retention(RUNTIME)
@Documented
public @interface RequestParam

Annotation which indicates that a method parameter should be bound to a web request parameter.
Supported for annotated handler methods in Spring MVC and Spring WebFlux as follows:

In Spring MVC, "request parameters" map to query parameters, form data, and parts in multipart requests. This is because the Servlet API combines query parameters and form data into a single map called "parameters", and that includes automatic parsing of the request body.
In Spring WebFlux, "request parameters" map to query parameters only. To work with all 3, query, form data, and multipart data, you can use data binding to a command object annotated with ModelAttribute.
If the method parameter type is Map and a request parameter name is specified, then the request parameter value is converted to a Map assuming an appropriate conversion strategy is available.

If the method parameter is Map<String, String> or MultiValueMap<String, String> and a parameter name is not specified, then the map parameter is populated with all request parameter names and values.

Since:
2.5
Author:
Arjen Poutsma, Juergen Hoeller, Sam Brannen
See Also:
RequestMapping RequestHeader CookieValue