Annotation Interface DeleteMapping
@Target(METHOD)
@Retention(RUNTIME)
@Documented
@RequestMapping(method=DELETE)
public @interface DeleteMapping

Annotation for mapping HTTP DELETE requests onto specific handler methods.
Specifically, @DeleteMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.DELETE).

NOTE: This annotation cannot be used in conjunction with other @RequestMapping annotations that are declared on the same method. If multiple @RequestMapping annotations are detected on the same method, a warning will be logged, and only the first mapping will be used. This applies to @RequestMapping as well as composed @RequestMapping annotations such as @GetMapping, @PostMapping, etc.

Since:
4.3
Author:
Sam Brannen
See Also:
GetMapping PostMapping PutMapping PatchMapping RequestMapping