# Abstract Class vs Interface in Java

| **Aspect**          | **Abstract Class**                                                     | **Interface**                                                                                    |
| ------------------- | ---------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------ |
| ***1.* Methods**          | Can have abstract and non-abstract methods| Can have only abstract methods (until Java 8). Since Java 8, can have default and static methods|
| ***2.* Inheritance**      | Does not support multiple inheritance| Supports multiple inheritance|
| ***3.* Variables**        | Can have final, non-final, static and non-static variables| Can only have static and final variables|
| ***4.* Keyword**          | Declared using `abstract` keyword| Declared using `interface` keyword|
| ***5.* Extension**        | Can extend another class and implement multiple interfaces| Can extend another interface only|
| ***6.* Usage**            | Extended using `extends` keyword| Implemented using `implements` keyword|
| ***7.* Access Modifiers** | Can have private, protected, and public members| Members are public by default|
| ***8.* Constructor**      | Can have constructors| Cannot have constructors|
| ***9.* Instantiation**   | Cannot be instantiated directly| Cannot be instantiated directly|
| ***10.* Performance** | Slightly better performance due to less indirection| May have more indirection due to multiple inheritance (in some cases)|
| ***11.* Example**          | <br>public abstract class Shape<br>{<br>abstract void draw();<br>} | <br>public interface Drawable<br>{<br>void draw();<br>}                                      |

---
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
