// Question-4
class SlopeCalculator {
    public static void main(String args[]) {
        // Directly parse arguments, assuming input is always correct
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        // Check for a vertical line to avoid division by zero
        if (x1 == x2) {
            System.out.println("The slope is undefined (vertical line).");
        } else {
            // Calculate and print the slope in one line
            System.out.println("The slope of the line is: " + ((y2 - y1) / (x2 - x1)));
        }
    }
}

/*
--- How to Run This Code ---

1. Save the code in a file named "SlopeCalculator.java".

2. Open a terminal or command prompt and navigate to the folder, where you saved the file.

3. Compile the Java file using this command:
   javac SlopeCalculator.java

4. Run the program using the 'java' command followed by four numbers
   representing the coordinates x1, y1, x2, and y2.

   Syntax:
   java SlopeCalculator <x1> <y1> <x2> <y2>

   Example:
   java SlopeCalculator 2 3 6 8
*/
