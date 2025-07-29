// Question-4: Program to demonstrate all four bitwise operators (&, |, ^, ~)

// Import Scanner class for taking user input
import java.util.Scanner;

// Define a public class named BitwiseOP
class BitwiseOP {
    // Main method - entry point of the program
    public static void main(String args[]) {
        
        // Create Scanner object to read input from console
        Scanner s = new Scanner(System.in);
        
        // Declare three integer variables:
        // num1, num2 = input numbers for bitwise operations
        // num3 = variable to store results of each operation
        int num1, num2, num3;
        
        // Prompt user to enter first number
        System.out.println("Enter the value of num1: ");
        num1 = s.nextInt();  // Read and store first number
        
        // Prompt user to enter second number
        System.out.println("Enter the value of num2: ");
        num2 = s.nextInt();  // Read and store second number
        
        // ============================================
        // BITWISE AND OPERATOR (&)
        // ============================================
        // Purpose: Returns 1 only when BOTH bits are 1, otherwise 0
        // Logic: Similar to logical AND - both conditions must be true
        // Symbol meaning: '&' represents "AND" - both must be present
        num3 = num1 & num2;
        System.out.println("& operator result: " + num3);
        
        // ============================================
        // BITWISE OR OPERATOR (|)
        // ============================================
        // Purpose: Returns 1 when AT LEAST ONE bit is 1, returns 0 only when both are 0
        // Logic: Similar to logical OR - either condition can be true
        // Symbol meaning: '|' represents "OR" - either one can be present
        num3 = num1 | num2;
        System.out.println("| operator result: " + num3);
        
        // ============================================
        // BITWISE XOR OPERATOR (^)
        // ============================================
        // Purpose: Returns 1 when bits are DIFFERENT, returns 0 when bits are SAME
        // Logic: "Exclusive OR" - exactly one must be true, not both
        // Symbol meaning: '^' represents "exclusive OR" - different/exclusive
        num3 = num1 ^ num2;
        System.out.println("^ operator result: " + num3);
        
        // ============================================
        // BITWISE NOT OPERATOR (~)
        // ============================================
        // Purpose: FLIPS/INVERTS all bits (0 becomes 1, 1 becomes 0)
        // Logic: Unary operator - works on single operand
        // Symbol meaning: '~' represents "NOT/complement" - inversion wave
        // Note: Applied to num3 (result of XOR operation)
        System.out.println("~ operator result: " + (~num3));
        
        // Close Scanner to free system resources
        s.close();
    }
}

