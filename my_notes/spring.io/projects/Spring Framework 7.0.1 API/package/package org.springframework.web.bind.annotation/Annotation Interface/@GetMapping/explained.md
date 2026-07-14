Here’s a **simple, clear explanation** of `@GetMapping` in Spring Boot, plus **real examples** exactly how you can document it.

---

# ✔️ **What is `@GetMapping`?**

`@GetMapping` is a Spring MVC annotation used inside a **Spring Boot controller** to handle **HTTP GET requests**.

It is basically a **shortcut** for:

```java
@RequestMapping(method = RequestMethod.GET)
```

Use it when you want to fetch data, display a page, or return a response without modifying anything on the server.

---

# ✔️ **Where is it used?**

* Inside a class annotated with `@RestController` or `@Controller`
* To define URL endpoints like `/users`, `/products`, `/status`, etc.

---

# ✔️ **Basic Example (Simple API)**

```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "Returning all users";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id) {
        return "User ID: " + id;
    }
}
```

### ✔️ Explanation

* `@GetMapping` → handles GET request for `/api/users`
* `@GetMapping("/{id}")` → handles GET request for `/api/users/10`

---

# ✔️ **GET with Query Params Example**

```java
@GetMapping("/search")
public String searchUsers(@RequestParam String name) {
    return "Searching users by name: " + name;
}
```

### Example Call

`GET /api/users/search?name=karthik`

---

# ✔️ **GET Returning JSON Example**

```java
@GetMapping("/details")
public Map<String, Object> getUserDetails() {
    Map<String, Object> user = new HashMap<>();
    user.put("id", 1);
    user.put("name", "Karthik");
    user.put("role", "Engineer");
    return user;
}
```

### Response

```json
{
  "id": 1,
  "name": "Karthik",
  "role": "Engineer"
}
```

---

# ✔️ **GET Example with DTO**

```java
@GetMapping("/profile")
public UserDto getProfile() {
    return new UserDto(1, "Karthik", "Developer");
}
```

Where:

```java
public record UserDto(int id, String name, String role) {}
```

---

# ✔️ **GET Example with Path + Query Param**

```java
@GetMapping("/{id}/orders")
public String getOrders(
        @PathVariable int id,
        @RequestParam(defaultValue = "10") int limit) {

    return "Orders for user " + id + ", limit = " + limit;
}
```

---

# ✔️ Suitable Documentation Title / File Name

You asked earlier for file names, so here’s the best one:

### ✅ **File name recommendation**

`GETMapping-Annotation.md`
or
`SpringBoot-GetMapping-Examples.md`

---

If you want, I can also create a **full documentation file** with headings, tables, examples, and diagrams.
