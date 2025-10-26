# IMP Question:

Write a Java program to check a given string and throw appropriate exceptions based on the following conditions:

1. If the string contains any **numeric digit (0–9)**, throw a `NumberFoundException`.
2. If the string contains any **space character**, throw a `SpaceFoundException`.
3. If the string contains any **uppercase letter (A–Z)**, throw a `CapitalLetterFoundException`.
4. If the **length of the string exceeds a specified limit (for example, 15 characters)**, throw a `LengthExceededException`.

Create **user-defined exception classes** for each of the above cases and handle them using a `try-catch` block.

# Example Inputs:

### 🔹Without Using User-Input

```java
// Custom exception classes
class NumberFoundException extends Exception {
    public NumberFoundException(String message) {
        super(message);
    }
}

class SpaceFoundException extends Exception {
    public SpaceFoundException(String message) {
        super(message);
    }
}

class CapitalLetterFoundException extends Exception {
    public CapitalLetterFoundException(String message) {
        super(message);
    }
}

class LengthExceededException extends Exception {
    public LengthExceededException(String message) {
        super(message);
    }
}

// Main class
public class StringExceptionExample {

    public static void main(String[] args) {

        String str = "Hello123";   // 👈 You can change this string to test
        int maxLength = 15;        // Maximum allowed length

        try {
            // Check 1: Number present
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    throw new NumberFoundException("Error: String contains a number!");
                }
            }

            // Check 2: Space present
            if (str.contains(" ")) {
                throw new SpaceFoundException("Error: String contains a space!");
            }

            // Check 3: Capital letter present
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    throw new CapitalLetterFoundException("Error: String contains a capital letter!");
                }
            }

            // Check 4: Length exceeds limit
            if (str.length() > maxLength) {
                throw new LengthExceededException("Error: String length is greater than " + maxLength + "!");
            }

            // If all checks pass
            System.out.println("✅ String is valid: " + str);

        } 
        // Catch each custom exception individually
        catch (NumberFoundException | SpaceFoundException | 
               CapitalLetterFoundException | LengthExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

### 🔹Using User-Input

```java
import java.util.Scanner;

// Custom exception classes
class NumberFoundException extends Exception {
    public NumberFoundException(String message) {
        super(message);
    }
}

class SpaceFoundException extends Exception {
    public SpaceFoundException(String message) {
        super(message);
    }
}

class CapitalLetterFoundException extends Exception {
    public CapitalLetterFoundException(String message) {
        super(message);
    }
}

class LengthExceededException extends Exception {
    public LengthExceededException(String message) {
        super(message);
    }
}