/*
 * =============================================
 * DETAILED EXPLANATION OF BITWISE OPERATORS:
 * =============================================
 * 
 * WHY THESE SPECIFIC SYMBOLS ARE USED:
 * 
 * 1. & (AMPERSAND) for AND:
 *    - Historical: '&' means "and" in many contexts
 *    - Logic: Both sides must be connected/present
 *    - Memory aid: "Bridge" connecting two sides
 * 
 * 2. | (PIPE/VERTICAL BAR) for OR:
 *    - Visual: Looks like parallel paths - either route works
 *    - Logic: Multiple options available
 *    - Memory aid: "Either this way OR that way"
 * 
 * 3. ^ (CARET) for XOR:
 *    - Visual: Pointed up - indicates "exclusive" choice
 *    - Logic: Sharp distinction - one OR the other, not both
 *    - Memory aid: "Exclusive peak" - only one can be at the top
 * 
 * 4. ~ (TILDE) for NOT:
 *    - Visual: Wavy line suggests "flip/inversion"
 *    - Logic: Represents negation/complement
 *    - Memory aid: "Wave" that flips everything upside down
 * 
 * =============================================
 * BINARY CALCULATION WITH num1 = 8, num2 = 4:
 * =============================================
 * 
 * First, let's see the binary representations:
 * 8 in binary (32-bit): 00000000000000000000000000001000
 * 4 in binary (32-bit): 00000000000000000000000000000100
 * 
 * For simplicity, showing last 4 bits:
 * 8 = 1000
 * 4 = 0100
 * 
 * ==========================================
 * 1. BITWISE AND (8 & 4):
 * ==========================================
 * 
 * Operation: Compare each bit position
 * Rule: 1 & 1 = 1, all other combinations = 0
 * 
 *   1000  (8)
 * & 0100  (4)
 * -------
 *   0000  (0)
 * 
 * Bit-by-bit analysis:
 * Position 3: 1 & 0 = 0
 * Position 2: 0 & 1 = 0  
 * Position 1: 0 & 0 = 0
 * Position 0: 0 & 0 = 0
 * 
 * Result: 0 ✓
 * 
 * Real-world analogy: Like a gate that opens only when BOTH keys are present
 * 
 * ==========================================
 * 2. BITWISE OR (8 | 4):
 * ==========================================
 * 
 * Operation: Compare each bit position
 * Rule: 0 | 0 = 0, all other combinations = 1
 * 
 *   1000  (8)
 * | 0100  (4)
 * -------
 *   1100  (12)
 * 
 * Bit-by-bit analysis:
 * Position 3: 1 | 0 = 1
 * Position 2: 0 | 1 = 1
 * Position 1: 0 | 0 = 0  
 * Position 0: 0 | 0 = 0
 * 
 * Result: 1100 = 12 ✓
 * 
 * Real-world analogy: Like a light switch - turns on if EITHER switch is flipped
 * 
 * ==========================================
 * 3. BITWISE XOR (8 ^ 4):
 * ==========================================
 * 
 * Operation: Compare each bit position
 * Rule: Different bits = 1, Same bits = 0
 * 
 *   1000  (8)
 * ^ 0100  (4)
 * -------
 *   1100  (12)
 * 
 * Bit-by-bit analysis:
 * Position 3: 1 ^ 0 = 1 (different)
 * Position 2: 0 ^ 1 = 1 (different)
 * Position 1: 0 ^ 0 = 0 (same)
 * Position 0: 0 ^ 0 = 0 (same)
 * 
 * Result: 1100 = 12 ✓
 * 
 * Real-world analogy: Like exclusive membership - you can be in one club OR the other, not both
 * 
 * ==========================================
 * 4. BITWISE NOT (~12):
 * ==========================================
 * 
 * Operation: Flip every single bit
 * Rule: 0 becomes 1, 1 becomes 0
 * 
 * 12 in 32-bit binary:
 * 00000000000000000000000000001100
 * 
 * After NOT operation:
 * 11111111111111111111111111110011
 * 
 * Result in two's complement: -13 ✓
 * 
 * Why -13? In two's complement:
 * - All 1s starting from left indicates a negative number
 * - To find magnitude: invert bits and add 1
 * - Inverted: 00000000000000000000000000001100 = 12
 * - Add 1: 12 + 1 = 13
 * - Since original had leading 1s, result is -13
 * 
 * Real-world analogy: Like a photo negative - every bright pixel becomes dark and vice versa
 * 
 * =============================================
 * PRACTICAL APPLICATIONS:
 * =============================================
 * 
 * 1. AND (&) - Masking/Filtering:
 *    - Extract specific bits: number & mask
 *    - Check if number is even: number & 1 (result 0 = even)
 *    - Clear specific bits
 * 
 * 2. OR (|) - Setting bits:
 *    - Turn on specific bits: number | mask
 *    - Combine flags/permissions
 *    - Set bits to 1 without affecting others
 * 
 * 3. XOR (^) - Toggling/Encryption:  
 *    - Toggle specific bits: number ^ mask
 *    - Simple encryption (XOR with key)
 *    - Swapping numbers without temp variable
 *    - Find unique element in array
 * 
 * 4. NOT (~) - Bit inversion:
 *    - Create bit masks
 *    - Implement logical NOT for custom types
 *    - Bitwise arithmetic operations
 * 
 * =============================================
 * EXECUTION TRACE (num1=8, num2=4):
 * =============================================
 * 
 * Input Phase:
 * num1 = 8 (binary: 1000)
 * num2 = 4 (binary: 0100)
 * 
 * Calculation Phase:
 * num3 = 8 & 4  = 0000 = 0   ← AND result
 * num3 = 8 | 4  = 1100 = 12  ← OR result  
 * num3 = 8 ^ 4  = 1100 = 12  ← XOR result
 * ~num3 = ~12   = -13         ← NOT result
 * 
 * 
 * 
 * 
 * 
 * FINAL OUTPUT:
 * Enter the value of num1:
 * 8
 * Enter the value of num2:
 * 4
 * & operator result: 0             ← Only 1&1=1, no matching 1s in same positions
 * | operator result: 12            ← Any position with 1 in either number
 * ^ operator result: 12            ← Positions where bits differ
 * ~ operator result: -13           ← All bits of 12 flipped = negative number
 */
