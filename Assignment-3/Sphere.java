// Question-1
import java.util.Scanner;

class Sphere {
    public static void main(String args[]) {
        final double PI = 3.14159; 

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        double r = s.nextDouble();

        // V = 4/3 * π * r^3
        double volume = (4.0 / 3.0) * PI * r * r * r;
        
        // A = 4 * π * r^2
        double surfaceArea = 4 * PI * r * r;

        System.out.println("Volume of sphere: " + volume);
        System.out.println("Surface area of sphere: " + surfaceArea);
    }
}
