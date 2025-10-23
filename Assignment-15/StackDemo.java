// Question-2

import java.util.Scanner;

// Step 1: Define the interface
interface StackOperations {
    void push(int element);

    int pop();

    void display();
}

// Step 2: Define the class that implements the interface
class MyStack implements StackOperations {
    private int[] stack; // array to store stack elements
    private int top; // keeps track of top index
    private int size; // maximum size of stack

    // Constructor to initialize the stack
    MyStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1; // empty stack
    }

    // Push method
    public void push(int element) {
        if (top == size - 1) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            top++;
            stack[top] = element;
            System.out.println(element + " pushed into stack.");
        }
    }

    // Pop method
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        } else {
            int poppedElement = stack[top];
            top--;
            System.out.println(poppedElement + " popped from stack.");
            return poppedElement;
        }
    }

    // Display method
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements (top to bottom):");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

// Step 3: Menu-driven main program
public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        MyStack myStack = new MyStack(size);
        int choice;

        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    myStack.push(element);
                    break;

                case 2:
                    myStack.pop();
                    break;

                case 3:
                    myStack.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter stack size: 3
 * 
 * --- STACK MENU ---
 * 1. PUSH
 * 2. POP
 * 3. DISPLAY
 * 4. EXIT
 * Enter your choice: 1
 * Enter element to push: 10
 * 10 pushed into stack.
 * 
 * --- STACK MENU ---
 * 1. PUSH
 * 2. POP
 * 3. DISPLAY
 * 4. EXIT
 * Enter your choice: 3
 * Stack elements (top to bottom):
 * 10
 * 
 * --- STACK MENU ---
 * 1. PUSH
 * 2. POP
 * 3. DISPLAY
 * 4. EXIT
 * Enter your choice: 2
 * 10 popped from stack.
 * 
 * --- STACK MENU ---
 * 1. PUSH
 * 2. POP
 * 3. DISPLAY
 * 4. EXIT
 * Enter your choice: 4
 * Exiting...
 * 
 */