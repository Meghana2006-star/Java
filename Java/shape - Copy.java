abstract class Shape {
    // Two integers for dimensions
    int dimension1, dimension2;

    // Constructor to initialize dimensions
    Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    // Abstract method to be implemented by subclasses
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int width, int height) {
        super(width, height);
    }

    
    void printArea() {
        int area = dimension1 * dimension2; // Area of rectangle
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    
    void printArea() {
        double area = 0.5 * dimension1 * dimension2; // Area of triangle
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0); // Second dimension is not used
    }
    void printArea() {
        double area = Math.PI * dimension1 * dimension1; // Area of circle
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape triangle = new Triangle(5, 10);
        Shape circle = new Circle(7);

        rectangle.printArea(); // Prints area of rectangle
        triangle.printArea();  // Prints area of triangle
        circle.printArea();    // Prints area of circle
    }
}