// Main class
public class StringExceptionExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();    // Take user input

        int maxLength = 15;            // Maximum allowed length

        try {
            // Check 1: Number present
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    throw new NumberFoundException("Error: String contains a number!");
                }
            }

            // Check 2: Space present
            if (str.contains(" ")) {
                throw new SpaceFoundException("Error: String contains a space!");
            }

            // Check 3: Capital letter present
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    throw new CapitalLetterFoundException("Error: String contains a capital letter!");
                }
            }

            // Check 4: Length exceeds limit
            if (str.length() > maxLength) {
                throw new LengthExceededException("Error: String length is greater than " + maxLength + "!");
            }

            // If all checks pass
            System.out.println("✅ String is valid: " + str);

        } 
        // Catch all custom exceptions
        catch (NumberFoundException | SpaceFoundException | 
               CapitalLetterFoundException | LengthExceededException e) {
            System.out.println(e.getMessage());
        }

        sc.close(); // Close the scanner
    }
}
```

---
---

## 💬 **Explanations of Key Statements (Custom Exceptions Version)**

### 🟢 `class NumberFoundException extends Exception`

* **`Exception`** → It’s a built-in Java class that represents errors or exceptional conditions in a program.
* **`extends Exception`** → By extending `Exception`, `NumberFoundException` becomes a **custom exception** that can be thrown and caught like any other exception.
* **Constructor `NumberFoundException(String message)`** → Calls `super(message)` to pass a **custom error message** to the `Exception` class.

---

### 🟢 `class SpaceFoundException extends Exception`

* Similar to `NumberFoundException`, this **custom exception** is thrown when the string contains a **space character**.
* The constructor takes a **message string** and passes it to the parent `Exception` class.

---

### 🟢 `class CapitalLetterFoundException extends Exception`

* A **custom exception** that is thrown when the string contains an **uppercase letter (A–Z)**.
* Inherits from `Exception` and uses the constructor to pass a **custom error message**.

---

### 🟢 `class LengthExceededException extends Exception`

* A **custom exception** thrown when the **string length exceeds a specified limit**.
* Uses the constructor to pass a descriptive **error message** to the `Exception` class.

---

### 🟢 `if (Character.isDigit(str.charAt(i))) { throw new NumberFoundException("Error: String contains a number!"); }`

* **`Character.isDigit(str.charAt(i))`** → Checks if the character at position `i` is a **numeric digit (0–9)**.
* **`throw new NumberFoundException(...)`** → Throws a **custom exception** with a descriptive message if a number is found.

---

### 🟢 `if (str.contains(" ")) { throw new SpaceFoundException("Error: String contains a space!"); }`

* **`str.contains(" ")`** → Checks if the string contains **any space character**.
* **`throw new SpaceFoundException(...)`** → Throws the **custom exception** if a space is found.

---

### 🟢 `if (Character.isUpperCase(str.charAt(i))) { throw new CapitalLetterFoundException("Error: String contains a capital letter!"); }`

* **`Character.isUpperCase(str.charAt(i))`** → Checks if the character at position `i` is an **uppercase letter (A–Z)**.
* **`throw new CapitalLetterFoundException(...)`** → Throws the **custom exception** if an uppercase letter is found.

---

### 🟢 `if (str.length() > maxLength) { throw new LengthExceededException("Error: String length is greater than " + maxLength + "!"); }`

* **`str.length()`** → Returns the **number of characters** in the string.
* Compares with `maxLength` → If the string is too long, it throws the **LengthExceededException** with a descriptive message.

---

### 🟢 `catch (NumberFoundException | SpaceFoundException | CapitalLetterFoundException | LengthExceededException e) { System.out.println(e.getMessage()); }`

* **`catch` block** → Catches **any of the four custom exceptions** thrown in the `try` block.
* **`e.getMessage()`** → Retrieves the **error message** passed when the exception was thrown.
* **`System.out.println(e.getMessage())`** → Prints the message to inform the user why the string is invalid.

---
---

# **📌 Step-by-Step Explanation: `NumberFoundException`**

### 1️⃣ **Custom Exception Class**

```java
class NumberFoundException extends Exception {
    public NumberFoundException(String message) {
        super(message);
    }
}
```

* We create a **custom exception** named `NumberFoundException`.
* It **extends `Exception`**, so it behaves like a normal exception in Java.
* The **constructor** takes a `message` string and passes it to the parent `Exception` class using `super(message)`.
* This allows us to **give a custom error message** when this exception is thrown.

---

### 2️⃣ **Checking the String for Numbers**

```java
for (int i = 0; i < str.length(); i++) {
    if (Character.isDigit(str.charAt(i))) {
        throw new NumberFoundException("Error: String contains a number!");
    }
}
```

* `str.charAt(i)` → gets the character at position `i` in the string.
* `Character.isDigit(...)` → checks if that character is a **digit (0–9)**.
* **If a digit is found**, the code executes:

```java
throw new NumberFoundException("Error: String contains a number!");
```

* **`throw`** immediately stops normal execution and creates a **NumberFoundException object** with the message `"Error: String contains a number!"`.

---

### 3️⃣ **Exception Handling in the `try-catch` Block**

```java
try {
    // checks including NumberFoundException
} 
catch (NumberFoundException | SpaceFoundException | 
       CapitalLetterFoundException | LengthExceededException e) {
    System.out.println(e.getMessage());
}
```

* The **`try` block** contains the code that might throw exceptions.
* When `NumberFoundException` is thrown, Java **stops executing further statements inside the try block**.
* Control is transferred to the **matching catch block**.
* Here, we use **multi-catch** to handle all four exceptions in one block.
* `e.getMessage()` retrieves the **custom message** we passed when throwing the exception.
* `System.out.println(e.getMessage())` prints:

```
Error: String contains a number!
```

---

### 4️⃣ **Program Flow**

1. The program starts executing the **`try` block**.
2. It loops through each character in the string `"Hello123"`.
3. When it encounters `'1'` (a digit), `Character.isDigit('1')` returns **true**.
4. A **NumberFoundException is thrown**, and execution of the try block stops immediately.
5. The **catch block catches the exception**, retrieves the message, and prints it.
6. The program does **not check for spaces, capital letters, or length** after the exception is thrown.

---

### ✅ **Summary**

* `NumberFoundException` is **thrown** when the string contains a number.
* The **try-catch block handles it**, prints the custom message, and prevents the program from crashing.
* This is the **mechanism of custom exceptions in Java**: detect a specific error condition → throw a custom exception → catch it → display a meaningful message.

---

---

# 💡 **Optimization Tip: Combine Loops**

Instead of using two separate loops to check for **numbers** and **uppercase letters**, you can combine them into a single loop for better efficiency:

```java
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);

    // Check for numeric digit
    if (Character.isDigit(ch)) {
        throw new NumberFoundException("Error: String contains a number!");
    }

    // Check for uppercase letter
    if (Character.isUpperCase(ch)) {
        throw new CapitalLetterFoundException("Error: String contains a capital letter!");
    }
}
```

✅ This single loop performs both checks in **one pass through the string**, making the code cleaner and more efficient.

---
---
># 🚩Note:
The execution flow demonstrated for `NumberFoundException` is applicable to all other custom exceptions in this program.

---
---
<div align="center"> <h1 style=font-weight: bold;>@PSCodersHub</h1> </div>