// Question-2
import java.util.Scanner;

class TemperatureConverter {
    public static void main(String args[]) {
        
        // --- Part 1: Fahrenheit to Celsius ---
        System.out.println("Enter the value of fahrenheit : ");
        Scanner s = new Scanner(System.in);
        double fahrenheitInput = s.nextDouble();
        double celsius = (5.0 / 9.0) * (fahrenheitInput - 32);
        System.out.println("Temperature in degree celsius :" + celsius);

        // --- Part 2: Convert the obtained Celsius back to Fahrenheit ---
        double fahrenheitOutput = celsius * (9.0 / 5.0) + 32;
        System.out.println("The Celsius value converted back to Fahrenheit is :" + fahrenheitOutput);
    }
}