Here is the **clearest, simplest explanation of `@RestController`**, plus multiple examples.

---

# ✅ **What is `@RestController` in Spring Boot?**

`@RestController` is a **specialized controller** used to build **REST APIs**.

It is a combination of:

```
@Controller + @ResponseBody
```

That means:

### ✔ It handles HTTP requests

### ✔ It returns data (JSON) instead of HTML

### ✔ No need to write `@ResponseBody` for every method

So, **use `@RestController` whenever you are building a backend API** for React, Angular, Flutter, mobile apps, Postman, etc.

---

# 🎯 **Why Use `@RestController`?**

| Feature                 | Description                  |
| ----------------------- | ---------------------------- |
| Returns JSON            | Perfect for APIs             |
| No HTML/Views           | Unlike `@Controller`         |
| Automatic serialization | Converts Java objects → JSON |
| Simple to use           | Less boilerplate             |

---

# ✅ **Most Basic Example**

```java
@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from REST!";
    }
}
```

➡ When you hit:

```
GET http://localhost:8080/hello
```

Response:

```
Hello from REST!
```

---

# ✅ **Example Returning JSON Object**

### Model

```java
public class User {
    private String name;
    private int age;

    // getters + setters
}
```

### Controller

```java
@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser() {
        User u = new User();
        u.setName("Karthik");
        u.setAge(28);
        return u;
    }
}
```

Response JSON:

```json
{
  "name": "Karthik",
  "age": 28
}
```

---

# ✅ **Example Using @PostMapping (Receive JSON)**

```java
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee emp) {
        return "Received: " + emp.getName();
    }
}
```

Send POST JSON:

```json
{
  "name": "Mani",
  "salary": 40000
}
```

Response:

```
Received: Mani
```

---

# ✅ **Example with Path Variables**

```java
@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
    public String getProduct(@PathVariable int id) {
        return "Product ID = " + id;
    }
}
```

➡ URL:
`GET /products/10`

Response:

```
Product ID = 10
```

---

# ✅ **Example With Service Layer (Best Practice)**

### Service

```java
@Service
public class GreetingService {
    public String greet(String name) {
        return "Hello " + name + "!";
    }
}
```

### RestController

```java
@RestController
@RequestMapping("/greet")
public class GreetingController {

    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/{name}")
    public String greeting(@PathVariable String name) {
        return service.greet(name);
    }
}
```

---

# 🎉 Summary (Easy to Remember)

| Annotation          | Purpose                      |
| ------------------- | ---------------------------- |
| **@RestController** | Build REST API, returns JSON |
| **@Controller**     | Returns HTML pages           |
| **@GetMapping**     | Handles GET requests         |
| **@PostMapping**    | Handles POST requests        |
| **@RequestBody**    | Read JSON request            |
| **@PathVariable**   | Read URL part                |

---

If you want, I can show:

✔ Full CRUD with `@RestController`
✔ Validation inside controller
✔ Exception handling (`@ControllerAdvice`)
✔ JPA + RestController real database example

Just say **"give CRUD example"**.
