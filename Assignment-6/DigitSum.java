// Question-5
import java.util.Scanner;

class DigitSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
		sc.close();
    }
}

/*
 * FINAL OUTPUT:
 *
 * Enter a number: 4128
 * Sum of digits: 15
 */
 

 
/*
// WE CAN ALSO USE THIS CODE ( Using Exit Control Loop (do-while))

import java.util.Scanner;

class DigitSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        do {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        } while (num != 0);

        System.out.println("Sum of digits: " + sum);
    }
}

*/
