// Question-2

import java.util.Scanner;

class EmployeeDetails {
    String name;
    int empNo, workingDays, workingHours;
    double salaryPerHour, totalSalary;

    // Default constructor
    EmployeeDetails() {}

    // Parameterized constructor with validation
    EmployeeDetails(String name, int empNo, int workingDay, int workingHour) {
        this.name = name;
        this.empNo = empNo;
        
        if (workingDay > 31) {
            System.out.println("Working days cannot exceed 31. Setting to 31.");
            this.workingDays = 31;
        } else {
            this.workingDays = workingDay;
        }
        
        if (workingHour > 8) {
            System.out.println("Working hours cannot exceed 8 per day. Setting to 8.");
            this.workingHours = 8;
        } else {
            this.workingHours = workingHour;
        }
    }

    // Method to input employee info with Scanner parameter
    void inputInfo(Scanner sc) {
        System.out.print("Enter Name: "); 
        name = sc.nextLine();
        
        System.out.print("Enter Emp No: "); 
        empNo = sc.nextInt();
        
        System.out.print("Enter Working Days: "); 
        int days = sc.nextInt();
        if (days > 31) {
            System.out.println("Working days cannot exceed 31. Setting to 31.");
            workingDays = 31;
        } else {
            workingDays = days;
        }
        
        System.out.print("Enter Working Hours per Day: "); 
        int hours = sc.nextInt();
        if (hours > 8) {
            System.out.println("Working hours cannot exceed 8 per day. Setting to 8.");
            workingHours = 8;
        } else {
            workingHours = hours;
        }
    }

    // Method to input salary with Scanner parameter
    void calculateSalary(Scanner sc) {
        System.out.print("Enter Salary per Hour: ");
        double salary = sc.nextDouble();
        
        if (salary > 500) {
            System.out.println("Salary per hour cannot exceed Rs 500. Setting to Rs 500.");
            salaryPerHour = 500;
        } else {
            salaryPerHour = salary;
        }
        
        totalSalary = workingDays * workingHours * salaryPerHour;
    }

