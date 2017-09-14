package Excercise1;

public abstract class Shape {
    private  Point point1;
    private Point point2;

    Shape(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public void moveBy(double dx, double dy) {
        point1.setX(point1.getX() + dx);
        point1.setY(point1.getY() + dy);
    }
    public abstract Point getCenter();

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}
