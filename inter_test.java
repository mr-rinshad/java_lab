import java.util.Scanner;

// Interface
interface Shape {
    double area();   // abstract method (by default public & abstract)
}

// Rectangle class
class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

// Circle class
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class inter_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle input
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();

        Shape rect = new Rectangle(l, b);

        // Circle input
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        Shape circ = new Circle(r);

        // Output
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Circle: " + circ.area());

        sc.close();
    }
}
