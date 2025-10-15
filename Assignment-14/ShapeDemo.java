// Question-1

// Abstract class Shape
abstract class Shape {
    double length, breadth, height;

    // Constructor
    Shape(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Abstract methods
    abstract double volume();

    abstract double surfaceArea();
}

// Cube class
class Cube extends Shape {

    Cube(double side) {
        super(side, side, side); // All dimensions are equal for a cube
    }

    @Override
    double volume() {
        return Math.pow(length, 3); // side³
    }

    @Override
    double surfaceArea() {
        return 6 * Math.pow(length, 2); // 6 × side²
    }
}

// Cuboid class
class Cuboid extends Shape {

    Cuboid(double length, double breadth, double height) {
        super(length, breadth, height);
    }

    @Override
    double volume() {
        return length * breadth * height; // l × b × h
    }

    @Override
    double surfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length); // 2(lb + bh + lh)
    }
}

// Cylinder class
class Cylinder extends Shape {
    Cylinder(double radius, double height) {
        super(radius, radius, height);
    }

    @Override
    double volume() {
        return Math.PI * length * length * height; // length used as radius // π × r² × h
    }

    @Override
    double surfaceArea() {
        return 2 * Math.PI * length * (length + height); // 2πr(r + h)
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        Cuboid cuboid = new Cuboid(4, 5, 6);
        Cylinder cylinder = new Cylinder(3, 7);

        System.out.println("=== Cube ===");
        System.out.println("Volume: " + cube.volume());
        System.out.println("Surface Area: " + cube.surfaceArea());

        System.out.println("\n=== Cuboid ===");
        System.out.println("Volume: " + cuboid.volume());
        System.out.println("Surface Area: " + cuboid.surfaceArea());

        System.out.println("\n=== Cylinder ===");
        System.out.println("Volume: " + cylinder.volume());
        System.out.println("Surface Area: " + cylinder.surfaceArea());
    }
}

/*
 * FINAL OUTPUT:
 * 
 * === Cube ===
 * Volume: 125.0
 * Surface Area: 150.0
 * 
 * === Cuboid ===
 * Volume: 120.0
 * Surface Area: 148.0
 * 
 * === Cylinder ===
 * Volume: 197.92033717615698
 * Surface Area: 188.49555921538757
 */
