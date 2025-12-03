Here is a **clear, simple explanation of `@DeleteMapping`** with perfect examples for your documentation.

---

# ✔️ **What is `@DeleteMapping`?**

`@DeleteMapping` is a Spring MVC annotation used to handle **HTTP DELETE requests**.

Use DELETE when you want to:

* Delete a record
* Remove a resource by ID
* Soft delete (mark as inactive)
* Remove based on conditions

It is a shortcut for:

```java
@RequestMapping(method = RequestMethod.DELETE)
```

---

# ✔️ **Where is DELETE used?**

* Delete user by ID
* Delete product
* Delete file
* Delete multiple items based on filters

---

# ✔️ **Basic Example**

```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        return "User " + id + " deleted";
    }
}
```

### ✔️ Endpoint

`DELETE /api/users/10`

---

# ✔️ **DELETE with Path Variable + Query Param**

```java
@DeleteMapping("/{id}")
public String deleteUserWithReason(
        @PathVariable int id,
        @RequestParam String reason
) {
    return "User " + id + " deleted for reason: " + reason;
}
```

Example hit:
`DELETE /api/users/10?reason=inactive`

---

# ✔️ **DELETE Returning ResponseEntity**

```java
@DeleteMapping("/{id}")
public ResponseEntity<String> deleteUser(@PathVariable int id) {
    return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .body("Deleted user " + id);
}
```

---

# ✔️ **DELETE with Request Body (rare but allowed)**

Spring **allows** a JSON body with DELETE, though not common.

```java
@DeleteMapping("/remove")
public String deleteWithBody(@RequestBody Map<String, Object> data) {
    return "Deleted item: " + data.get("item");
}
```

---

# ✔️ **DELETE Multiple Records Example**

```java
@DeleteMapping("/bulk")
public String deleteMultiple(@RequestBody List<Integer> ids) {
    return "Deleted users: " + ids;
}
```

---

# ✔️ **DELETE for Soft Delete Example**

```java
@DeleteMapping("/{id}/soft")
public String softDelete(@PathVariable int id) {
    return "User " + id + " marked as inactive (soft delete)";
}
```

---

# ✔️ **DELETE with Validation Example**

```java
@DeleteMapping("/{id}")
public ResponseEntity<?> deleteUser(
        @PathVariable int id,
        @RequestParam(defaultValue = "false") boolean force
) {
    if (!force && id == 1) {
        return ResponseEntity.badRequest()
                .body("Admin account cannot be deleted without force flag");
    }

    return ResponseEntity.ok("User " + id + " deleted");
}
```

---

# ✔️ Recommended Documentation File Name

* `DeleteMapping-Annotation.md`
* `SpringBoot-DeleteMapping-Examples.md`

---

If you want, I can now give you **Controller vs RestController** docs, or a **full comparison table of all mappings** (`GetMapping`, `PostMapping`, `PutMapping`, etc.).
