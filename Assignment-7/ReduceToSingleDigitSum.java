// Question-2
import java.util.Scanner;

class ReduceToSingleDigitSum {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        s.close();
        
        int original = num;
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        System.out.println("The single digit sum of " + original + " is: " + num);
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter a number: 2485
 * The single digit sum of 2485 is: 1
 */


/*
 * STEP-BY-STEP EXPLANATION FOR INPUT: 2485   (For all the numbers the process is same.)
 * 
 * Step 1: Initial number = 2485
 *         Since 2485 > 9, we need to reduce it
 *         Add all digits: 2 + 4 + 8 + 5 = 19
 *         New number = 19
 * 
 * Step 2: Current number = 19
 *         Since 19 > 9, we need to reduce it further
 *         Add all digits: 1 + 9 = 10
 *         New number = 10
 * 
 * Step 3: Current number = 10
 *         Since 10 > 9, we need to reduce it further
 *         Add all digits: 1 + 0 = 1
 *         New number = 1
 * 
 * Step 4: Current number = 1
 *         Since 1 <= 9, we stop here
 *         Final result = 1
 * 
 * FINAL OUTPUT:
 * Enter a number: 2485
 * The single digit sum of 2485 is: 1
 */
