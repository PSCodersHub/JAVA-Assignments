# Abstract Class vs Interface in Java

| **Aspect**          | **Abstract Class**                                                     | **Interface**                                                                                    |
| ------------------- | ---------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------ |
| 1. Methods          | Can have abstract and non-abstract methods                             | Can have only abstract methods (until Java 8). Since Java 8, can have default and static methods |
| 2. Inheritance      | Does not support multiple inheritance                                  | Supports multiple inheritance                                                                    |
| 3. Variables        | Can have final, non-final, static and non-static variables             | Can only have static and final variables                                                         |
| 4. Keyword          | Declared using `abstract` keyword                                      | Declared using `interface` keyword                                                               |
| 5. Extension        | Can extend another class and implement multiple interfaces             | Can extend another interface only                                                                |
| 6. Usage            | Extended using `extends` keyword                                       | Implemented using `implements` keyword                                                           |
| 7. Access Modifiers | Can have private, protected, and public members                        | Members are public by default                                                                    |
| 9. Constructor      | Can have constructors                                                  | Cannot have constructors                                                                         |
| 10. Instantiation   | Cannot be instantiated directly                                        | Cannot be instantiated directly                                                                  |
| 11. Performance     | Slightly better performance due to less indirection                    | May have more indirection due to multiple inheritance (in some cases)                            |
| 8. Example          | `java<br>public abstract class Shape {<br> abstract void draw();<br>}` | `java<br>public interface Drawable {<br> void draw();<br>}`                                      |

---


```java
public abstract class Shape {
    abstract void draw();  // Abstract method
}
```

* Used as a base class.
* Subclasses like `Circle`, `Rectangle` will extend `Shape` and implement `draw()`.

### Interface: Drawable

```java
public interface Drawable {
    void draw();  // Method without body
}
```

---

## 📌 NOTE:

> In the **final semester**, from the following two topics:
>
> * [Method Overloading vs Method Overriding in Java]()
> * [Abstract Class vs Interface in Java]()
>
> **One of these two differences will definitely appear in the exam. Be well-prepared!**

---

