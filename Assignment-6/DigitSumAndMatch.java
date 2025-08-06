// Question-6
import java.util.Scanner;

class DigitSumAndMatch {
    public static void main(String args[]) {
        // Initialize scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int original = sc.nextInt();

        // Calculate sum of all digits in the original number
        // Using entry control loop (while)
        int sum = 0, temp = original;
        while (temp > 0) {
            sum += temp % 10;  // Add last digit to sum
            temp /= 10;        // Remove last digit
        }
        System.out.println("Sum of digits: " + sum);

        // Process each digit from the sum and check its occurrence in original number
        System.out.println("Digits in sum also in original: ");
        while (sum > 0) {
            // Extract the rightmost digit from sum
            int r = sum % 10;
            
            // Count how many times this digit appears in original number
            int count = 0;
            temp = original;
            while (temp > 0) {
                int d = temp % 10;  // Get last digit of original
                if (d == r) {       // If digit matches
                    count++;        // Increment counter
                }
                temp /= 10;         // Move to next digit
            }
            
            // Display the result for current digit
            System.out.println(r + " Present " + count + " times.");
            
            // Remove the processed digit from sum
            sum = sum / 10;
        }
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}

/*
 * FINAL OUTPUT:
 *
 * Enter a number: 3481
 * Sum of digits: 16
 * Digits in sum also in original:
 * 6 Present 0 times.
 * 1 Present 1 times.
 */
 