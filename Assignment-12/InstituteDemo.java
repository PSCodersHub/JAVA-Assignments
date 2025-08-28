// Question-2

import java.util.Scanner;

/* ---------- Superclass ---------- */
class Person {
    private String name;
    private String id;
    private int yearOfJoin;

    public void inputCommon(Scanner sc) {
        System.out.print("Name        : ");
        name = sc.nextLine();
        System.out.print("ID          : ");
        id = sc.nextLine();
        System.out.print("Year Joined : ");
        yearOfJoin = sc.nextInt();
        sc.nextLine(); // clear buffer
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYearOfJoin() {
        return yearOfJoin;
    }
}

/* ---------- Subclass 1 : Teacher ---------- */
class Teacher extends Person {
    // constants (percentages expressed as fraction of basic)
    private static final double DA_RATE = 1.10; // 110 %
    private static final double HRA_RATE = 0.15; // 15 %
    private static final double EPF_RATE = 0.12; // 12 %

    private double basic; // monthly basic salary
    private String subjectTaught;

    // derived values
    private double monthlyNet;
    private double annualNet;
    private double annualEpf;

    public void input(Scanner sc) {
        inputCommon(sc); // inherited fields
        System.out.print("Subject Taught : ");
        subjectTaught = sc.nextLine();
        System.out.print("Basic / month  : ");
        basic = sc.nextDouble();
        sc.nextLine();
        calculate();
    }

    private void calculate() {
        double da = basic * DA_RATE;
        double hra = basic * HRA_RATE;
        double epf = basic * EPF_RATE;
        monthlyNet = basic + da + hra - epf;
        annualNet = monthlyNet * 12;
        annualEpf = epf * 12;
    }

    public void report() {
        System.out.println("\n----- Annual Teacher Report -----");
        System.out.println("Name              : " + getName());
        System.out.println("ID                : " + getId());
        System.out.println("Subject           : " + subjectTaught);
        System.out.println("Joined            : " + getYearOfJoin());
        System.out.println("Basic / month     : " + basic);
        System.out.println("Net salary / year : " + annualNet);
        System.out.println("EPF / year        : " + annualEpf);
    }
}

/* ---------- Subclass 2 : Student ---------- */
class Student extends Person {
    private double feePerSem;
    private String course;
    private int durationYrs;

    private double totalFees;

    public void input(Scanner sc) {
        inputCommon(sc);
        System.out.print("Course          : ");
        course = sc.nextLine();
        System.out.print("Fee / semester  : ");
        feePerSem = sc.nextDouble();
        System.out.print("Duration (yrs)  : ");
        durationYrs = sc.nextInt();
        sc.nextLine();
        totalFees = feePerSem * durationYrs * 2; // 2 semesters per year
    }

    public void notice() {
        System.out.println("\n----- Student Fee Notice -----");
        System.out.println("Name          : " + getName());
        System.out.println("ID            : " + getId());
        System.out.println("Course        : " + course);
        System.out.println("Joined        : " + getYearOfJoin());
        System.out.println("Total Fees (₹): " + totalFees);
    }
}

/* ---------- Driver ---------- */
public class InstituteDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* --- Teacher part --- */
        Teacher t = new Teacher();
        System.out.println("Enter Teacher details");
        t.input(sc);
        t.report();

        /* --- Student part --- */
        Student s = new Student();
        System.out.println("\nEnter Student details");
        s.input(sc);
        s.notice();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter Teacher details
 * Name : Anjali Rao
 * ID : T102
 * Year Joined : 2015
 * Subject Taught : Physics
 * Basic / month : 15500
 * 
 * ----- Annual Teacher Report -----
 * Name : Anjali Rao
 * ID : T102
 * Subject : Physics
 * Joined : 2015
 * Basic / month : 15500.0
 * Net salary / year : 560640.0
 * EPF / year : 22320.0
 * 
 * Enter Student details
 * Name : Arjun Das
 * ID : S56
 * Year Joined : 2023
 * Course : B.Tech (CSE)
 * Fee / semester : 18000
 * Duration (yrs) : 4
 * 
 * ----- Student Fee Notice -----
 * Name : Arjun Das
 * ID : S56
 * Course : B.Tech (CSE)
 * Joined : 2023
 * Total Fees (₹): 144000.0
 * 
 */