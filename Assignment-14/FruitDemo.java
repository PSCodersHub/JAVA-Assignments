// Question-2

// Abstract class Fruit
abstract class Fruit {
    String colour;
    String taste;

    // Constructor
    Fruit(String colour, String taste) {
        this.colour = colour;
        this.taste = taste;
    }

    // Abstract method
    abstract void display();
}

// Apple class
class Apple extends Fruit {
    Apple(String colour, String taste) {
        super(colour, taste);
    }

    @Override
    void display() {
        System.out.printf("Fruit: %s%nColour: %s%nTaste: %s%n%n", "Apple", colour, taste);
    }
}

// Banana class
class Banana extends Fruit {
    Banana(String colour, String taste) {
        super(colour, taste);
    }

    @Override
    void display() {
        System.out.printf("Fruit: %s%nColour: %s%nTaste: %s%n%n", "Banana", colour, taste);
    }
}

// Orange class
class Orange extends Fruit {
    Orange(String colour, String taste) {
        super(colour, taste);
    }

    @Override
    void display() {
        System.out.printf("Fruit: %s%nColour: %s%nTaste: %s%n%n", "Orange", colour, taste);
    }
}

// Strawberry class
class Strawberry extends Fruit {
    Strawberry(String colour, String taste) {
        super(colour, taste);
    }

    @Override
    void display() {
        System.out.printf("Fruit: %s%nColour: %s%nTaste: %s%n%n", "Strawberry", colour, taste);
    }
}

// Main class
public class FruitDemo {
    public static void main(String[] args) {
        Apple apple = new Apple("Red", "Sweet");
        Banana banana = new Banana("Yellow", "Sweet and Soft");
        Orange orange = new Orange("Orange", "Citrus and Tangy");
        Strawberry strawberry = new Strawberry("Red", "Sweet and Slightly Sour");

        apple.display();
        banana.display();
        orange.display();
        strawberry.display();
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Fruit: Apple
 * Colour: Red
 * Taste: Sweet
 * 
 * Fruit: Banana
 * Colour: Yellow
 * Taste: Sweet and Soft
 * 
 * Fruit: Orange
 * Colour: Orange
 * Taste: Citrus and Tangy
 * 
 * Fruit: Strawberry
 * Colour: Red
 * Taste: Sweet and Slightly Sour
 */





// ALTERNATE SOLUTION:
// You can also use the following code for the display method in each fruit class to achieve the same output format.

/*
// Apple class
class Apple extends Fruit {
    Apple(String colour, String taste) {
        super(colour, taste);
    }

    @Override
    void display() {
        System.out.println("Fruit: Apple");
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
        System.out.println();
    }
}

// Banana class
class Banana extends Fruit {
    Banana(String colour, String taste) {
        super(colour, taste);
    }

    @Override
    void display() {
        System.out.println("Fruit: Banana");
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
        System.out.println();
    }
}

// Orange class
class Orange extends Fruit {
    Orange(String colour, String taste) {
        super(colour, taste);
    }

    @Override
    void display() {
        System.out.println("Fruit: Orange");
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
        System.out.println();
    }
}

// Strawberry class
class Strawberry extends Fruit {
    Strawberry(String colour, String taste) {
        super(colour, taste);
    }

    @Override
    void display() {
        System.out.println("Fruit: Strawberry");
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
        System.out.println();
    }
}
*/
