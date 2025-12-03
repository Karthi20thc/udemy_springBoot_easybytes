Annotation Interface PostMapping
@Target(METHOD)
@Retention(RUNTIME)
@Documented
@RequestMapping(method=POST)
public @interface PostMapping

Annotation for mapping HTTP POST requests onto specific handler methods.
Specifically, @PostMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.POST).

NOTE: This annotation cannot be used in conjunction with other @RequestMapping annotations that are declared on the same method. If multiple @RequestMapping annotations are detected on the same method, a warning will be logged, and only the first mapping will be used. This applies to @RequestMapping as well as composed @RequestMapping annotations such as @GetMapping, @PutMapping, etc.

Since:
4.3
Author:
Sam Brannen
See Also:
GetMapping PutMapping DeleteMapping PatchMapping RequestMapping