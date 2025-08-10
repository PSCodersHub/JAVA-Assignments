# Java Programming Questions - 5 Marks Each

## Question 1:  What is Nested Class ? What is Inner class ? Give the example of the inner class ?

### What is Nested Class?

A **Nested Class** is a class that is defined within another class. In Java, nested classes are used to logically group classes that are only used in one place, increase encapsulation, and create more readable and maintainable code.

**Types of Nested Classes:**
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

## Question 2: What do you mean by Jagged Array and Write the Advantages and Disadvantages of Jagged Array ?

### What is Jagged Array?

#### Definition 1:
A **Jagged Array** is an array of arrays where each sub-array can have different lengths. Unlike regular multidimensional arrays where all rows have the same number of columns, jagged arrays allow rows to have varying sizes.

#### Definition 2:
A **Jagged Array** is a multidimensional array where each row can have a different number of columns. Unlike regular 2D arrays where all rows have the same length, jagged arrays allow rows of varying lengths, creating a "jagged" appearance.

<div align="center"> <img src="https://media.geeksforgeeks.org/wp-content/uploads/20250526110303024861/JaggedArray.webp" alt="Jagged Array" width="500"> </div>

### Advantages of Jagged Array:

1. **Memory Efficiency**: Saves memory by allocating only required space for each row
2. **Flexible Structure**: Allows different row sizes based on actual data requirements
3. **Dynamic Allocation**: Rows can be allocated dynamically as needed
4. **Real-world Representation**: Better represents irregular data structures
5. **Reduced Memory Wastage**: No unused memory allocation for shorter rows

### Disadvantages of Jagged Array:

1. **Complex Indexing**: More complex to navigate compared to regular arrays
2. **Increased Complexity**: Code becomes more complex for operations like traversal
3. **Performance Overhead**: May have slight performance overhead due to irregular structure
4. **Debugging Difficulty**: Harder to debug due to varying row lengths
5. **Cache Performance**: May have poor cache locality compared to regular arrays
6. **Memory Fragmentation**: Non-contiguous memory allocation
7. **Debugging Difficulty**: Harder to debug due to irregular structure


```java
// Declaration
int[][] jaggedArray;

// Initialization with different row sizes
jaggedArray = new int[3][]; // 3 rows, columns not specified
jaggedArray[0] = new int[4]; // First row has 4 columns
jaggedArray[1] = new int[2]; // Second row has 2 columns  
jaggedArray[2] = new int[3]; // Third row has 3 columns

// Direct initialization
int[][] jaggedArray2 = {
    {1, 2, 3, 4},
    {5, 6},
    {7, 8, 9}
};
```

### Example Program:

```java
public class JaggedArrayExample {
    public static void main(String[] args) {
        // Creating jagged array
        int[][] jaggedArray = {
            {1, 2, 3, 4, 5},
            {6, 7},
            {8, 9, 10, 11},
            {12}
        };
        
        // Displaying jagged array
        System.out.println("Jagged Array Elements:");
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

***

## Summary

Both nested/inner classes and jagged arrays are important concepts in Java that provide flexibility in programming. Inner classes allow better encapsulation and access to outer class members, while jagged arrays provide memory-efficient storage for irregular data structures.


<div align="center"> <h2 style=font-weight: bold;">@PSCodersHub</h2> </div>
