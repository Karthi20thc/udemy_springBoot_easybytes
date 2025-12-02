Annotation Interface GetMapping
@Target(METHOD)
@Retention(RUNTIME)
@Documented
@RequestMapping(method=GET)
public @interface GetMapping

Annotation for mapping HTTP GET requests onto specific handler methods.
Specifically, @GetMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).

NOTE: This annotation cannot be used in conjunction with other @RequestMapping annotations that are declared on the same method. If multiple @RequestMapping annotations are detected on the same method, a warning will be logged, and only the first mapping will be used. This applies to @RequestMapping as well as composed @RequestMapping annotations such as @PutMapping, @PostMapping, etc.

Since:
4.3
Author:
Sam Brannen
See Also:
PostMapping PutMapping DeleteMapping PatchMapping RequestMapping