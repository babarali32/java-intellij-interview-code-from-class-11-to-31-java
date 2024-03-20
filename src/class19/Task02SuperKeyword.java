package class19;

public class Task02SuperKeyword {
    // Write program: Shape class has a constructor that takes
    // the radius and has a subclass as circle class.
    // In circle class create a method to calculate the area of circle. Test your code
    public static void main(String[] args) {
        Circle obj = new Circle(5); // Assuming radius is 5
        obj.areaOfCircle();
    }
}
class Shape {
    double radius;

    public Shape(double radius) {
        this.radius = radius;
    }
}
class Circle extends Shape {
    double pi = 3.1416;

    public Circle(double radius) {
        super(radius); // Call the superclass constructor to initialize radius
    }
    public void areaOfCircle() {
        double area = pi * radius * radius; // Formula to calculate area of a circle
        System.out.println("Area of the circle: " + area);
    }
}
