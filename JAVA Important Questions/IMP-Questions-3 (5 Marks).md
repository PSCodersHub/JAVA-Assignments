# Method Overloading vs Method Overriding in Java

| Aspect | Method Overloading | Method Overriding |
|--------|-------------------|-------------------|
| ***1.* Definition** | Multiple methods with same name but different parameters | Child class provides specific implementation of parent method |
| ***2.* Location** | Occurs within the same class | Occurs between parent and child classes |
| ***3.* Parameters** | Must have different parameter lists | Must have identical parameter lists |
| ***4.* Return Type** | Can be different if parameters differ | Must be same or covariant return type |
| ***5.* Binding** | Compile-time binding (Static) | Runtime binding (Dynamic) |
| ***6.* Polymorphism Type** | Compile-time polymorphism | Runtime polymorphism |
| ***7.* Inheritance Required** | No inheritance needed | Inheritance is mandatory |
| ***8.* Access Modifiers** | Can have any access modifier | Cannot reduce visibility in child class |
| ***9.* Static Methods** | Can be overloaded | Cannot be overridden (can be hidden) |
| ***10.* Final Methods** | Can be overloaded | Cannot be overridden |
| ***11.* Private Methods** | Can be overloaded | Cannot be overridden |
| ***12.* Constructor** | Can be overloaded | Cannot be overridden |
| ***13.* Purpose** | Increases code readability and reusability | Provides runtime-specific implementation |
| ***14.* Performance** | Faster (resolved at compile time) | Slower (resolved at runtime) |
| ***15.* Example Keywords** | No special keywords needed | Uses `@Override` annotation (recommended) |

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

