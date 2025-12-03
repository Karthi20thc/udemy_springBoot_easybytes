Here is a **simple, clear explanation of `@PathVariable`** with all the examples you need for documentation.

---

# ✔️ **What is `@PathVariable`?**

`@PathVariable` is a Spring MVC annotation used to **extract values from the URL path**.

Use it when the value is part of the **URL itself**, NOT a query parameter.

### Example URL:

```
/users/10
/products/500/details
```

Here `10` and `500` are **path variables**.

---

# ✔️ **Basic Example**

```java
@GetMapping("/users/{id}")
public String getUser(@PathVariable int id) {
    return "User ID = " + id;
}
```

✔️ URL:
`GET /users/10`
Extracted value → `id = 10`

---

# ✔️ Multiple Path Variables

```java
@GetMapping("/users/{userId}/orders/{orderId}")
public String getOrder(
        @PathVariable int userId,
        @PathVariable int orderId
) {
    return "User: " + userId + ", Order: " + orderId;
}
```

✔️ URL:
`GET /users/5/orders/20`

---

# ✔️ `@PathVariable` with Custom Name

When URL variable name and method parameter name are different:

```java
@GetMapping("/products/{product_id}")
public String getProduct(@PathVariable("product_id") int id) {
    return "Product ID = " + id;
}
```

---

# ✔️ Optional Path Variable

```java
@GetMapping({"/status", "/status/{code}"})
public String getStatus(@PathVariable(required = false) Integer code) {
    return code == null ? "No code provided" : "Code: " + code;
}
```

---

# ✔️ Path Variable with String

```java
@GetMapping("/hello/{name}")
public String sayHello(@PathVariable String name) {
    return "Hello " + name;
}
```

✔️ URL:
`GET /hello/karthik`

---

# ✔️ Path Variable with Enum

```java
@GetMapping("/role/{type}")
public String getRole(@PathVariable RoleType type) {
    return "Role: " + type;
}

enum RoleType { ADMIN, USER, MANAGER }
```

✔️ URL:
`GET /role/ADMIN`

---

# ✔️ Multiple Path & Query Parameters Together

```java
@GetMapping("/users/{id}/orders")
public String getOrders(
        @PathVariable int id,
        @RequestParam(defaultValue = "5") int limit
) {
    return "User " + id + " with limit " + limit;
}
```

✔️ URL:
`GET /users/10/orders?limit=20`

---

# ✔️ Using `Map<String, String>` for Dynamic Path Variables

```java
@GetMapping("/path/{var1}/{var2}")
public Map<String, String> getPathVars(@PathVariable Map<String, String> vars) {
    return vars;
}
```

✔️ URL:
`GET /path/hello/world`

---

# ✔️ Path Variable Best Practices

| Good                           | Avoid                            |
| ------------------------------ | -------------------------------- |
| `/users/{id}`                  | `/users?id=10` (for path values) |
| `/products/{id}/reviews/{rid}` | Passing ID in body for GET       |
| Keep variable names meaningful | Very long URLs                   |

---

# ✔️ Recommended Documentation File Name

* `PathVariable-Annotation.md`
* `SpringBoot-PathVariable-Examples.md`

---

If you want, I can also give you `@RequestParam`, `@RequestBody`, or a **full table comparing all request mappings**.
