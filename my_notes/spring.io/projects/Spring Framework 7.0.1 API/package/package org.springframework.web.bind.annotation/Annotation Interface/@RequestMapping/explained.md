Below is a **clean, simple explanation of `@RequestMapping`** with **multiple examples**—perfect for documentation.

---

# ✔️ **What is `@RequestMapping`?**

`@RequestMapping` is a Spring MVC annotation used to **map HTTP requests** (GET, POST, PUT, DELETE, etc.) to specific controller methods.

It is the **parent/general annotation**, whereas:

* `@GetMapping` → shortcut for GET
* `@PostMapping` → shortcut for POST
* `@PutMapping` → shortcut for PUT
* `@DeleteMapping` → shortcut for DELETE

`@RequestMapping` can do everything but is more verbose.

---

# ✔️ **Where is it used?**

* On a **class** → defines base URL
* On a **method** → defines specific endpoint + method type

---

# ✔️ **Class-Level `@RequestMapping` Example**

```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello User!";
    }
}
```

### ✔️ What this does:

* Base URL → `/api/users`
* Endpoint → `/api/users/hello`

---

# ✔️ **Basic `@RequestMapping` with Method Type**

```java
@RequestMapping(value = "/all", method = RequestMethod.GET)
public String getAllUsers() {
    return "Fetching all users";
}
```

Equivalent to:

```java
@GetMapping("/all")
```

---

# ✔️ **Multiple HTTP Methods Example**

You can allow more than one HTTP method:

```java
@RequestMapping(value = "/save", method = {RequestMethod.POST, RequestMethod.PUT})
public String saveUser() {
    return "User saved/updated";
}
```

---

# ✔️ **Path Variables Example**

```java
@RequestMapping(value = "/{id}", method = RequestMethod.GET)
public String getUser(@PathVariable int id) {
    return "User ID = " + id;
}
```

---

# ✔️ **Query Parameters Example**

```java
@RequestMapping(value = "/search", method = RequestMethod.GET)
public String searchUser(@RequestParam String name) {
    return "Searching for: " + name;
}
```

---

# ✔️ **Consumes & Produces Example**

```java
@RequestMapping(
    value = "/create",
    method = RequestMethod.POST,
    consumes = "application/json",
    produces = "application/json"
)
public String createUser(@RequestBody User user) {
    return "{\"message\":\"User created\"}";
}
```

---

# ✔️ **Using `@RequestMapping` at Class + Method Level**

```java
@RestController
@RequestMapping("/products")   // class level
public class ProductController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)  // method level
    public String getProduct(@PathVariable int id) {
        return "Product ID: " + id;
    }
}
```

---

# ✔️ **Full Documentation Example File Name**

Use any of these:

* `RequestMapping-Annotation.md`
* `SpringBoot-RequestMapping-Guide.md`
* `RequestMapping-Examples.md`

---

If you want, I can also generate a **full documentation page** (with headings, tables, advantages, diagrams).
