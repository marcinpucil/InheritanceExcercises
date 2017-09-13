package Excercise1;

public class Rectangle extends Shape {
    private Point topLeft;
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(null,null);
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point((topLeft.getX()+width)/2,(topLeft.getY()+height)/2);
    }
}
