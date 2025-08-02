# Java Code Questions and Solutions (1 Marks) (Exam Point-Up-View)

This document contains *8 Java programming questions* with complete solutions, explanations, and outputs.

## Question 1:

**Question:** WAP to check whether 2 strings a and b are equal or not.

**Example Code:**
```java
public class StringComparison {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        
        if(a.equals(b)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
```

**Symbols Used:**
- `.equals()` - Method to compare string content
- `==` - Compares object references (not recommended for strings)

**Line-by-Line Explanation:**
1. `String a = "Hello";` - Declares string variable 'a' with value "Hello"
2. `String b = "Hello";` - Declares string variable 'b' with value "Hello"
3. `if(a.equals(b))` - Compares content of strings using equals() method
4. `System.out.println()` - Prints the result

**Output:** `Strings are equal`

**Note:** The answer will be `if(a.equals(b))` for **1 Mark point-up-view**.

## Question 2:

**Question:** WAP to convert a string to integer.

**Example Code:**
```java
public class StringToInteger {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("String: " + str);
        System.out.println("Integer: " + num);
        System.out.println("Type: " + num.getClass().getSimpleName());
    }
}
```

**Symbols Used:**
- `Integer.parseInt()` - Static method to convert string to integer
- `+` - String concatenation operator

**Line-by-Line Explanation:**
1. `String str = "123";` - Declares string containing numeric value
2. `int num = Integer.parseInt(str);` - Converts string to integer using parseInt()
3. Print statements display original string and converted integer

**Output:**
```
String: 123
Integer: 123
```

**Note:** The answer will be `Integer.parseInt()` for **1 Mark point-up-view**.

## Question 3:

**Question:** 
```java
int x=20;
string s = (x<15) ? "True":(x<22)?"Correct":"False";
SOP(s);
```

**Complete Code:**
```java
public class TernaryOperator {
    public static void main(String[] args) {
        int x = 20;
        String s = (x < 15) ? "True" : (x < 22) ? "Correct" : "False";
        System.out.println(s);
    }
}
```

**Symbols Used:**
- `?:` - Ternary operator (conditional operator)
- `<` - Less than comparison operator

**Line-by-Line Explanation:**
1. `int x = 20;` - Declares integer variable x with value 20
2. `String s = (x < 15) ? "True" : (x < 22) ? "Correct" : "False";`
  - First condition: `(x < 15)` evaluates to false (20 < 15 = false)
  - Second condition: `(x < 22)` evaluates to true (20 < 22 = true)
  - Result: "Correct"
3. `System.out.println(s);` - Prints the result

**Output:** `Correct`

## Question 4:

**Question:** 
```java
int c=10;
for(;;)
if(c++>10)
break;
SOP(c);
```

**Complete Code:**
```java
public class InfiniteLoop {
    public static void main(String[] args) {
        int c = 10;
        for(;;) {
            if(c++ > 10) {
                break;
            }
        }
        System.out.println(c);
    }
}
```

**Symbols Used:**
- `for(;;)` - Infinite for loop (no initialization, condition, or increment)
- `++` - Post-increment operator
- `>` - Greater than operator
- `break` - Exit loop statement

**Line-by-Line Explanation:**
1. `int c = 10;` - Declares variable c with initial value 10
2. `for(;;)` - Starts infinite loop
3. `if(c++ > 10)` - Checks if c (after increment) is greater than 10
  - First iteration: c becomes 11, condition (11 > 10) is true
4. `break;` - Exits the loop
5. `System.out.println(c);` - Prints final value of c

**Output:** `11`

## Question 5:

**Question:**
```java
int x=9 & 8;
y = ~x + 20;
z = (x<<2) + (y>>2)
SOP(z)
```

**Complete Code:**
```java
public class BitwiseOperations1 {
    public static void main(String[] args) {
        int x = 9 & 8;
        int y = ~x + 20;
        int z = (x << 2) + (y >> 2);
        System.out.println(z);
    }
}
```

**Symbols Used:**
- `&` - Bitwise AND operator
- `~` - Bitwise NOT (complement) operator
- `<<` - Left shift operator
- `>>` - Right shift operator
- `+` - Addition operator

**Line-by-Line Explanation:**
1. `int x = 9 & 8;` 
   - 9 in binary: 1001, 8 in binary: 1000
   - 1001 & 1000 = 1000 = 8
   - So x = 8
