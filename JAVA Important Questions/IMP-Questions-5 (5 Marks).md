## Q1. What is Super Key? What are the different uses of super key with example?

**Ans:**  
The `super` keyword in Java is a reference variable that is used to refer to the immediate parent class object. It is used to access methods, constructors, or variables of the parent class when they are overridden or hidden in the subclass.

### Uses of `super` key:

1. **Access Parent Class Variables**  
   When the subclass has a variable with the same name as the parent class, `super` can be used to access the parent class variable.

   ```java
   class Parent {
       int x = 10;
   }

   class Child extends Parent {
       int x = 20;

       void display() {
           System.out.println("Child x: " + x);
           System.out.println("Parent x: " + super.x);
       }
   }
   ```

2. **Call Parent Class Methods**
   If a method is overridden in the subclass, `super` can be used to call the parent class version.

   ```java
   class Parent {
       void show() {
           System.out.println("Parent method");
       }
   }

   class Child extends Parent {
       void show() {
           super.show(); // calls Parent method
           System.out.println("Child method");
       }
   }
   ```

3. **Invoke Parent Class Constructor**
   `super()` is used to call the constructor of the parent class.

   ```java
   class Parent {
       Parent() {
           System.out.println("Parent Constructor");
       }
   }

   class Child extends Parent {
       Child() {
           super(); // calls Parent constructor
           System.out.println("Child Constructor");
       }
   }
   ```

---
---

## Q2. What is Final Key? What are the different uses of final key with example?

**Ans:**
The `final` keyword in Java is used to denote constants, prevent method overriding, and inheritance. Once a variable or method or class is declared as `final`, it cannot be changed/extended/overridden.

### Uses of `final` key:

1. **Final Variable (Constant)**
   Once assigned, its value cannot be changed.

   ```java
   class Example {
       final int MAX_VALUE = 100;

       void display() {
           System.out.println("MAX_VALUE = " + MAX_VALUE);
       }
   }
   ```

2. **Final Method**
   Prevents a method from being overridden by subclasses.

   ```java
   class Parent {
       final void display() {
           System.out.println("Final method in parent");
       }
   }

   class Child extends Parent {
       // void display() {} // Error: Cannot override the final method
   }
   ```

3. **Final Class**
   Prevents a class from being inherited.

   ```java
   final class FinalClass {
       void show() {
           System.out.println("Final class method");
       }
   }

   // class SubClass extends FinalClass {} // Error: Cannot inherit from final class
   ```

---
---

## Q3. Difference between Super keyword and Final keyword?

**Ans:**

| **Feature**                          | **`super` Keyword**                                 | **`final` Keyword**                                  |
|-------------------------------------|-----------------------------------------------------|------------------------------------------------------|
| **Purpose**                         | Refers to the parent class object                   | Prevents modification (override/extend/change)       |
| **Used With**                       | Variables, methods, constructors                    | Variables, methods, classes                          |
| **Can it affect inheritance?**      | No (used within inheritance)                        | Yes (restricts inheritance and overriding)           |
| **Example Use**                     | `super.methodName()` to call parent method          | `final int x = 10;` to make a constant               |
| **Can it be used on classes?**      | No                                                  | Yes (to prevent inheritance)                         |
| **Accessing Parent Members**        | Used to access parent class variables/methods       | Not used for accessing any members                   |
| **Calling Parent Constructor**      | `super()` calls parent class constructor            | Not applicable                                       |
| **Used in Method Overriding?**      | Yes, to call the overridden method in parent class  | Yes, to prevent method overriding                    |
| **Modifies Behavior?**              | No — only accesses parent class elements            | Yes — restricts changes to class/method/variable     |
| **Inheritance Restriction**         | Doesn't restrict inheritance                        | Can restrict method or class from being inherited    |
| **Compiler Role**                   | Helps in resolving ambiguity in inheritance         | Enforced by compiler to prevent changes              |

---
---

<div align="center"> <h2 style=font-weight: bold;">@PSCodersHub</h2> </div>