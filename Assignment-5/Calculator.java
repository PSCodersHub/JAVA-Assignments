// Question-3
import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        double num1 = s.nextDouble();

        System.out.print("Enter the 2nd number: ");
        double num2 = s.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = s.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        s.close();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter the 1st number: 4
 * Enter the 2nd number: 8
 * Enter operator (+, -, *, /): +
 * Result: 12.0
 */






/*
// WE CAN USE THIS CODE ALSO (Using If-Else Statements)

import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero!");
            }
        } else {
            System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
*/