2. `int y = ~x + 20;`
   - ~8 = ~(00001000) = 11110111 = -9 (two's complement)
   - y = -9 + 20 = 11
3. `int z = (x << 2) + (y >> 2);`
   - x << 2 = 8 << 2 = 32 (left shift by 2 positions)
   - y >> 2 = 11 >> 2 = 2 (right shift by 2 positions)
   - z = 32 + 2 = 34

**Output:** `34`

## Question 6:

**Question:**
```java
boolean x = true, y = false , r;
int z = 10;
r = (x && (z-=7) > 2 && y);
r = (y ¦¦ (z+=6) == 0¦¦x)
SOP(r)
SOP(z)
```

**Complete Code:**
```java
public class BooleanOperations {
    public static void main(String[] args) {
        boolean x = true, y = false, r;
        int z = 10;
        r = (x && (z -= 7) > 2 && y);
        r = (y || (z += 6) == 0 || x);
        System.out.println(r);
        System.out.println(z);
    }
}
```

**Symbols Used:**
- `&&` - Logical AND operator
- `||` - Logical OR operator
- `-=` - Subtraction assignment operator
- `+=` - Addition assignment operator
- `>` - Greater than operator
- `==` - Equality operator

**Line-by-Line Explanation:**
1. `boolean x = true, y = false, r;` - Declares boolean variables
2. `int z = 10;` - Declares integer z with value 10
3. `r = (x && (z -= 7) > 2 && y);`
   - x is true, so continue
   - z -= 7: z becomes 3 (10-7=3)
   - (z > 2): 3 > 2 is true
   - y is false
   - true && true && false = false
   - So r = false
4. `r = (y || (z += 6) == 0 || x);`
   - y is false, so check next condition
   - z += 6: z becomes 9 (3+6=9)
   - (z == 0): 9 == 0 is false
   - x is true
   - false || false || true = true
   - So r = true

**Output:**
```
true
9
```

## Question 7:

**Question:**
```java
int x = 35, y = 29
if(x>30)
if(y<20)
{
SOP(y)
}
else
SOP(x)
```

**Complete Code:**
```java
public class NestedIf {
    public static void main(String[] args) {
        int x = 35, y = 29;
        if(x > 30) {
            if(y < 20) {
                System.out.println(y);
            } else {
                System.out.println(x);
            }
        }
    }
}
```

**Symbols Used:**
- `>` - Greater than operator
- `<` - Less than operator
- `{}` - Code blocks for if-else statements

**Line-by-Line Explanation:**
1. `int x = 35, y = 29;` - Declares two integers
2. `if(x > 30)` - Checks if x is greater than 30 (35 > 30 = true)
3. `if(y < 20)` - Nested if: checks if y is less than 20 (29 < 20 = false)
4. Since the nested condition is false, the else block executes
5. `System.out.println(x);` - Prints value of x (35)

**Output:** `35`

## Question 8:

**Question:**
```java
int x = 16¦12
y = ~x+11
z = (x>>2)+(y<<2)
SOP(z)
```

**Complete Code:**
```java
public class BitwiseOperations2 {
    public static void main(String[] args) {
        int x = 16 | 12;
        int y = ~x + 11;
        int z = (x >> 2) + (y << 2);
        System.out.println(z);
    }
}
```

**Symbols Used:**
- `|` - Bitwise OR operator
- `~` - Bitwise NOT operator
- `>>` - Right shift operator
- `<<` - Left shift operator
- `+` - Addition operator

**Line-by-Line Explanation:**
1. `int x = 16 | 12;`
  - 16 in binary: 10000, 12 in binary: 01100
  - 10000 | 01100 = 11100 = 28
  - So x = 28
2. `int y = ~x + 11;`
  - ~28 = ~(00011100) = 11100011 = -29 (two's complement)
  - y = -29 + 11 = -18
3. `int z = (x >> 2) + (y << 2);`
  - x >> 2 = 28 >> 2 = 7 (right shift by 2)
  - y << 2 = -18 << 2 = -72 (left shift by 2)
  - z = 7 + (-72) = -65

**Output:** `-65`




# Summary of Symbols Used

| Symbol | Name | Description | Example Usage | Category |
|--------|------|-------------|---------------|----------|
| `&` | Bitwise AND | Performs AND operation on each bit | `9 & 8 = 8` | Bitwise Operator |
| `|` | Bitwise OR | Performs OR operation on each bit | `16 | 12 = 28` | Bitwise Operator |
| `~` | Bitwise NOT | Inverts all bits (complement) | `~8 = -9` | Bitwise Operator |
| `>` | Right Shift | Shifts bits to the right | `28 >> 2 = 7` | Bitwise Operator |
| `&&` | Logical AND | Returns true if both operands are true | `true && false = false` | Logical Operator |
| `||` | Logical OR | Returns true if at least one operand is true | `false || true = true` | Logical Operator |
| `?:` | Ternary Operator | Conditional operator (if-else shorthand) | `(x > 5) ? "Yes" : "No"` | Conditional Operator |
| `++` | Increment | Increases value by 1 | `c++` (post-increment) | Arithmetic Operator |
| `+=` | Addition Assignment | Adds and assigns the result | `z += 6` | Compound Assignment |
| `-=` | Subtraction Assignment | Subtracts and assigns the result | `z -= 7` | Compound Assignment |
| `==` | Equality | Compares two values for equality | `x == 0` | Comparison Operator |
| `>` | Greater Than | Checks if left operand is greater | `x > 30` | Comparison Operator |
| `<` | Less Than | Checks if left operand is smaller | `y < 20` | Comparison Operator |
| `.equals()` | String Comparison | Compares string content | `a.equals(b)` | String Method |
| `Integer.parseInt()` | String to Int | Converts string to integer | `Integer.parseInt("123")` | Type Conversion |

## Key Learning Points

1. **String Comparison**: Always use `.equals()` method, not `==`
2. **Type Conversion**: Use `Integer.parseInt()` for string to integer conversion
3. **Ternary Operator**: Useful for conditional assignments
4. **Bitwise Operations**: Understand binary representations for accurate results
5. **Operator Precedence**: Be careful with evaluation order in complex expressions
6. **Short-Circuit Evaluation**: `&&` and `||` operators stop evaluation when result is determined

<div align="center"> <h2 style=font-weight: bold;">@PSCodersHub</h2> </div>
