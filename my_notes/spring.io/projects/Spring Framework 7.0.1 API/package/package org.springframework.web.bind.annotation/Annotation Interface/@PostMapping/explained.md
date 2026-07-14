Here is a **clean and clear explanation of `@PostMapping`** with **real examples**—easy to paste into your documentation.

---

# ✔️ **What is `@PostMapping`?**

`@PostMapping` is a Spring MVC annotation used to handle **HTTP POST requests**.

Use POST when the request is **sending data to the server**:

* Creating a new record
* Submitting forms
* Sending JSON bodies
* Uploading files

It is a **shortcut** for:

```java
@RequestMapping(method = RequestMethod.POST)
```

---

# ✔️ **Basic Example**

```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping
    public String createUser() {
        return "User created successfully";
    }
}
```

### ✔️ Endpoint Hit

`POST /api/users`

---

# ✔️ **POST with JSON Request Body**

This is the most common use of `@PostMapping`.

```java
@PostMapping("/create")
public User createUser(@RequestBody User user) {
    user.setId(1);  
    return user;
}
```

### ✔️ Example JSON Sent from Client

```json
{
  "name": "Karthik",
  "role": "Engineer"
}
```

### ✔️ Response

```json
{
  "id": 1,
  "name": "Karthik",
  "role": "Engineer"
}
```

---

# ✔️ **POST with Path Variable**

```java
@PostMapping("/{departmentId}/add")
public String addUserToDepartment(
        @PathVariable int departmentId,
        @RequestBody User user) {

    return "Added user " + user.getName() + " to department " + departmentId;
}
```

---

# ✔️ **POST with Query Params**

```java
@PostMapping("/save")
public String saveUser(
        @RequestParam String name,
        @RequestParam(defaultValue = "user") String role) {

    return name + " saved as " + role;
}
```

Example hit:

`POST /api/users/save?name=karthik&role=admin`

---

# ✔️ **POST Consumes + Produces Example**

```java
@PostMapping(
    value = "/upload",
    consumes = "application/json",
    produces = "application/json"
)
public Map<String, String> uploadData(@RequestBody Map<String, String> data) {
    return Map.of("status", "received");
}
```

---

# ✔️ **POST File Upload Example**

```java
@PostMapping("/uploadFile")
public String uploadFile(@RequestParam("file") MultipartFile file) {
    return "Uploaded: " + file.getOriginalFilename();
}
```

---

# ✔️ **POST Returning Custom Response Entity**

```java
@PostMapping("/register")
public ResponseEntity<String> register(@RequestBody User user) {
    return ResponseEntity
            .status(HttpStatus.CREATED)
            .body("User registered");
}
```

---

# ✔️ Recommended Documentation File Name

* `PostMapping-Annotation.md`
* `SpringBoot-PostMapping-Examples.md`

---

If you want, I can also generate a **full doc page** with a table comparing `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`.
