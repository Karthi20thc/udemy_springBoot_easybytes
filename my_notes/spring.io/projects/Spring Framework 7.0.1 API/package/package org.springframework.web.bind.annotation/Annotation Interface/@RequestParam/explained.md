Here is a **clean, simple explanation of `@RequestParam`** with perfect examples for documentation.

---

# ✔️ **What is `@RequestParam`?**

`@RequestParam` is a Spring MVC annotation used to extract **query parameters** (parameters after `?` in a URL) or **form data** in a request.

### Example URL

```
/search?name=karthik&role=admin
```

Here, `name` and `role` are **request parameters**.

---

# ✔️ **Basic Example**

```java
@GetMapping("/search")
public String search(@RequestParam String name) {
    return "Searching for: " + name;
}
```

✔️ URL:
`GET /search?name=karthik`

---

# ✔️ Multiple Request Params

```java
@GetMapping("/filter")
public String filter(
        @RequestParam String name,
        @RequestParam int age
) {
    return name + " - " + age;
}
```

✔️ URL:
`GET /filter?name=karthik&age=25`

---

# ✔️ Optional Param with Default Value

```java
@GetMapping("/users")
public String getUsers(
        @RequestParam(defaultValue = "10") int limit
) {
    return "Limit: " + limit;
}
```

✔️ URL:
`GET /users` → returns limit = 10
`GET /users?limit=50` → limit = 50

---

# ✔️ Optional Param (not required)

```java
@GetMapping("/status")
public String getStatus(
        @RequestParam(required = false) String code
) {
    return code == null ? "No code" : "Status: " + code;
}
```

---

# ✔️ RequestParam With Custom Name

When parameter name differs from the variable name:

```java
@GetMapping("/hello")
public String hello(
        @RequestParam("username") String name
) {
    return "Hello " + name;
}
```

✔️ URL:
`GET /hello?username=karthik`

---

# ✔️ RequestParam with List

```java
@GetMapping("/ids")
public List<Integer> getIds(@RequestParam List<Integer> id) {
    return id;
}
```

✔️ URL:
`GET /ids?id=1&id=2&id=3`

---

# ✔️ RequestParam + PathVariable Together

```java
@GetMapping("/users/{id}")
public String getUser(
        @PathVariable int id,
        @RequestParam(defaultValue = "basic") String details
) {
    return "User " + id + " with details = " + details;
}
```

✔️ URL:
`GET /users/10?details=full`

---

# ✔️ RequestParam for POST (Form-data)

```java
@PostMapping("/submit")
public String submitForm(
        @RequestParam String email,
        @RequestParam String password
) {
    return "Received form for: " + email;
}
```

---

# ✔️ RequestParam with Map (Dynamic)

```java
@GetMapping("/params")
public Map<String, String> getAllParams(
        @RequestParam Map<String, String> params
) {
    return params;
}
```

✔️ URL:
`GET /params?name=a&age=20&city=blr`

---

# ✔️ When to Use `@RequestParam` vs `@RequestBody` vs `@PathVariable`

| Annotation        | Used For                | Example                 |
| ----------------- | ----------------------- | ----------------------- |
| **@RequestParam** | Query params, form data | `/search?name=x`        |
| **@PathVariable** | URL path values         | `/users/10`             |
| **@RequestBody**  | JSON body               | `{ "name": "Karthik" }` |

---

# ✔️ Recommended Documentation File Name

* `RequestParam-Annotation.md`
* `SpringBoot-RequestParam-Examples.md`

---

If you want, I can now cover **@RequestBody**, **@ModelAttribute**, or a **full comparison chart** of all Spring MVC annotations.
