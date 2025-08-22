// Question-2

import java.util.Scanner;

class JaggedArray {
    int[][] marks; // Jagged array
    String[] names = { "Child1", "Child2", "Child3", "Child4", "Child5" };

    // Constructor to allocate jagged array
    JaggedArray() {
        marks = new int[5][];
        marks[0] = new int[3]; // Child1 - 3 subjects
        marks[1] = new int[5]; // Child2 - 5 subjects
        marks[2] = new int[2]; // Child3 - 2 subjects
        marks[3] = new int[6]; // Child4 - 6 subjects
        marks[4] = new int[4]; // Child5 - 4 subjects
    }

    // Input marks
    void inputMarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for " + names[i] + ":");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }
    }

    // Display marks row-wise
    void displayMarks() {
        System.out.println("\n--- Marks of Each Child ---");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(names[i] + ": ");
            for (int mark : marks[i]) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
    }

    // Total marks for each child
    void totalMarks() {
        System.out.println("\n--- Total Marks ---");
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int mark : marks[i])
                total += mark;
            System.out.println(names[i] + ": " + total);
        }
    }

    // Count marks > 80
    void countAbove80() {
        System.out.println("\n--- Marks > 80 ---");
        for (int i = 0; i < marks.length; i++) {
            int count = 0;
            for (int mark : marks[i]) {
                if (mark > 80)
                    count++;
            }
            System.out.println(names[i] + ": " + count + " subject(s) above 80");
        }
    }

    // Alert for marks < 30
    void alertLowMarks() {
        System.out.println("\n--- Alert: Marks < 30 ---");
        for (int i = 0; i < marks.length; i++) {
            boolean found = false;
            System.out.print(names[i] + ": ");
            for (int mark : marks[i]) {
                if (mark < 30) {
                    System.out.print(mark + " ");
                    found = true;
                }
            }
            if (!found)
                System.out.print("No low marks");
            System.out.println();
        }
    }
}

class MainMarks {
    public static void main(String[] args) {
        JaggedArray ja = new JaggedArray();
        ja.inputMarks();
        ja.displayMarks();
        ja.totalMarks();
        ja.countAbove80();
        ja.alertLowMarks();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * 
 * INPUT:
 * 
 * Enter marks for Child1:
 * Subject 1: 85
 * Subject 2: 90
 * Subject 3: 60
 * Enter marks for Child2:
 * Subject 1: 70
 * Subject 2: 45
 * Subject 3: 33
 * Subject 4: 90
 * Subject 5: 81
 * Enter marks for Child3:
 * Subject 1: 40
 * Subject 2: 20
 * Enter marks for Child4:
 * Subject 1: 92
 * Subject 2: 88
 * Subject 3: 77
 * Subject 4: 95
 * Subject 5: 29
 * Subject 6: 60
 * Enter marks for Child5:
 * Subject 1: 55
 * Subject 2: 84
 * Subject 3: 61
 * Subject 4: 27
 * 
 * 
 * OUTPUT:
 * 
 * --- Marks of Each Child ---
 * Child1: 85 90 60
 * Child2: 70 45 33 90 81
 * Child3: 40 20
 * Child4: 92 88 77 95 29 60
 * Child5: 55 84 61 27
 * 
 * --- Total Marks ---
 * Child1: 235
 * Child2: 319
 * Child3: 60
 * Child4: 441
 * Child5: 227
 * 
 * --- Marks > 80 ---
 * Child1: 2 subject(s) above 80
 * Child2: 2 subject(s) above 80
 * Child3: 0 subject(s) above 80
 * Child4: 3 subject(s) above 80
 * Child5: 1 subject(s) above 80
 * 
 * --- Alert: Marks < 30 ---
 * Child1: No low marks
 * Child2: No low marks
 * Child3: 20
 * Child4: 29
 * Child5: 27
 * 
 */