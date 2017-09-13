package Excercise1;

public class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        super(null, null);
        this.center = center;
        this.radius = radius;
    }
    @Override
    public Point getCenter() {
        return center;
    }
}
