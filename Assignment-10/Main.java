// Question-1

import java.util.Scanner;

class Array {
    private int[] arr;
    private int[] originalArr; // Store original values
    private int size;

    // Constructor
    public Array(int size) {
        this.size = size;
        this.arr = new int[size];
        this.originalArr = new int[size]; // Initialize original array
        for (int i = 0; i < size; i++) {
            arr[i] = 0;
        }
    }

    // Input elements
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            originalArr[i] = arr[i]; // Store original values
        }
    }

    // Display elements
    public void display() {
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Sum and average
    public void sumAndAverage() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / size;
        // System.out.println("Sum: " + sum + ", Average: " + avg);
        System.out.printf("Sum: %d, Average: %.2f\n", sum, avg);

    }

    // Swap max and min
    public void swapMaxMin() {
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
            if (arr[i] < arr[minIndex])
                minIndex = i;
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
        System.out.println("Max and Min swapped");
    }

    // Find occurrence of unique elements
    public void findOccurrence() {
        boolean[] visited = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }

    // Make single digit by adding digits repeatedly
    private int makeSingleDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    // Find greatest three-digit number using original values
    public void findGreatestThreeDigit() {
        System.out.print("New values are: ");
        int greatest = 0;

        // Process in groups of 3 using original array
        for (int i = 0; i < size; i += 3) {
            int digit1 = makeSingleDigit(originalArr[i]);

            int digit2 = 0;
            if (i + 1 < size) {
                digit2 = makeSingleDigit(originalArr[i + 1]);
            }

            int digit3 = 0;
            if (i + 2 < size) {
                digit3 = makeSingleDigit(originalArr[i + 2]);
            }

            int number = digit1 * 100 + digit2 * 10 + digit3;
            System.out.print(number);

            if (number > greatest)
                greatest = number;

            // Add comma if more groups exist
            if (i + 3 < size)
                System.out.print(", ");
        }

        System.out.println();
        System.out.println("The greatest value is " + greatest);
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Array arr = new Array(7);
        arr.input();
        arr.display();
        arr.sumAndAverage();
        arr.swapMaxMin();
        arr.display();
        arr.findOccurrence();
        arr.findGreatestThreeDigit();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter 7 elements:
 * 3 7 4 25 190 2 87
 * Array: 3 7 4 25 190 2 87
 * Sum: 318, Average: 45.43
 * Max and Min swapped
 * Array: 3 7 4 25 2 190 87
 * 3 occurs 1 times
 * 7 occurs 1 times
 * 4 occurs 1 times
 * 25 occurs 1 times
 * 2 occurs 1 times
 * 190 occurs 1 times
 * 87 occurs 1 times
 * New values are: 374, 712, 600
 * The greatest value is 712
 * 
 */