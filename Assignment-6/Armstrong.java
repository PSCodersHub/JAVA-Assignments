// Question-2
import java.util.Scanner;

class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        do {
            int digit = num % 10;
            sum += digit * digit * digit;  // cube of digit
            num /= 10;
        } while (num != 0);

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
		sc.close();
    }
}

/*
 * FINAL OUTPUT:
 *
 * Enter a number: 371
 * 371 is an Armstrong number.
 */


/*
// WE CAN ALSO USE THIS CODE ( Using Entry control loop (while))

import java.util.Scanner;

class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;  // cube of digit
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}

*/