    // Method to display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Emp No: " + empNo);
        System.out.println("Working Days: " + workingDays);
        System.out.println("Working Hours/Day: " + workingHours);
        System.out.println("Salary per Hour: Rs " + salaryPerHour);
        System.out.println("Total Salary: Rs " + totalSalary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner globalScanner = new Scanner(System.in); // ✅ Single Scanner instance
        
        // Object using parameterized constructor
        EmployeeDetails emp1 = new EmployeeDetails("Alice", 101, 28, 8);
        emp1.salaryPerHour = 450;
        emp1.totalSalary = emp1.workingDays * emp1.workingHours * emp1.salaryPerHour;

        // Object using default constructor
        EmployeeDetails emp2 = new EmployeeDetails();
        emp2.inputInfo(globalScanner);
        emp2.calculateSalary(globalScanner);

        // Display both
        System.out.println("\n--- Employee 1 Details ---");
        emp1.display();

        System.out.println("--- Employee 2 Details ---");
        emp2.display();
        
        // ✅ Close the single Scanner at the very end
        globalScanner.close();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter Name: Anjan
 * Enter Emp No: 102
 * Enter Working Days: 30
 * Enter Working Hours per Day: 7
 * Enter Salary per Hour: 480
 * 
 * --- Employee 1 Details ---
 * Name: Alice
 * Emp No: 101
 * Working Days: 28
 * Working Hours/Day: 8
 * Salary per Hour: Rs 450.0
 * Total Salary: Rs 100800.0
 * ---------------------------
 * --- Employee 2 Details ---
 * Name: Anjan
 * Emp No: 102
 * Working Days: 30
 * Working Hours/Day: 7
 * Salary per Hour: Rs 480.0
 * Total Salary: Rs 100800.0
 * ---------------------------
 */






/*
// This code also we can use, but there is one problem that if we use this then we cannot close the scanner class.

import java.util.Scanner;

class EmployeeDetails {
    String name;
    int empNo, workingDays, workingHours;
    double salaryPerHour, totalSalary;

    // Default constructor
    EmployeeDetails() {}

    // Parameterized constructor with validation
    EmployeeDetails(String name, int empNo, int workingDay, int workingHour) {
        this.name = name;
        this.empNo = empNo;
        
        if (workingDay > 31) {
            System.out.println("Working days cannot exceed 31. Setting to 31.");
            this.workingDays = 31;
        } else {
            this.workingDays = workingDay;
        }
        
        if (workingHour > 8) {
            System.out.println("Working hours cannot exceed 8 per day. Setting to 8.");
            this.workingHours = 8;
        } else {
            this.workingHours = workingHour;
        }
    }

    // Method to input employee info with if-else validation
    void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: "); 
        name = sc.nextLine();
        
        System.out.print("Enter Emp No: "); 
        empNo = sc.nextInt();
        
        System.out.print("Enter Working Days: "); 
        int days = sc.nextInt();
        if (days > 31) {
            System.out.println("Working days cannot exceed 31. Setting to 31.");
            workingDays = 31;
        } else {
            workingDays = days;
        }
        
        System.out.print("Enter Working Hours per Day: "); 
        int hours = sc.nextInt();
        if (hours > 8) {
            System.out.println("Working hours cannot exceed 8 per day. Setting to 8.");
            workingHours = 8;
        } else {
            workingHours = hours;
        }
        //sc.close(); // Close Scanner to prevent resource leak
    }

    // Method to input salary per hour and calculate total salary with validation
    void calculateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary per Hour: ");
        double salary = sc.nextDouble();
        
        if (salary > 500) {
            System.out.println("Salary per hour cannot exceed Rs 500. Setting to Rs 500.");
            salaryPerHour = 500;
        } else {
            salaryPerHour = salary;
        }
        
        totalSalary = workingDays * workingHours * salaryPerHour;
        //sc.close(); // Close Scanner to prevent resource leak
    }

    // Method to display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Emp No: " + empNo);
        System.out.println("Working Days: " + workingDays);
        System.out.println("Working Hours/Day: " + workingHours);
        System.out.println("Salary per Hour: Rs " + salaryPerHour);
        System.out.println("Total Salary: Rs " + totalSalary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Object using parameterized constructor
        EmployeeDetails emp1 = new EmployeeDetails("Alice", 101, 28, 8);
        emp1.salaryPerHour = 450; // Set directly within limit
        emp1.totalSalary = emp1.workingDays * emp1.workingHours * emp1.salaryPerHour;

        // Object using default constructor
        EmployeeDetails emp2 = new EmployeeDetails();
        emp2.inputInfo();
        emp2.calculateSalary();

        // Display both
        System.out.println("\n--- Employee 1 Details ---");
        emp1.display();

        System.out.println("--- Employee 2 Details ---");
        emp2.display();
    }
}
*/







/*
// This code also we can use Using Math.min()

 * Why we use Math.min():
 * Math.min() is used for validation to ensure values don't exceed maximum limits.
 * It compares two values and returns the smaller one, effectively capping the input.
 * We have used Math.min() for:
 * - Working Days: Maximum 31 days
 * - Working Hours: Maximum 8 hours per day  
 * - Salary per Hour: Maximum Rs 500


import java.util.Scanner;

class EmployeeDetails {
    String name;
    int empNo, workingDays, workingHours;
    double salaryPerHour, totalSalary;

    // Default constructor
    EmployeeDetails() {}

    // Parameterized constructor with Math.min validation
    EmployeeDetails(String name, int empNo, int workingDay, int workingHour) {
        this.name = name;
        this.empNo = empNo;
        this.workingDays = Math.min(workingDay, 31);    // Cap at 31 days
        this.workingHours = Math.min(workingHour, 8);   // Cap at 8 hours
    }

    // Method to input employee info
    void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: "); 
        name = sc.nextLine();
        System.out.print("Enter Emp No: "); 
        empNo = sc.nextInt();
        System.out.print("Enter Working Days: "); 
        workingDays = Math.min(sc.nextInt(), 31);       // Cap at 31 days
        System.out.print("Enter Working Hours per Day: "); 
        workingHours = Math.min(sc.nextInt(), 8);       // Cap at 8 hours
        sc.close(); // Close Scanner to prevent resource leak
    }

    // Method to input salary per hour and calculate total salary
    void calculateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary per Hour: ");
        salaryPerHour = Math.min(sc.nextDouble(), 500); // Cap at Rs 500
        totalSalary = workingDays * workingHours * salaryPerHour;
        sc.close(); // Close Scanner to prevent resource leak
    }

    // Method to display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Emp No: " + empNo);
        System.out.println("Working Days: " + workingDays);
        System.out.println("Working Hours/Day: " + workingHours);
        System.out.println("Salary per Hour: Rs " + salaryPerHour);
        System.out.println("Total Salary: Rs " + totalSalary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Object using parameterized constructor
        EmployeeDetails emp1 = new EmployeeDetails("Alice", 101, 28, 8);
        emp1.salaryPerHour = Math.min(450, 500); // Ensure salary is within limit
        emp1.totalSalary = emp1.workingDays * emp1.workingHours * emp1.salaryPerHour;

        // Object using default constructor
        EmployeeDetails emp2 = new EmployeeDetails();
        emp2.inputInfo();
        emp2.calculateSalary();

        // Display both
        System.out.println("\n--- Employee 1 Details ---");
        emp1.display();

        System.out.println("--- Employee 2 Details ---");
        emp2.display();
    }
}

*/
