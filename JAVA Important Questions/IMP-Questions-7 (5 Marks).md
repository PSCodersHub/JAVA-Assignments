> [!IMPORTANT]
># Question:

Write a Java program to check a given string and throw an exception if it violates any of the following conditions:

1. If the string contains any **numeric digit (0–9)**, throw an `Exception` with the message `"Error: String contains a number!"`.
2. If the string contains any **space character**, throw an `Exception` with the message `"Error: String contains a space!"`.
3. If the string contains any **uppercase letter (A–Z)**, throw an `Exception` with the message `"Error: String contains a capital letter!"`.
4. If the **length of the string exceeds a specified limit** (for example, 15 characters), throw an `Exception` with the message `"Error: String length is greater than 15!"`.

Use a **try-catch block** to handle the exceptions and display the error message to the user.

# Example Inputs:

### 🔹Without Using User-Input

```java
public class StringExceptionExample {

    public static void main(String[] args) {

        String str = "Hello123";   // 👈 You can change this string to test
        int maxLength = 15;        // length limit

        try {
            // Check 1: Number present
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    throw new Exception("Error: String contains a number!");
                }
            }

            // Check 2: Space present
            if (str.contains(" ")) {
                throw new Exception("Error: String contains a space!");
            }

            // Check 3: Capital letter present
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    throw new Exception("Error: String contains a capital letter!");
                }
            }

            // Check 4: Length exceeds limit
            if (str.length() > maxLength) {
                throw new Exception("Error: String length is greater than " + maxLength + "!");
            }

            System.out.println("✅ String is valid: " + str);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
```

### 🔹Using User-Input

```java
import java.util.Scanner;

public class StringExceptionExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int maxLength = 15; // set length limit

        try {
            // Check 1: Number present
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    throw new Exception("Error: String contains a number!");
                }
            }

            // Check 2: Space present
            if (str.contains(" ")) {
                throw new Exception("Error: String contains a space!");
            }

            // Check 3: Capital letter present
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    throw new Exception("Error: String contains a capital letter!");
                }
            }

            // Check 4: Length exceeds limit
            if (str.length() > maxLength) {
                throw new Exception("Error: String length is greater than " + maxLength + "!");
            }

            System.out.println("✅ String is valid: " + str);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
```

---
---

## 💬 **Explanations of Key Statements**

### 🟢 `if (Character.isDigit(str.charAt(i)))`

* **`Character`** → It’s a built-in Java class in the `java.lang` package that provides methods for working with characters.
* **`isDigit(char ch)`** → This method checks if the given character `ch` is a **numeric digit** (`'0'` to `'9'`).
* **`str.charAt(i)`** → Returns the character at the specified index `i` of the string.
* So, this line checks each character in the string to see if it is a **number**.
* ✅ **If true**, it means the string contains a digit → the program throws an exception.

---

### 🟢 `if (str.contains(" "))`

* **`contains()`** is a method of the **`String`** class in Java.
* It checks whether a specific sequence of characters (in this case, a space `" "`) exists inside the string.
* ✅ **If true**, it means the string has at least one **space character** → the program throws an exception.

---

### 🟢 `if (Character.isUpperCase(str.charAt(i)))`

* **`Character.isUpperCase(char ch)`** is another static method from the **`Character`** class.
* It checks whether the given character `ch` is an **uppercase letter** (`'A'` to `'Z'`).
* ✅ **If true**, it means the string contains a **capital letter** → the program throws an exception.

---

### 🟢 `if (str.length() > maxLength)`

* **`length()`** is a method of the **`String`** class that returns the **number of characters** in the string.
* `maxLength` is a variable you define (for example, `15`) to represent the **maximum allowed string length**.
* This line compares the actual string length with the allowed limit.
* ✅ **If true**, it means the string is **too long** → the program throws an exception.

---

### 🟢 `catch (Exception e) { System.out.println(e.getMessage()); }`

* The **`catch` block** handles any exception thrown inside the `try` block.
* **`Exception e`** → catches the thrown exception object and stores it in variable `e`.
* **`e.getMessage()`** → retrieves the custom message that was passed when the exception was thrown.
* **`System.out.println(e.getMessage());`** → prints that message to the console, telling the user what went wrong.
* ✅ Example Output: `Error: String contains a number!`

---
---
># 📌Note:
Classes like `String`, `Character`, and `Exception` belong to `java.lang` package and are automatically available, so no import is needed.

---
---
<div align="center"> <h1 style=font-weight: bold;>@PSCodersHub</h1> </div>

