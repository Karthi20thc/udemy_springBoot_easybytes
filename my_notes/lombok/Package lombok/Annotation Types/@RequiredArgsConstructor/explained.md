Here is the **clearest explanation of `@RequiredArgsConstructor`** in Lombok, with simple and advanced examples.

---

# ✅ **What is `@RequiredArgsConstructor`?**

`@RequiredArgsConstructor` is a Lombok annotation that **automatically generates a constructor** for all:

### ✔ `final` fields

### ✔ fields annotated with `@NonNull`

This removes the need to manually write constructors.

---

# 🎯 Why do we use it in Spring Boot?

Because Spring Boot prefers **constructor injection**:

```java
private final UserService userService;
```

Instead of writing:

```java
public MyController(UserService userService) {
    this.userService = userService;
}
```

`@RequiredArgsConstructor` generates it automatically.

---

# 🟢 **Basic Example**

### Before (Without Lombok)

```java
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }
}
```

### After (With Lombok)

```java
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;
}
```

✔ Constructor is auto-generated
✔ Cleaner
✔ Less boilerplate

---

# 🟣 **Spring Boot Example (Most Common)**

```java
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        return userService.getUser(id);
    }
}
```

Lombok will auto-generate:

```java
public UserController(UserService userService) {
    this.userService = userService;
}
```

No need to write it manually.

---

# 🔵 **Example With Multiple Final Fields**

```java
@Service
@RequiredArgsConstructor
public class OrderService {

    private final PaymentService paymentService;
    private final OrderRepository orderRepository;

}
```

Lombok generates:

```java
public OrderService(PaymentService paymentService, 
                    OrderRepository orderRepository) {
    this.paymentService = paymentService;
    this.orderRepository = orderRepository;
}
```

---

# 🟠 **Using @NonNull Instead of final**

Even non-final fields can be included in constructor **if marked @NonNull**.

```java
@RequiredArgsConstructor
public class Book {

    @NonNull
    private String title;

    private int pages; // not included in constructor
}
```

Generated constructor:

```java
public Book(String title) {
    this.title = title;
}
```

---

# ⚠ When NOT to use `@RequiredArgsConstructor`

Avoid it when you:

❌ Need a no-args constructor
❌ Need an all-args constructor
❌ Want custom constructor logic

Use instead:

* `@NoArgsConstructor`
* `@AllArgsConstructor`

---

# 🧠 Summary Table

| Annotation                 | Meaning                                               |
| -------------------------- | ----------------------------------------------------- |
| `@RequiredArgsConstructor` | Generates constructor for final + @NonNull fields     |
| `@AllArgsConstructor`      | Generates constructor for all fields                  |
| `@NoArgsConstructor`       | Generates empty constructor                           |
| Most used in Spring        | To auto-generate constructor for dependency injection |

---

If you want, I can also explain:

✔ Constructor Injection vs Field Injection
✔ When to use @Value + @RequiredArgsConstructor
✔ All Lombok annotations with examples

Just tell me **“explain all Lombok annotations”**.
