// Question-2

import java.util.Scanner;

class SortArray {
    private int[] arr; // Array to store numbers
    private int[] originalArr; // Array to store original values
    private int size; // Size of the array

    // Constructor to allocate memory for the array
    public SortArray(int n) {
        size = n;
        arr = new int[n]; // Allocate memory
        originalArr = new int[n]; // Allocate memory for original array
    }

    // Method to input elements
    public void inputElements() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            originalArr[i] = arr[i]; // Store original values
        }
    }

    // Method to display array elements
    public void displayElements() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to restore original array
    private void restoreOriginal() {
        for (int i = 0; i < size; i++) {
            arr[i] = originalArr[i];
        }
    }

    // Bubble Sort in Ascending Order
    public void bubbleSortAscending() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted in ascending order using Bubble Sort:");
        displayElements();
    }

    // Bubble Sort in Descending Order
    public void bubbleSortDescending() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted in descending order using Bubble Sort:");
        displayElements();
    }

    // Selection Sort in Ascending Order
    public void selectionSortAscending() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array sorted in ascending order using Selection Sort:");
        displayElements();
    }

    // Selection Sort in Descending Order
    public void selectionSortDescending() {
        for (int i = 0; i < size - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array sorted in descending order using Selection Sort:");
        displayElements();
    }

    // Main method for execution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Step 2: Create SortArray object
        SortArray obj = new SortArray(n);

        // Step 3: Input elements
        obj.inputElements();

        // Step 4: Display original array
        System.out.println("Original array:");
        obj.displayElements();

        // Step 5: Perform Bubble Sort Ascending
        obj.bubbleSortAscending();

        // Step 6: Perform Bubble Sort Descending
        obj.restoreOriginal();
        obj.bubbleSortDescending();

        // Step 7: Perform Selection Sort Ascending
        obj.restoreOriginal();
        obj.selectionSortAscending();

        // Step 8: Perform Selection Sort Descending
        obj.restoreOriginal();
        obj.selectionSortDescending();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter the size of the array: 5
 * Enter 5 numbers:
 * 3
 * 4
 * 6
 * 2
 * 8
 * Original array:
 * 3 4 6 2 8
 * Array sorted in ascending order using Bubble Sort:
 * 2 3 4 6 8
 * Array sorted in descending order using Bubble Sort:
 * 8 6 4 3 2
 * Array sorted in ascending order using Selection Sort:
 * 2 3 4 6 8
 * Array sorted in descending order using Selection Sort:
 * 8 6 4 3 2
 * 
 */
