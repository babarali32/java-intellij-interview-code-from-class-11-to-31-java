package class24;

public class task02 {
    //Create an interface named Shape with two methods:
    // calculateArea() and calculatePerimeter(). Implement this interface in two classes:
    // Rectangle and Circle. The Rectangle class should have fields for length and width,
    // while the Circle class should have a field for radius.
    // Implement the calculateArea() and calculatePerimeter()
    // methods in both classes to calculate the area and perimeter of a rectangle and circle, respectively.
    public static void main(String[] args) {
        rectnagle obj1=new rectnagle(3,5);
        obj1.calculateArea();
        obj1.calculatePerimeter();
        System.out.println( "the area of rectangel is = "+obj1.calculateArea());
        System.out.println("the perimeter of rectangle is = "+obj1.calculatePerimeter());
    }
}
interface shape{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
class rectnagle implements shape{
    private double lenght;
    private double width;

    public rectnagle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double calculateArea() {

        return lenght*width;
    }

    @Override
    public double calculatePerimeter() {
    return 2*(lenght+width);
    }
}
class circle implements shape{
    private double radious;

    public circle(double radious) {
        this.radious = radious;
    }

    @Override
    public double calculateArea() {

        return 3.1416*radious*radious;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radious;
    }
}
