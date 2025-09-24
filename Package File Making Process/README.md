# 📦 How to Make a Package File in Java

In Java, **packages** are used to group related classes together and to avoid name conflicts. Creating your own package is a great way to organize your code in a clean, modular way.

This guide explains how to create and use a package in Java using a simple example.

---

### 🧾 Example Code

#### 1. **Create a Package: `pack`**

Create a Java class named `Arithmetic` inside a package called `pack`.

📄 **Arithmetic.java**

```java
package pack;

public class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b != 0)
            return a / b;
        else
            System.out.println("Cannot divide by zero!");
        return 0;
    }
}
```

#### 2. **Use the Package in Another Class**

Now, create another class that imports and uses the `Arithmetic` class from the `pack` package.

📄 **TestPack.java**

```java
import pack.Arithmetic;

class TestPack {
    public static void main(String args[]) {
        Arithmetic calc = new Arithmetic();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.sub(10, 5));
        System.out.println("Multiplication: " + calc.mul(10, 5));
        System.out.println("Division: " + calc.div(10, 5));
    }
}
```

---

### 🛠️ Compile and Run Commands

To compile and run Java code using packages, follow these steps.

#### 🔹 Step 1: Compile the Package Class

```bash
javac -d D:\PS-Data Arithmetic.java
```

* `javac` – Java compiler command.
* `-d` – Specifies the destination folder where the `.class` files should be placed.
* `D:\PS-Data` – Destination folder for compiled package files. This creates a subdirectory `pack` automatically. <b>*(This is just an example path. Replace it with your own folder path or use your current working directory.)*</b>
* `Arithmetic.java` – The file to be compiled.

This creates the structure:

```
D:\PS-Data
└── pack
    └── Arithmetic.class
```
---
---

## 🛠️ Minor Suggestions (Optional)

#### 🔹 Step 1: Compile the Package Class

Instead of using a fixed directory like `D:\PS-Data`, you can use the **current working directory** by using `.` (a dot) with the `-d` option:

```bash
javac -d . Arithmetic.java
```

**Explanation:**

* `javac` – Java compiler command.
* `-d .` – Places the compiled `.class` files into the correct package folder inside your current directory.
* `Arithmetic.java` – The file to be compiled.

This will automatically create a folder structure like:

```
./pack/
└── Arithmetic.class
```
---
---

#### 🔹 Step 2: Compile the Main Class

```bash
javac TestPack.java
```

Make sure this file is in the same directory (or you adjust your classpath accordingly).

---

#### 🔹 Step 3: Run the Program

```bash
java TestPack
```

> Since the `TestPack.class` file is in the current directory and it references `pack.Arithmetic`, Java will use the compiled package from the path provided earlier.

---

### 🖨️ Output

```
Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2
```

---

### 📘 Notes

* **Packages** help avoid class name conflicts.
* They also help maintain large codebases by logically grouping related classes.
* Use the `-d` option when compiling to ensure your `.class` files are placed in the correct package directories.
* Always use the correct **import statement** to access classes from a package.

---

## 📁 File Structure Summary

### Either of the following depending on your compilation method:

#### Using `-d D:\PS-Data`:
```
D:\PS-Data\
├── Arithmetic.java        // contains: package pack;
├── TestPack.java          // contains: import pack.Arithmetic;
├── TestPack.class
└── pack\
    └── Arithmetic.class
```
#### Using `-d .`:
```
YourWorkingDirectory/
├── Arithmetic.java
├── TestPack.java
├── pack/
│   └── Arithmetic.class
└── TestPack.class
```
---


<div align="center"> <h2 style=font-weight: bold;>@PSCodersHub</h2> </div>
