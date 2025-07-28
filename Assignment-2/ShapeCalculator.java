// Question-3
// Main class to calculate and display the area of different shapes
class ShapeCalculator {
    public static void main(String args[]) {
        
        // --- Circle ---
        // a) Set required data
        double radius = 5.0;
        // b) Calculate area
        double circleArea = Math.PI * radius * radius;
        // c) Display details
        System.out.println("--- Circle Details ---");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + circleArea);
        System.out.println(); // For spacing

        // --- Triangle ---
        // a) Set required data
        double base = 10.0;
        double height = 8.0;
        // b) Calculate area
        double triangleArea = 0.5 * base * height;
        // c) Display details
        System.out.println("--- Triangle Details ---");
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + triangleArea);
        System.out.println(); // For spacing

        // --- Rectangle ---
        // a) Set required data
        double length = 7.0;
        double width = 4.0;
        // b) Calculate area
        double rectangleArea = length * width;
        // c) Display details
        System.out.println("--- Rectangle Details ---");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + rectangleArea);
    }
}
