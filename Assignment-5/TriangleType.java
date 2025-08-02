// Question-2
import java.util.Scanner;

class TriangleType {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int a = s.nextInt();

        System.out.print("Enter side 2: ");
        int b = s.nextInt();

        System.out.print("Enter side 3: ");
        int c = s.nextInt();

        // Check if sides form a valid triangle
        if (a + b > c && b + c > a && a + c > b) {

            if (a == b && b == c)
                System.out.println("Equilateral triangle");
            else if (a == b || b == c || a == c)
                System.out.println("Isosceles triangle");
            else
                System.out.println("Scalene triangle");

        } else {
            System.out.println("Not a valid triangle");
        }

        s.close();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter side 1: 12
 * Enter side 2: 12
 * Enter side 3: 12
 * Equilateral triangle
 */
