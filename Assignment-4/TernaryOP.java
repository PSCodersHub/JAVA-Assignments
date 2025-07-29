// Question-1: Program to find smaller and greater number using ternary operator

// Import Scanner class from java.util package for taking user input
import java.util.Scanner;

// Define a public class named TernaryOP
class TernaryOP {
    // Main method - entry point of the program
    public static void main(String args[]) {

        // Create a Scanner object 's' to read input from console
        Scanner s = new Scanner(System.in);

        // Declare two integer variables 'a' and 'b'
        // Initialize with default values (these will be overwritten by user input)
        int a = 5, b = 8;

        // Display prompt message asking user to enter value for 'a'
        System.out.println("Enter the value of a: ");

        // Read integer input from user and store it in variable 'a'
        a = s.nextInt();

        // Display prompt message asking user to enter value for 'b'
        System.out.println("Enter the value of b: ");

        // Read integer input from user and store it in variable 'b'
        b = s.nextInt();

        // Find and print the smaller number using ternary operator
        // Syntax: condition ? value_if_true : value_if_false
        //
        // Here: (a < b ? a : b) means:
        // "Is a less than b? If YES, return a; Otherwise, return b"
        System.out.println("Smaller: " + (a < b ? a : b));

        // Find and print the greater number using ternary operator
        // Here: (a > b ? a : b) means:
        // "Is a greater than b? If YES, return a; Otherwise, return b"
        System.out.println("Greater: " + (a > b ? a : b));

        // Close the Scanner object to free up system resources
        // This prevents memory leaks and is good programming practice
        s.close();
    }
}

/*
 * DETAILED OUTPUT EXPLANATION:
 * 
 * When user inputs a=8 and b=4:
 * 
 * 1. "Enter the value of a: " is displayed
 * 2. User enters: 8
 * 3. "Enter the value of b: " is displayed
 * 4. User enters: 4
 * 
 * 5. For Smaller number calculation:
 * - Condition: (a < b) = (8 < 4) = false
 * - Since condition is false, ternary operator returns 'b'
 * - Result: "Smaller: 4"
 * 
 * 6. For Greater number calculation:
 * - Condition: (a > b) = (8 > 4) = true
 * - Since condition is true, ternary operator returns 'a'
 * - Result: "Greater: 8"
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
 * Smaller: 4
 * Greater: 8
 */
