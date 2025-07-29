// Question-2: Program to demonstrate bitwise shift operators (<<, >>, >>>)

// Import Scanner class for taking user input
import java.util.Scanner;

// Define a public class named ShiftOP
class ShiftOP {
    // Main method - entry point of the program
    public static void main(String args[]) {
        
        // Create Scanner object to read input from console
        Scanner s = new Scanner(System.in);
        
        // Declare two integer variables:
        // v = original number to be shifted
        // n = number of positions to shift
        int v, n;
        
        // Prompt user to enter the original number
        System.out.println("Enter the value of v: ");
        v = s.nextInt();  // Read and store the value
        
        // Prompt user to enter the shift positions
        System.out.println("Enter the value of n: ");
        n = s.nextInt();  // Read and store the shift count
        
        // LEFT SHIFT OPERATOR (<<)
        // Shifts bits to the left by n positions
        // Equivalent to multiplying by 2^n
        // Empty positions on right are filled with 0s
        System.out.println(v << n); // Leftshift
        
        // RIGHT SHIFT OPERATOR (>>) - Arithmetic/Signed Right Shift
        // Shifts bits to the right by n positions
        // Equivalent to dividing by 2^n (with floor division)
        // For positive numbers: fills left with 0s
        // For negative numbers: fills left with 1s (preserves sign)
        System.out.println(v >> n); // Rightshift
        
        // UNSIGNED RIGHT SHIFT OPERATOR (>>>) - Logical Right Shift
        // Shifts bits to the right by n positions
        // ALWAYS fills left positions with 0s (regardless of sign)
        // Treats the number as unsigned 32-bit integer
        System.out.println(v >>> n); // Unsigned rightshift
        
        // Close Scanner to free system resources
        s.close();
    }
}

/*
 * DETAILED EXPLANATION OF BITWISE SHIFT OPERATORS:
 * 
 * WHY THESE OPERATORS EXIST:
 * 1. LEFT SHIFT (<<)  - Fast multiplication by powers of 2
 * 2. RIGHT SHIFT (>>) - Fast division by powers of 2 (preserves sign)
 * 3. UNSIGNED RIGHT SHIFT (>>>) - Logical shift (ignores sign)
 * 
 * BINARY CALCULATION WITH v = -5, n = 1:
 * 
 * Original number: -5
 * 32-bit binary representation of -5 (Two's complement):
 * 11111111111111111111111111111011
 * 
 * ================================
 * 1. LEFT SHIFT (-5 << 1):
 * ================================
 * Original: 11111111111111111111111111111011
 * Shift left by 1 position:
 * Result:   11111111111111111111111111110110
 * 
 * Decimal value: -10
 * Mathematical equivalent: -5 × 2^1 = -5 × 2 = -10
 * 
 * ================================
 * 2. RIGHT SHIFT (-5 >> 1):
 * ================================  
 * Original: 11111111111111111111111111111011
 * Arithmetic right shift by 1 position:
 * Result:   11111111111111111111111111111101
 * 
 * Decimal value: -3
 * Mathematical equivalent: -5 ÷ 2 = -2.5 → floor(-2.5) = -3
 * Note: Sign bit (leftmost 1) is preserved by filling with 1s
 * 
 * ================================
 * 3. UNSIGNED RIGHT SHIFT (-5 >>> 1):
 * ================================
 * Original: 11111111111111111111111111111011  
 * Logical right shift by 1 position:
 * Result:   01111111111111111111111111111101
 * 
 * Decimal value: 2147483645
 * Note: Leftmost position filled with 0 (treats as unsigned)
 * This converts the negative number to a large positive number
 * 
 * KEY DIFFERENCES BETWEEN >> and >>>:
 * 
 * >> (Arithmetic Right Shift):
 * - Preserves the sign of the number
 * - Fills left positions with the sign bit (0 for +ve, 1 for -ve)
 * - Used for signed integer division by powers of 2
 * 
 * >>> (Logical Right Shift):  
 * - Ignores the sign of the number
 * - ALWAYS fills left positions with 0
 * - Treats the number as unsigned 32-bit integer
 * - Useful for bit manipulation without sign consideration
 * 
 * PRACTICAL APPLICATIONS:
 * - << : Fast multiplication (x << 3 = x × 8)
 * - >> : Fast division with sign preservation  
 * - >>> : Bit manipulation, converting to unsigned values
 * 
 * 
 * 
 * 
 * 
 * FINAL OUTPUT:
 * Enter the value of v:
 * -5
 * Enter the value of n:  
 * 1
 * -10              ← Left shift result (-5 × 2)
 * -3               ← Arithmetic right shift (preserves sign)
 * 2147483645       ← Unsigned right shift (treats as positive)
 */
