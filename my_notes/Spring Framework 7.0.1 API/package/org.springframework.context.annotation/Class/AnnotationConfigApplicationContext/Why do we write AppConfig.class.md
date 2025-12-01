Great — this is a **very common doubt**, and the answer is simple once you understand **what Spring expects**.

---

# ✅ **Why do we write `AppConfig.class`?**

Because **Spring needs the *Class object***, not an *object instance*.

`AnnotationConfigApplicationContext` expects **metadata**, not a created object.

---

# 🔍 **Deep Explanation**

When you write:

```java
new AnnotationConfigApplicationContext(AppConfig.class);
```

You are **NOT** passing an object of `AppConfig`.

You are passing a **Class literal**, which is a `Class<?>` type — a Java reflection object.

Meaning:

* `AppConfig.class` = *the class definition*
* `new AppConfig()` = *an object*

Spring needs the **class definition**, so it can:

1. Scan it for `@Configuration`
2. Look at methods annotated with `@Bean`
3. Read component scan information
4. Create beans inside the IoC container

So **Spring creates the object**, not you.

---

# 🧠 **Difference in simple terms**

| Expression        | Meaning                                             |
| ----------------- | --------------------------------------------------- |
| `AppConfig.class` | "Here is the blueprint; use reflection to read it." |
| `new AppConfig()` | "Here is a created object instance."                |

Spring does **not** want an object instance.
Why?

Because **Spring itself creates the configuration object internally**, using proxies (CGLIB).

---

# 🔧 Example Why Instance Won’t Work

This will NOT work:

```java
new AnnotationConfigApplicationContext(new AppConfig());
```

Because Spring wants the **class**, not the **object**.

---

# 📌 Important Point

In Java:

* `.class` = **Class literal**
* `Class<?>` = a reflection object used by frameworks

Spring uses these `Class` objects to **scan annotations** and **build the container**.

---

# 🎯 Summary (Super Simple)

We write `AppConfig.class` because:

* Spring needs to **read** the class
* Not **create** or **use** our object
* To perform **annotation scanning** and **bean registration using reflection**

---

If you want, I can also explain **how Spring converts that Class into BeanDefinitions internally**.
