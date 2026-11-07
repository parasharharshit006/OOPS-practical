//practical 2.3 Hierarchical Inheritance
class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Shape Color: " + color);
    }
}
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}


class Rectangle extends Shape {
    double length, width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("--- Circle Details ---");
        circle.displayColor(); 
        circle.calculateArea(); 

        System.out.println("\n--- Rectangle Details ---");
        rectangle.displayColor(); 
        rectangle.calculateArea(); 
    }
}