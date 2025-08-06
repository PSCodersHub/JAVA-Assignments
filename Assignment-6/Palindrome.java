// Question-1
import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
		sc.close();
    }
}

/*
 * FINAL OUTPUT:
 *
 * Enter a number: 121
 * 121 is a palindrome.
 */
 


 
 /*
 // WE CAN ALSO USE THIS CODE ( Using Exit Control Loop (do-while loop))
 
import java.util.Scanner;

public class PalindromeDoWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        do {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        } while (num != 0);

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

 */
 