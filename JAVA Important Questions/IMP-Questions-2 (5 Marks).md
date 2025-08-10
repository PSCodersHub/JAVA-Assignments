# Java Programming Questions - 5 Marks Each

## Question 1: Nested Class and Inner Class (5 Marks)

### What is Nested Class?

A **Nested Class** is a class that is defined within another class. In Java, nested classes are divided into two categories:
- **Static nested classes** (also called static member classes)
- **Non-static nested classes** (also called inner classes)

### What is Inner Class?

An **Inner Class** is a non-static nested class that has access to all members (including private) of the outer class. Inner classes are associated with an instance of the outer class and cannot exist without it.

### Types of Inner Classes:

1. **Member Inner Class**
2. **Local Inner Class** 
3. **Anonymous Inner Class**
4. **Static Nested Class**

### Examples:

#### Example 1: Member Inner Class
```java
class OuterClass {
    private int outerData = 10;
    
    // Member inner class
    class InnerClass {
        public void display() {
            System.out.println("Outer data: " + outerData);
        }
    }
    
    public void createInner() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInner();
        
        // Alternative way to create inner class
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
```

#### Example 2: Local Inner Class
```java
class Calculator {
    public void calculate(int a, int b) {
        // Local inner class
        class LocalCalculator {
            public int add() {
                return a + b;
            }
            public int multiply() {
                return a * b;
            }
        }
        
        LocalCalculator calc = new LocalCalculator();
        System.out.println("Addition: " + calc.add());
        System.out.println("Multiplication: " + calc.multiply());
    }
}
```

#### Example 3: Anonymous Inner Class
```java
interface Greeting {
    void sayHello();
}

public class AnonymousExample {
    public static void main(String[] args) {
        // Anonymous inner class
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        greeting.sayHello();
    }
}
```

#### Example 4: Static Nested Class
```java
class OuterClass {
    static int staticData = 20;
    int instanceData = 30;
    
    // Static nested class
    static class StaticNested {
        public void display() {
            System.out.println("Static data: " + staticData);
            // System.out.println(instanceData); // Error: Cannot access non-static
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.StaticNested nested = new OuterClass.StaticNested();
        nested.display();
    }
}
```

***

## Question 2: Jagged Array (5 Marks)

### What is Jagged Array?

A **Jagged Array** is an array of arrays where each sub-array can have different lengths. Unlike regular multidimensional arrays where all rows have the same number of columns, jagged arrays allow rows to have varying sizes.

![Jagged Array Visualization](https://media.geeksforgeeks.org/wp-content/uploads/20250526110303024861/JaggedArray. Jagged Array:

1. **Memory Efficiency**: Only allocates memory for actual elements needed
2. **Flexibility**: Different rows can have different sizes based on requirements
3. **Dynamic Structure**: Can represent irregular data structures effectively
4. **Space Optimization**: Saves memory when dealing with sparse data

### Disadvantages of Jagged Array:

1. **Complex Access**: More complex syntax for accessing elements
2. **Performance Overhead**: Additional indirection may slow access
3. **Memory Fragmentation**: Non-contiguous memory allocation
4. **Debugging Difficulty**: Harder to debug due to irregular structure

### Examples:

#### Example 1: Basic Jagged Array Declaration and Initialization
```java
public class JaggedArrayExample1 {
    public static void main(String[] args) {
        // Declaration and initialization
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9},
            {10}
        };
        
        // Display jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

#### Example 2: Dynamic Jagged Array Creation
```java
import java.util.Scanner;

public class JaggedArrayExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        // Create jagged array
        int[][] jaggedArray = new int[rows][];
        
        // Initialize each row with different sizes
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter size of row " + i + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols];
            
            System.out.print("Enter elements: ");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        
        // Display the jagged array
        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
```

#### Example 3: Student Marks Management using Jagged Array
```java
public class StudentMarksExample {
    public static void main(String[] args) {
        // Each student has different number of subjects
        int[][] studentMarks = {
            {85, 90, 78},           // Student 1: 3 subjects
            {92, 88},               // Student 2: 2 subjects  
            {76, 84, 91, 87},       // Student 3: 4 subjects
            {95}                    // Student 4: 1 subject
        };
        
        // Calculate and display averages
        for (int i = 0; i < studentMarks.length; i++) {
            int sum = 0;
            System.out.print("Student " + (i+1) + " marks: ");
            
            for (int j = 0; j < studentMarks[i].length; j++) {
                System.out.print(studentMarks[i][j] + " ");
                sum += studentMarks[i][j];
            }
            
            double average = (double) sum / studentMarks[i].length;
            System.out.println("| Average: " + String.format("%.2f", average));
        }
    }
}
```

#### Example 4: Matrix Operations with Jagged Array
```java
public class JaggedMatrixExample {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2},
            {3, 4, 5},
            {6}
        };
        
        int[][] matrix2 = {
            {2, 3},
            {1, 2, 3},
            {4}
        };
        
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);
        
        System.out.println("\nMatrix Addition:");
        addMatrices(matrix1, matrix2);
    }
    
    static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static void addMatrices(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length && i < m2.length; i++) {
            for (int j = 0; j < m1[i].length && j < m2[i].length; j++) {
                System.out.print((m1[i][j] + m2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
```

***

## Summary

Both nested/inner classes and jagged arrays are important concepts in Java that provide flexibility in programming. Inner classes allow better encapsulation and access to outer class members, while jagged arrays provide memory-efficient storage for irregular data structures.

<div align="center"> <h2 style=font-weight: bold;">@PSCodersHub</h2> </div>