// Question-1

import java.util.Scanner;

// Interface definition
interface IntOperations {
    boolean isPositive();

    boolean isEven();

    boolean isPrime();

    boolean isPalindrome();

    int factorial();

    int sumOfDigits();
}

// Class implementing the interface
class MyNumber implements IntOperations {
    private int num;

    // Default constructor
    MyNumber() {
        this.num = 0;
    }

    // Parameterized constructor
    MyNumber(int num) {
        this.num = num;
    }

    // Method to check if number is positive
    public boolean isPositive() {
        return num >= 0;
    }

    // Method to check if number is even
    public boolean isEven() {
        return num % 2 == 0;
    }

    // Method to check if number is prime
    public boolean isPrime() {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to check if number is palindrome
    public boolean isPalindrome() {
        int temp = num, rev = 0;
        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return rev == num;
    }

    // Method to calculate factorial
    public int factorial() {
        if (num < 0) {
            System.out.println("Factorial not defined for negative numbers!");
            return -1;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        return fact;
    }

    // Method to calculate sum of digits
    public int sumOfDigits() {
        int temp = Math.abs(num);
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}

// Main class
public class IntOperationsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        MyNumber myNum = new MyNumber(n);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Check Positive/Negative");
            System.out.println("2. Check Even/Odd");
            System.out.println("3. Check Prime");
            System.out.println("4. Check Palindrome");
            System.out.println("5. Find Factorial");
            System.out.println("6. Find Sum of Digits");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(myNum.isPositive() ? "Number is Positive" : "Number is Negative");
                    break;
                case 2:
                    System.out.println(myNum.isEven() ? "Number is Even" : "Number is Odd");
                    break;
                case 3:
                    System.out.println(myNum.isPrime() ? "Number is Prime" : "Number is Not Prime");
                    break;
                case 4:
                    System.out.println(myNum.isPalindrome() ? "Number is Palindrome" : "Number is Not Palindrome");
                    break;
                case 5:
                    int fact = myNum.factorial();
                    if (fact != -1)
                        System.out.println("Factorial = " + fact);
                    break;
                case 6:
                    System.out.println("Sum of digits = " + myNum.sumOfDigits());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter a number: 7
 * 
 * --- MENU ---
 * 1. Check Positive/Negative
 * 2. Check Even/Odd
 * 3. Check Prime
 * 4. Check Palindrome
 * 5. Find Factorial
 * 6. Find Sum of Digits
 * 7. Exit
 * Enter your choice: 1
 * Number is Positive
 * 
 * --- MENU ---
 * 1. Check Positive/Negative
 * 2. Check Even/Odd
 * 3. Check Prime
 * 4. Check Palindrome
 * 5. Find Factorial
 * 6. Find Sum of Digits
 * 7. Exit
 * Enter your choice: 7
 * Exiting...
 */


// ANOTHER DETAILED VERSION:
// If you want a more detailed version with additional functionalities like checking for negative numbers and changing the number, here it is:

/*
 * import java.util.Scanner;
 * 
 * // Step 1: Define the interface
 * interface IntOperations {
 * boolean isPositive();
 * 
 * boolean isNegative();
 * 
 * boolean isEven();
 * 
 * boolean isOdd();
 * 
 * boolean isPrime();
 * 
 * boolean isPalindrome();
 * 
 * long factorial();
 * 
 * int sumOfDigits();
 * }
 * 
 * // Step 2: Implement the interface in the MyNumber class
 * class MyNumber implements IntOperations {
 * private int num;
 * 
 * // Default constructor
 * MyNumber() {
 * this.num = 0;
 * }
 * 
 * // Parameterized constructor
 * MyNumber(int num) {
 * this.num = num;
 * }
 * 
 * // Setter to change the number
 * public void setNumber(int num) {
 * this.num = num;
 * }
 * 
 * // Getter to get the number
 * public int getNumber() {
 * return num;
 * }
 * 
 * // Implementations of interface methods
 * public boolean isPositive() {
 * return num > 0;
 * }
 * 
 * public boolean isNegative() {
 * return num < 0;
 * }
 * 
 * public boolean isEven() {
 * return num % 2 == 0;
 * }
 * 
 * public boolean isOdd() {
 * return num % 2 != 0;
 * }
 * 
 * public boolean isPrime() {
 * if (num <= 1)
 * return false;
 * for (int i = 2; i <= Math.sqrt(num); i++) {
 * if (num % i == 0)
 * return false;
 * }
 * return true;
 * }
 * 
 * public boolean isPalindrome() {
 * int original = num;
 * int reverse = 0;
 * int temp = Math.abs(num); // handle negative numbers
 * while (temp != 0) {
 * reverse = reverse * 10 + temp % 10;
 * temp /= 10;
 * }
 * return Math.abs(original) == reverse;
 * }
 * 
 * public long factorial() {
 * if (num < 0)
 * return -1; // factorial not defined for negative numbers
 * long fact = 1;
 * for (int i = 1; i <= num; i++)
 * fact *= i;
 * return fact;
 * }
 * 
 * public int sumOfDigits() {
 * int sum = 0;
 * int temp = Math.abs(num);
 * while (temp != 0) {
 * sum += temp % 10;
 * temp /= 10;
 * }
 * return sum;
 * }
 * }
 * 
 * // Step 3: Menu-driven main method
 * public class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter a number: ");
 * int n = sc.nextInt();
 * MyNumber myNum = new MyNumber(n);
 * 
 * int choice;
 * do {
 * System.out.println("\n------ MENU ------");
 * System.out.println("1. Check Positive/Negative");
 * System.out.println("2. Check Even/Odd");
 * System.out.println("3. Check Prime");
 * System.out.println("4. Check Palindrome");
 * System.out.println("5. Factorial");
 * System.out.println("6. Sum of Digits");
 * System.out.println("7. Change Number");
 * System.out.println("0. Exit");
 * System.out.print("Enter your choice: ");
 * choice = sc.nextInt();
 * 
 * switch (choice) {
 * case 1:
 * if (myNum.isPositive())
 * System.out.println(myNum.getNumber() + " is Positive");
 * else if (myNum.isNegative())
 * System.out.println(myNum.getNumber() + " is Negative");
 * else
 * System.out.println("Number is Zero");
 * break;
 * 
 * case 2:
 * if (myNum.isEven())
 * System.out.println(myNum.getNumber() + " is Even");
 * else
 * System.out.println(myNum.getNumber() + " is Odd");
 * break;
 * 
 * case 3:
 * if (myNum.isPrime())
 * System.out.println(myNum.getNumber() + " is Prime");
 * else
 * System.out.println(myNum.getNumber() + " is Not Prime");
 * break;
 * 
 * case 4:
 * if (myNum.isPalindrome())
 * System.out.println(myNum.getNumber() + " is a Palindrome");
 * else
 * System.out.println(myNum.getNumber() + " is Not a Palindrome");
 * break;
 * 
 * case 5:
 * long fact = myNum.factorial();
 * if (fact == -1)
 * System.out.println("Factorial not defined for negative numbers!");
 * else
 * System.out.println("Factorial of " + myNum.getNumber() + " = " + fact);
 * break;
 * 
 * case 6:
 * System.out.println("Sum of digits = " + myNum.sumOfDigits());
 * break;
 * 
 * case 7:
 * System.out.print("Enter new number: ");
 * int newNum = sc.nextInt();
 * myNum.setNumber(newNum);
 * System.out.println("Number updated!");
 * break;
 * 
 * case 0:
 * System.out.println("Exiting...");
 * break;
 * 
 * default:
 * System.out.println("Invalid choice! Try again.");
 * }
 * } while (choice != 0);
 * 
 * sc.close();
 * }
 * }
 */