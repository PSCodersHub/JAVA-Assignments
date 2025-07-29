// Question-3: Program to swap two numbers without using third variable
// Part 1: Using XOR (^) operator for swapping
// Part 2: Using addition/subtraction (+/-) operators for restoration

// Import Scanner class for taking user input
import java.util.Scanner;

// Define a public class named SwapOP
class SwapOP {
    // Main method - entry point of the program
    public static void main(String args[]) {
        
        // Create Scanner object to read input from console
        Scanner s = new Scanner(System.in);
        
        // Declare two integer variables to store the numbers
        int a, b;
        
        // Prompt user to enter first number
        System.out.println("Enter the value of a: ");
        a = s.nextInt();  // Read and store first number
        
        // Prompt user to enter second number
        System.out.println("Enter the value of b: ");
        b = s.nextInt();  // Read and store second number
        
        // ============================================
        // PART 1: XOR SWAPPING (Without third variable)
        // ============================================
        
        // XOR PROPERTY: A ^ A = 0, A ^ 0 = A
        // This property allows us to swap without temporary variable
        
        // Step 1: Store XOR of both numbers in 'a'
        // a now contains the "key" to retrieve both original values
        a ^= b;  // a = a ^ b (a becomes XOR of original a and b)
        
        // Step 2: Extract original value of 'a' and store in 'b'  
        // Since a = (original_a ^ original_b), and b = original_b
        // Then: a ^ b = (original_a ^ original_b) ^ original_b = original_a
        b ^= a;  // b = b ^ a (b becomes original value of a)
        
        // Step 3: Extract original value of 'b' and store in 'a'
        // Since a = (original_a ^ original_b), and b = original_a  
        // Then: a ^ b = (original_a ^ original_b) ^ original_a = original_b
        a ^= b;  // a = a ^ b (a becomes original value of b)
        
        // Display the swapped values
        System.out.println("After Swapping value of a: " + a);
        System.out.println("After Swapping value of b: " + b);
        
        // ============================================
        // PART 2: RESTORATION USING +/- OPERATORS
        // ============================================
        
        // Current state: a = 4 (original b), b = 8 (original a)
        // Goal: Restore to original values: a = 8, b = 4
        
        // Step 1: Store sum of both current values in 'a'
        // This sum contains both values and acts as a "reservoir"
        a = a + b; // a = 4 + 8 = 12 (sum contains both values)
        
        // Step 2: Extract original value of 'a' and store in 'b'
        // Since sum = current_a + current_b, and current_b = original_a
        // Then: sum - current_b = current_a = original_b, but we want original_a
        // So: sum - current_a = original_a  
        b = a - b; // b = 12 - 8 = 4 (original value of a)
        
        // Step 3: Extract original value of 'b' and store in 'a'
        // Since sum = original_a + original_b, and b = original_a
        // Then: sum - original_a = original_b
        a = a - b; // a = 12 - 4 = 8 (original value of b)
        
        // Display the restored values (back to original)
        System.out.println("Restored value of a: " + a);
        System.out.println("Restored value of b: " + b);
        
        // Close Scanner to free system resources
        s.close();
    }
}

/*
 * DETAILED MATHEMATICAL EXPLANATION:
 * 
 * ==========================================
 * WHY XOR SWAPPING WORKS:
 * ==========================================
 * 
 * XOR Properties:
 * 1. A ^ A = 0 (any number XOR with itself gives 0) (1 ^ 1 = 0)
 * 2. A ^ 0 = A (any number XOR with 0 gives itself) (1 ^ 0 = 1) 
 * 3. XOR is commutative: A ^ B = B ^ A
 * 4. XOR is associative: (A ^ B) ^ C = A ^ (B ^ C)
 * 
 * With original values a=8, b=4:
 * 
 * Binary representations:
 * 8 = 1000
 * 4 = 0100
 * 
 * Step-by-step XOR swapping:
 * 
 * Initial: a=8 (1000), b=4 (0100)
 * 
 * Step 1: a ^= b
 * a = 8 ^ 4 = 1000 ^ 0100 = 1100 = 12
 * State: a=12, b=4
 * 
 * Step 2: b ^= a  
 * b = 4 ^ 12 = 0100 ^ 1100 = 1000 = 8 (original value of a!)
 * State: a=12, b=8
 * 
 * Step 3: a ^= b
 * a = 12 ^ 8 = 1100 ^ 1000 = 0100 = 4 (original value of b!)
 * Final: a=4, b=8 ✓ Successfully swapped!
 * 
 * ==========================================
 * WHY ADDITION/SUBTRACTION RESTORATION WORKS:
 * ==========================================
 * 
 * Mathematical Principle:
 * If you know the sum of two numbers, you can retrieve each individual
 * number by subtracting the other from the sum.
 * 
 * Given: sum = x + y
 * Then: x = sum - y, and y = sum - x
 * 
 * With swapped values a=4, b=8:
 * 
 * Step 1: a = a + b
 * a = 4 + 8 = 12 (sum reservoir)
 * State: a=12, b=8
 * 
 * Step 2: b = a - b  
 * b = 12 - 8 = 4 (this gives us original value of a)
 * State: a=12, b=4
 * 
 * Step 3: a = a - b
 * a = 12 - 4 = 8 (this gives us original value of b)
 * Final: a=8, b=4 ✓ Successfully restored!
 * 
 * ==========================================
 * ALGORITHM COMPARISON:
 * ==========================================
 * 
 * Traditional Swapping (using temp variable):
 * temp = a; a = b; b = temp;
 * - Pros: Simple to understand, works with any data type
 * - Cons: Requires extra memory for temp variable
 * 
 * XOR Swapping:
 * a ^= b; b ^= a; a ^= b;
 * - Pros: No extra memory, works in-place
 * - Cons: Only works with integers, harder to understand
 * - Warning: Fails if a and b point to same memory location
 * 
 * Addition/Subtraction Swapping:
 * a = a + b; b = a - b; a = a - b;
 * - Pros: No extra memory, mathematically elegant
 * - Cons: Risk of integer overflow for large numbers
 * 
 * ==========================================
 * COMPLETE EXECUTION TRACE (a=8, b=4):
 * ==========================================
 * 
 * Initial State: a=8, b=4
 * 
 * XOR Swapping Phase:
 * a ^= b  → a=12, b=4   (a stores XOR key)
 * b ^= a  → a=12, b=8   (b gets original a)  
 * a ^= b  → a=4,  b=8   (a gets original b) ✓ Swapped
 * 
 * Restoration Phase:
 * a = a + b → a=12, b=8  (a stores sum)
 * b = a - b → a=12, b=4  (b gets original a)
 * a = a - b → a=8,  b=4  (a gets original b) ✓ Restored
 * 
 * Final Result: Back to original values a=8, b=4
 * 
 * 
 * 
 * 
 * 
 * FINAL OUTPUT:
 * Enter the value of a: 
 * 8
 * Enter the value of b: 
 * 4
 * After Swapping value of a: 4         ← XOR swapping complete
 * After Swapping value of b: 8         ← Values are swapped
 * Restored value of a: 8               ← Back to original
 * Restored value of b: 4               ← Back to original
 */
