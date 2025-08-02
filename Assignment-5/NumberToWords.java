// Question-4
import java.util.Scanner;

class NumberToWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.next(); // input as string to process digit by digit

        System.out.print("Output: ");
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);

            if (ch == '0')
                System.out.print("Zero ");
            else if (ch == '1')
                System.out.print("One ");
            else if (ch == '2')
                System.out.print("Two ");
            else if (ch == '3')
                System.out.print("Three ");
            else if (ch == '4')
                System.out.print("Four ");
            else if (ch == '5')
                System.out.print("Five ");
            else if (ch == '6')
                System.out.print("Six ");
            else if (ch == '7')
                System.out.print("Seven ");
            else if (ch == '8')
                System.out.print("Eight ");
            else if (ch == '9')
                System.out.print("Nine ");
            else
                System.out.print("? "); // for any non-digit (optional)
        }
        System.out.println();

        sc.close();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter a number: 5012
 * Output: Five Zero One Two
 */






/*
// WE CAN USE THIS CODE ALSO (Using switch-case statements)

import java.util.Scanner;

class NumberToWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.next(); // input as string to process digit by digit

        System.out.print("Output: ");
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);

            switch (ch) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("? "); // for any non-digit input (optional)
            }
        }
        System.out.println();

        sc.close();
    }
}
*/
