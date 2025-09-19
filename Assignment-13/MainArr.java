// Question-1

import java.util.Scanner;

class Number {
    int[] arr;
    int size;

    public Number() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        arr = new int[n];
        size = n;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void display() {
        System.out.print("Array elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class OddNum extends Number {
    int[] oddArr;

    public OddNum() {
        super(); // Calls Number's default constructor
        int count = 0;
        for (int num : super.arr) {
            if (num % 2 != 0)
                count++;
        }
        oddArr = new int[count];
        copyOddNumbers();
    }

    private void copyOddNumbers() {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArr[index] = arr[i];
                index++;
            }
        }
    }

    public void displayOdd() {
        System.out.print("Odd elements are: ");
        for (int i = 0; i < oddArr.length; i++) {
            System.out.print(oddArr[i] + " ");
        }
    }
}

class PrimeNum extends OddNum {
    private int[] primeArr;

    public PrimeNum() {
        super(); // Calls OddNum's default constructor
        int count = 0;
        for (int num : super.oddArr) {
            if (isPrime(num))
                count++;
        }
        primeArr = new int[count];
        copyPrimeNumbers();
    }

    private boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private void copyPrimeNumbers() {
        int index = 0;
        for (int num : super.oddArr) {
            if (isPrime(num)) {
                primeArr[index] = num;
                index++;
            }
        }
    }

    public void displayPrime() {
        System.out.print("Prime elements are: ");
        for (int i = 0; i < primeArr.length; i++) {
            System.out.print(primeArr[i] + " ");
        }
    }
}

public class MainArr {
    public static void main(String[] args) {
        PrimeNum obj = new PrimeNum(); // Uses default constructor
        obj.display(); // From Number
        obj.displayOdd(); // From OddNum
        obj.displayPrime(); // From PrimeNum
    }
}

/*
 * FINAL OUTPUT:
 *
 * Enter the size of the array: 5
 * Enter 5 numbers:
 * 3 4 9 12 15
 * Array elements are: 3 4 9 12 15 Odd elements are: 3 9 15 Prime elements are: 3
 */