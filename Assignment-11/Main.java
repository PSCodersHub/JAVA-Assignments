// Question-1

import java.util.Scanner;

class OneDArray {
    int[] arr;

    // Constructor to allocate 1D array memory of size n
    OneDArray(int n) {
        arr = new int[n];
    }

    // Display 1D array elements
    void show() {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

class TwoDArray {
    int[][] arr;
    int rows = 2;
    int cols;

    // Constructor to allocate 2D array of size 2 x n
    TwoDArray(int n) {
        cols = n;
        arr = new int[rows][cols];
    }

    // Input data into the 2D array
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + rows*cols + " elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = sc.nextInt();
    }

    // Display the 2D array row-wise
    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    // Split the 2D array into two 1D arrays in OneDArray objects
    void split(OneDArray arr1, OneDArray arr2) {
        for (int j = 0; j < cols; j++) {
            arr1.arr[j] = arr[0][j];
            arr2.arr[j] = arr[1][j];
        }
    }

    // Add two 2D arrays of the same size and return a new TwoDArray object
    TwoDArray add(TwoDArray other) {
        TwoDArray result = new TwoDArray(cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.arr[i][j] = this.arr[i][j] + other.arr[i][j];
        return result;
    }

    // Multiply two 2xN arrays - here multiply row-wise arrays element-wise (since normal matrix multiplication isn't defined for 2xN and 2xN)
    TwoDArray multiply(TwoDArray other) {
        TwoDArray result = new TwoDArray(cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.arr[i][j] = this.arr[i][j] * other.arr[i][j];
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        int n = 3; // Example column size

        TwoDArray tda1 = new TwoDArray(n);
        TwoDArray tda2 = new TwoDArray(n);

        System.out.println("Input for first 2D array:");
        tda1.input();

        System.out.println("Input for second 2D array:");
        tda2.input();

        System.out.println("First 2D Array:");
        tda1.display();

        System.out.println("Second 2D Array:");
        tda2.display();

        OneDArray oneD1 = new OneDArray(n);
        OneDArray oneD2 = new OneDArray(n);

        tda1.split(oneD1, oneD2);

        System.out.println("Split arrays from first 2D array:");
        oneD1.show();
        oneD2.show();

        TwoDArray sum = tda1.add(tda2);
        System.out.println("Sum of arrays:");
        sum.display();

        TwoDArray product = tda1.multiply(tda2);
        System.out.println("Product of arrays (element-wise):");
        product.display();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Input for first 2D array:
 * Enter 6 elements:
 * 1 2 3 4 5 6
 * 
 * Input for second 2D array:
 * Enter 6 elements:
 * 6 5 4 3 2 1
 * 
 * First 2D Array:
 * 1 2 3 
 * 4 5 6 
 * 
 * Second 2D Array:
 * 6 5 4 
 * 3 2 1 
 * 
 * Split arrays from first 2D array:
 * 1 2 3 
 * 4 5 6 
 * 
 * Sum of arrays:
 * 7 7 7 
 * 7 7 7 
 * 
 * Product of arrays (element-wise):
 * 6 10 12 
 * 12 10 6 
 *
 */








/*
\\ U CAN ALSO USE THIS CODE , IF U NEED MODE MORE DETAIL'S

import java.util.Scanner;

// Class to represent a 1D array
class OneDArray {
    int[] arr; // One 1D array member

    // Constructor to allocate memory of size n (number of columns of TwoDArray)
    public OneDArray(int n) {
        arr = new int[n];
    }

    // Method to display the array elements
    public void display() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

// Class to represent a 2D array with 2 rows and n columns
class TwoDArray {
    int[][] arr; // One 2D array member

    // Constructor to allocate memory of size 2 x n
    public TwoDArray(int n) {
        arr = new int[2][n];
    }

    // Method to input data into the 2D array
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for a 2 x " + arr[0].length + " array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display the 2D array elements row-wise
    public void display() {
        System.out.println("TwoDArray elements row-wise:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to split this 2D array into two 1D arrays and store in OneDArray objects
    public void splitArrays(OneDArray arr1, OneDArray arr2) {
        int n = arr[0].length;
        for (int j = 0; j < n; j++) {
            arr1.arr[j] = arr[0][j];
            arr2.arr[j] = arr[1][j];
        }
    }

    // Method to add two TwoDArray objects (element-wise addition)
    public TwoDArray add(TwoDArray other) {
        int n = arr[0].length;
        TwoDArray result = new TwoDArray(n);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                result.arr[i][j] = this.arr[i][j] + other.arr[i][j];
            }
        }
        return result;
    }

    // Method to multiply two TwoDArray objects element-wise
    public TwoDArray multiply(TwoDArray other) {
        int n = arr[0].length;
        TwoDArray result = new TwoDArray(n);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                result.arr[i][j] = this.arr[i][j] * other.arr[i][j];
            }
        }
        return result;
    }
}

// Test driver class
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the column size (n) for TwoDArray: ");
        int n = sc.nextInt();

        // Create first TwoDArray object and input data
        TwoDArray arr1 = new TwoDArray(n);
        System.out.println("\nInput data for first 2D array:");
        arr1.inputData();

        // Create second TwoDArray object and input data
        TwoDArray arr2 = new TwoDArray(n);
        System.out.println("Input data for second 2D array:");
        arr2.inputData();

        // Display both arrays
        System.out.println("\nFirst TwoDArray:");
        arr1.display();

        System.out.println("\nSecond TwoDArray:");
        arr2.display();

        // Add the two arrays
        TwoDArray sum = arr1.add(arr2);
        System.out.println("\nSum of two TwoDArray objects:");
        sum.display();

        // Multiply the two arrays element-wise
        TwoDArray product = arr1.multiply(arr2);
        System.out.println("\nElement-wise product of two TwoDArray objects:");
        product.display();

        // Split first 2D array into two 1D arrays
        OneDArray oneD1 = new OneDArray(n);
        OneDArray oneD2 = new OneDArray(n);
        arr1.splitArrays(oneD1, oneD2);

        // Display the split 1D arrays
        System.out.println("\nFirst row of TwoDArray stored in OneDArray object:");
        oneD1.display();

        System.out.println("\nSecond row of TwoDArray stored in OneDArray object:");
        oneD2.display();
    }
}

*/
