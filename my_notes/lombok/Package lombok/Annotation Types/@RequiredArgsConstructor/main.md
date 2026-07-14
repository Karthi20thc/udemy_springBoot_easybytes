Annotation Type RequiredArgsConstructor
@Target(TYPE)
@Retention(SOURCE)
public @interface RequiredArgsConstructor

Generates a constructor with required arguments. Required arguments are final fields and fields with constraints such as @NonNull.
Complete documentation is found at the project lombok features page for @Constructor.

Even though it is not listed, this annotation also has the onConstructor parameter. See the full documentation for more details.