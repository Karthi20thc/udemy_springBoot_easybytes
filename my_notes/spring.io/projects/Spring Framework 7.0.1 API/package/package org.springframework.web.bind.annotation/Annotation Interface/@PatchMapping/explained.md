Here is a **clean, simple explanation of `@PatchMapping`** with perfect examples for your documentation.

---

# ✔️ **What is `@PatchMapping`?**

`@PatchMapping` is a Spring MVC annotation that handles **HTTP PATCH requests**.

Use PATCH when you want to:

* **Partially update** an existing resource
* Update **only specific fields**
* NOT replace the entire object (that’s what PUT does)

It is basically a shortcut for:

```java
@RequestMapping(method = RequestMethod.PATCH)
```

---

# ✔️ **PATCH vs PUT (Very Important)**

| Method    | Usage                                            | Example                         |
| --------- | ------------------------------------------------ | ------------------------------- |
| **PUT**   | **Full object update** (replace existing record) | Updating whole user profile     |
| **PATCH** | **Partial update** (only specific fields)        | Updating just the email or role |

---

# ✔️ **Basic `@PatchMapping` Example**

```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    @PatchMapping("/{id}")
    public String partiallyUpdateUser(@PathVariable int id) {
        return "User " + id + " partially updated";
    }
}
```

### ✔️ Endpoint

`PATCH /api/users/10`

---

# ✔️ **PATCH with Partial JSON Body**

```java
@PatchMapping("/{id}")
public Map<String, Object> updateUserPartially(
        @PathVariable int id,
        @RequestBody Map<String, Object> updates
) {
    return Map.of(
        "id", id,
        "updatedFields", updates
    );
}
```

### ✔️ Client sends only what needs update:

```json
{
  "email": "newemail@example.com"
}
```

### ✔️ Response:

```json
{
  "id": 10,
  "updatedFields": {
    "email": "newemail@example.com"
  }
}
```

---

# ✔️ **PATCH with DTO Example**

```java
@PatchMapping("/{id}")
public User patchUser(
        @PathVariable int id,
        @RequestBody UserPatchRequest patch
) {
    return new User(id, patch.getName(), patch.getRole());
}
```

Where patch DTO contains optional fields:

```java
public class UserPatchRequest {
    private String name;
    private String role;

    // getters and setters
}
```

---

# ✔️ **PATCH with Query Parameter**

```java
@PatchMapping("/{id}/status")
public String updateStatus(
        @PathVariable int id,
        @RequestParam String status
) {
    return "User " + id + " updated status to " + status;
}
```

---

# ✔️ **PATCH with ResponseEntity**

```java
@PatchMapping("/{id}")
public ResponseEntity<String> update(
        @PathVariable int id,
        @RequestBody Map<String, Object> updates
) {
    return ResponseEntity.ok("User " + id + " partially updated");
}
```

---

# ✔️ Recommended Documentation File Name

* `PatchMapping-Annotation.md`
* `SpringBoot-PatchMapping-Examples.md`

---

If you want, I can now give you **DeleteMapping**, **Controller**, **RestController**, or even a full side-by-side comparison of all HTTP mappings.
