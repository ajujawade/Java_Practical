package pack1;

// Abstract class Shape with abstract methods
abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

// Rectangle class that extends Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Circle class that extends Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Square class that extends Rectangle
class Square extends Rectangle {
    public Square(double side) {
        super(side, side); // A square has equal length and width
    }

    @Override
    public double getPerimeter() {
        return 4 * super.getPerimeter(); // Override to calculate perimeter differently
    }
}

public class Mensuration {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Area of Rectangle is : " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle is : " + rectangle.getPerimeter());

        Circle circle = new Circle(8);
        System.out.println("Area of Circle is : " + circle.getArea());
        System.out.println("Perimeter of Circle is : " + circle.getPerimeter());

        Square square = new Square(6);
        System.out.println("Area of Square is : " + square.getArea());
        System.out.println("Perimeter of Square is : " + square.getPerimeter());
    }
}

