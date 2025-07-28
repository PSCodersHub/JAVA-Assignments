// Question-3
import java.util.Scanner;

class WaterTankCalculator {
    public static void main(String args[]) {
        // Create a single Scanner object to read all user inputs
        Scanner input = new Scanner(System.in);

        // --- Get the dimensions of the cuboid tank ---
        System.out.println("Enter the dimensions for the cuboid-shaped tank:");
        System.out.print("Enter length (l): ");
        double l = input.nextDouble();

        System.out.print("Enter breadth (b): ");
        double b = input.nextDouble();

        System.out.print("Enter height (h): ");
        double h = input.nextDouble();

        // --- Get the dimensions of the cylindrical device ---
        System.out.println("\nEnter the dimensions for the cylindrical measuring device:");
        System.out.print("Enter radius (r): ");
        double r = input.nextDouble();

        System.out.print("Enter height (ht): ");
        double ht = input.nextDouble();

        // --- Calculate the volumes ---
        // Volume of the cuboid tank: V = l * b * h
        double tankVolume = l * b * h;

        // Volume of the cylindrical device: V = π * r^2 * h
        double cylinderVolume = Math.PI * r * r * ht;

        // --- Calculate the number of cylinders and water left ---
        // Ensure the cylinder has a valid volume to avoid division by zero
        if (cylinderVolume > 0) {
            // The number of times the cylinder is required is the integer part of the division
            int numberOfCylinders = (int) (tankVolume / cylinderVolume);

            // The amount of water left is the remainder of the division
            double waterLeft = tankVolume % cylinderVolume;

            // --- Display the final results ---
            System.out.println("\n--- Calculation Results ---");
            System.out.println("Total volume of water in the tank: " + tankVolume + " cubic units.");
            System.out.println("Volume of the cylindrical device: " + cylinderVolume + " cubic units.");
            System.out.println("Number of times the cylinder is required to empty the tank: " + numberOfCylinders);
            System.out.println("Amount of water left after using the cylinder " + numberOfCylinders + " times: " + waterLeft + " cubic units.");
        } else {
            System.out.println("\nError: Please enter positive value.");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

//Note:
// System.out.println(): Prints the text and then moves the cursor to the next line.
// System.out.print(): Prints the text and leaves the cursor on the same line, right after the printed text.
