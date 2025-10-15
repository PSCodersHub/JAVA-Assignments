# Method Overloading vs Method Overriding in Java

| Aspect | Method Overloading | Method Overriding |
|--------|-------------------|-------------------|
| **Definition** | Multiple methods with same name but different parameters | Child class provides specific implementation of parent method |
| **Location** | Occurs within the same class | Occurs between parent and child classes |
| **Parameters** | Must have different parameter lists | Must have identical parameter lists |
| **Return Type** | Can be different if parameters differ | Must be same or covariant return type |
| **Binding** | Compile-time binding (Static) | Runtime binding (Dynamic) |
| **Polymorphism Type** | Compile-time polymorphism | Runtime polymorphism |
| **Inheritance Required** | No inheritance needed | Inheritance is mandatory |
| **Access Modifiers** | Can have any access modifier | Cannot reduce visibility in child class |
| **Static Methods** | Can be overloaded | Cannot be overridden (can be hidden) |
| **Final Methods** | Can be overloaded | Cannot be overridden |
| **Private Methods** | Can be overloaded | Cannot be overridden |
| **Constructor** | Can be overloaded | Cannot be overridden |
| **Purpose** | Increases code readability and reusability | Provides runtime-specific implementation |
| **Performance** | Faster (resolved at compile time) | Slower (resolved at runtime) |
| **Example Keywords** | No special keywords needed | Uses `@Override` annotation (recommended) |

## Key Points

- **Overloading**: Same method name, different signatures
- **Overriding**: Same method signature, different implementation
- **Memory**: Overloading uses less memory overhead
- **Flexibility**: Overriding provides more runtime flexibility

***

---

## 📌 NOTE:

> In the **final semester**, from the following two topics:
>
> * [Method Overloading vs Method Overriding in Java](https://github.com/PSCodersHub/JAVA-Assignments/blob/main/JAVA%20Important%20Questions/IMP-Questions-3%20(5%20Marks).md#method-overloading-vs-method-overriding-in-java)
> * [Abstract Class vs Interface in Java](https://github.com/PSCodersHub/JAVA-Assignments/blob/main/JAVA%20Important%20Questions/IMP-Questions-6%20(5%20Marks).md#abstract-class-vs-interface-in-java)
>
> **One of these two differences will definitely appear in the exam. Be well-prepared!**

---

<div align="center"> <h2 style=font-weight: bold;">@PSCodersHub</h2> </div>
