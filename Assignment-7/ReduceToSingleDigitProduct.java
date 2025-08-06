// Question-3
import java.util.Scanner;

class ReduceToSingleDigitProduct {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        s.close();
        
        int original = num;
        while (num > 9) {
            int product = 1;
            while (num > 0) {
                int digit = num % 10;
                if (digit != 0) product *= digit;
                num /= 10;
            }
            num = product;
        }
        System.out.println("The single digit product of " + original + " is: " + num);
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter a number: 2480
 * The single digit product of 2480 is: 8
 */


/*
 * STEP-BY-STEP EXPLANATION FOR INPUT: 2480    (For all the numbers the process is same.)
 * 
 * Step 1: Initial number = 2480
 *         Since 2480 > 9, we need to reduce it
 *         Extract digits: 2, 4, 8, 0
 *         Multiply non-zero digits: 2 × 4 × 8 = 64 (ignore 0)
 *         New number = 64
 * 
 * Step 2: Current number = 64
 *         Since 64 > 9, we need to reduce it further
 *         Extract digits: 6, 4
 *         Multiply all digits: 6 × 4 = 24
 *         New number = 24
 * 
 * Step 3: Current number = 24
 *         Since 24 > 9, we need to reduce it further
 *         Extract digits: 2, 4
 *         Multiply all digits: 2 × 4 = 8
 *         New number = 8
 * 
 * Step 4: Current number = 8
 *         Since 8 <= 9, we stop here
 *         Final result = 8
 * 
 * FINAL OUTPUT:
 * Enter a number: 2480
 * The single digit product of 2480 is: 8
 */
