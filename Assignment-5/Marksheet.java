// Question-5
import java.util.Scanner;

class Marksheet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter marks for subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter marks for subject 5: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = (total / 500.0) * 100;
        char grade;

        int band = (int)(percentage / 10);

        switch (band) {
            case 10: // 100%
            case 9:
                grade = 'O';
                break;
            case 8:
                grade = 'E';
                break;
            case 7:
                grade = 'A';
                break;
            case 6:
                grade = 'B';
                break;
            case 5:
                grade = 'C';
                break;
            case 4:
                grade = 'D';
                break;
            default:
                grade = 'F'; // Fail
        }

        System.out.println("\n--- Marksheet ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks Obtained:");
        System.out.println(" Subject 1: " + m1);
        System.out.println(" Subject 2: " + m2);
        System.out.println(" Subject 3: " + m3);
        System.out.println(" Subject 4: " + m4);
        System.out.println(" Subject 5: " + m5);
        System.out.println("Total Marks: " + total + "/500");
        System.out.printf("Percentage: %.2f%%\n", percentage);      // We can also use printf() here.
        System.out.println(grade == 'F' ? "Grade: Fail" : "Grade: " + grade);

        sc.close();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter Roll No: 48
 * Enter Name: PS
 * Enter marks for subject 1: 88
 * Enter marks for subject 2: 85
 * Enter marks for subject 3: 90
 * Enter marks for subject 4: 94
 * Enter marks for subject 5: 84
 * 
 * --- Marksheet ---
 * Roll No: 48
 * Name: PS
 * Marks Obtained:
 *  Subject 1: 88
 *  Subject 2: 85
 *  Subject 3: 90
 *  Subject 4: 94
 *  Subject 5: 84
 * Total Marks: 441/500
 * Percentage: 88.20%
 * Grade: E
 */






/*
// WE CAN USE THIS CODE ALSO (Using If-Else Statements)

import java.util.Scanner;

class Marksheet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter marks for subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter marks for subject 5: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = (total / 500.0) * 100;
        char grade;

        if (percentage >= 90)
            grade = 'O';
        else if (percentage >= 80)
            grade = 'E';
        else if (percentage >= 70)
            grade = 'A';
        else if (percentage >= 60)
            grade = 'B';
        else if (percentage >= 50)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';  // Fail

        System.out.println("\n--- Marksheet ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks Obtained:");
        System.out.println(" Subject 1: " + m1);
        System.out.println(" Subject 2: " + m2);
        System.out.println(" Subject 3: " + m3);
        System.out.println(" Subject 4: " + m4);
        System.out.println(" Subject 5: " + m5);
        System.out.println("Total Marks: " + total + "/500");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println(grade == 'F' ? "Grade: Fail" : "Grade: " + grade);

        sc.close();
    }
}
*/




/*
//========================================================================================

// INSTEAD OF USING THIS PART OF CODE (Without Using Array)

//=========================================================

System.out.print("Enter marks for subject 1: ");
int m1 = sc.nextInt();

System.out.print("Enter marks for subject 2: ");
int m2 = sc.nextInt();

System.out.print("Enter marks for subject 3: ");
int m3 = sc.nextInt();

System.out.print("Enter marks for subject 4: ");
int m4 = sc.nextInt();

System.out.print("Enter marks for subject 5: ");
int m5 = sc.nextInt();

int total = m1 + m2 + m3 + m4 + m5;
double percentage = (total / 500.0) * 100;
char grade;

//========================================================================================

// WE CAN ALSO USE THIS PART OF CODE (Using Array)

//=========================================================
int[] marks = new int[5];
int total = 0;
for (int i = 0; i < 5; i++) {
    System.out.print("Enter marks for subject " + (i+1) + ": ");
    marks[i] = sc.nextInt();
    total += marks[i];
}

double percentage = (total / 500.0) * 100;
char grade;

//========================================================================================
*/
