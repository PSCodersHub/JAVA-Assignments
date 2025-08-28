// Question-1

import java.util.Scanner;

// Superclass: Vehicle
class Vehicle {
    private String brand;
    private String countryOfOrigin;
    private double basePrice;

    // Method to input vehicle details
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Brand: ");
        brand = sc.nextLine();
        System.out.print("Enter Country of Origin: ");
        countryOfOrigin = sc.nextLine();
        System.out.print("Enter Base Price: ");
        basePrice = sc.nextDouble();
    }

    // Method to display vehicle details
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Base Price: " + basePrice);
    }

    // Getter for base price
    public double getBasePrice() {
        return basePrice;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Getter for country of origin
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
}

// Subclass: Car
class Car extends Vehicle {
    private String model;
    private double speed;
    private double marketPrice;

    // Method to input car details
    public void read() {
        Scanner sc = new Scanner(System.in);
        input(); // Call Vehicle's input method
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Speed (km/hr): ");
        speed = sc.nextDouble();

        // Calculate market price based on speed
        double base = getBasePrice();
        if (speed > 80) {
            marketPrice = base + (0.15 * base);
        } else {
            marketPrice = base - (0.05 * base);
        }
    }

    // Method to display car details
    public void show() {
        display(); // Call Vehicle's display method
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/hr");
        System.out.print("Market Price: " + marketPrice);
    }
}

// Main class to test
public class CarDetails {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.read(); // Input all details
        System.out.println("\n--- Car Details ---");
        myCar.show(); // Display all details
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Enter Brand: BMW
 * Enter Country of Origin: Germany
 * Enter Base Price: 50000
 * Enter Model: X3
 * Enter Speed (km/hr): 90
 * 
 * --- Car Details ---
 * Brand: BMW
 * Country of Origin: Germany
 * Base Price: 50000.0
 * Model: X3
 * Speed: 90.0 km/hr
 * Market Price: 57500.0
 * 
 */