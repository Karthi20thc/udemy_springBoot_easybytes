Here is a **clear and simple explanation of `@PutMapping`** with **real examples** suitable for documentation.

---

# ✔️ **What is `@PutMapping`?**

`@PutMapping` is a Spring MVC annotation used to handle **HTTP PUT requests**.

Use PUT when you want to **update an existing resource completely**.

It is a shortcut for:

```java
@RequestMapping(method = RequestMethod.PUT)
```

---

# ✔️ **Where is PUT used?**

* Updating user details
* Updating product information
* Replacing an existing record
* Updating full JSON objects

---

# ✔️ **Basic Example**

```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id) {
        return "User " + id + " updated";
    }
}
```

### ✔️ Endpoint Hit

`PUT /api/users/10`

---

# ✔️ **PUT with JSON Body**

```java
@PutMapping("/{id}")
public User updateUser(
        @PathVariable int id,
        @RequestBody User updatedUser
) {
    updatedUser.setId(id);
    return updatedUser;
}
```

### ✔️ Client sends JSON

```json
{
  "name": "Karthik",
  "role": "Senior Engineer"
}
```

### ✔️ Response

```json
{
  "id": 10,
  "name": "Karthik",
  "role": "Senior Engineer"
}
```

---

# ✔️ **PUT with Path Variable + Query Parameter**

```java
@PutMapping("/{id}")
public String updateUserRole(
        @PathVariable int id,
        @RequestParam String role
) {
    return "Updated user " + id + " to role: " + role;
}
```

---

# ✔️ **PUT with Consumes and Produces**

```java
@PutMapping(
    value = "/edit",
    consumes = "application/json",
    produces = "application/json"
)
public Map<String, String> edit(@RequestBody Map<String, Object> body) {
    return Map.of("status", "updated");
}
```

---

# ✔️ **PUT Returning ResponseEntity**

```java
@PutMapping("/{id}")
public ResponseEntity<String> update(
        @PathVariable int id,
        @RequestBody User user
) {
    return ResponseEntity
            .ok("User " + id + " updated successfully");
}
```

---

# ✔️ **PUT vs PATCH (Important Difference)**

| HTTP Method | Usage                                     |
| ----------- | ----------------------------------------- |
| **PUT**     | Full update (replace entire record)       |
| **PATCH**   | Partial update (update only a few fields) |

---

# ✔️ Recommended Documentation File Name

* `PutMapping-Annotation.md`
* `SpringBoot-PutMapping-Examples.md`

---

If you want, I can also give **PATCH** explanation next, or a combined table of all annotations.
