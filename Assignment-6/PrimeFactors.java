// Question-3
import java.util.Scanner;

class PrimeFactors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Prime factors: ");
        int i = 2;

        while (num > 1) {
            if (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            } else {
                i++;
            }
        }
		sc.close();
    }
}

/*
 * FINAL OUTPUT:
 *
 * Enter a number: 40
 * Prime factors: 2 2 2 5
 */
 


 
/*
// WE CAN ALSO USE THIS CODE ( Using Exit Control Loop (do-while))

import java.util.Scanner;

class PrimeFactors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Prime factors: ");
        int i = 2;

        do {
            if (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            } else {
                i++;
            }
        } while (num > 1);
    }
}

*/
 