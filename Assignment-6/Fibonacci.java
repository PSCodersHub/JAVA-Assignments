// Question-4
import java.util.Scanner;

class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        int count = 1;

        System.out.print("Fibonacci series: ");
        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        } while (count <= n);
		sc.close();
    }
}

/*
 * FINAL OUTPUT:
 *
 * Enter number of terms: 7
 * Fibonacci series: 0 1 1 2 3 5 8
 */
 


 
/*
// WE CAN ALSO USE THIS CODE ( Using Entry Control Loop (while))

import java.util.Scanner;

class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        int count = 1;

        System.out.print("Fibonacci series: ");
        while (count <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
    }
}

*/
