// Question-1

class Student {
    String name;
    int roll;
    int m1, m2, m3;
    double percentage;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void inputMarks(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void calculatePercentage() {
        percentage = (m1 + m2 + m3) / 3.0;
    }

    void display() {
		System.out.println("---- Student Details ----");
		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll);
		System.out.println("Mark1: " + m1);
		System.out.println("Mark2: " + m2);
		System.out.println("Mark3: " + m3);
		System.out.printf("Percentage: %.2f%%\n",percentage);
		System.out.println();
    }

    double getPercentage() {
        return percentage;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

        s1.inputMarks(80, 70, 90);
        s2.inputMarks(85, 65, 88);

        s1.calculatePercentage();
        s2.calculatePercentage();

        s1.display();
        s2.display();

        if (s1.getPercentage() > s2.getPercentage()) {
            System.out.println(s1.name + " has a higher percentage.");
        } else if (s2.getPercentage() > s1.getPercentage()) {
            System.out.println(s2.name + " has a higher percentage.");
        } else {
            System.out.println("Both have equal percentage.");
        }
    }
}

/*
 * FINAL OUTPUT:
 * 
 * ---- Student Details ----
 * Name: Alice
 * Roll: 101
 * Mark1: 80
 * Mark2: 70
 * Mark3: 90
 * Percentage: 80.00%
 * 
 * ---- Student Details ----
 * Name: Bob
 * Roll: 102
 * Mark1: 85
 * Mark2: 65
 * Mark3: 88
 * Percentage: 79.33%
 * 
 * Alice has a higher percentage.
 */