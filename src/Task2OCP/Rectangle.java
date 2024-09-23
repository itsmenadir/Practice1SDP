package Task2OCP;

public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }

}
