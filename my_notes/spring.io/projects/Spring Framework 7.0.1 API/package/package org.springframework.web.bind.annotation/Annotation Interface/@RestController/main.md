Annotation Interface RestController
@Target(TYPE)
@Retention(RUNTIME)
@Documented
@Controller
@ResponseBody
public @interface RestController

A convenience annotation that is itself annotated with @Controller and @ResponseBody.
Types that carry this annotation are treated as controllers where @RequestMapping methods assume @ResponseBody semantics by default.

NOTE: @RestController is processed if an appropriate HandlerMapping-HandlerAdapter pair is configured such as the RequestMappingHandlerMapping-RequestMappingHandlerAdapter pair which are the default in the MVC Java config and the MVC namespace.

Since:
4.0
Author:
Rossen Stoyanchev, Sam Brannen