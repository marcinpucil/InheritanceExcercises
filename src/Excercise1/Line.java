package Excercise1;

public class Line extends Shape {
    private Point from;
    private Point to;

    public Line(Point from, Point to) {
        super(null,null);
        this.from = from;
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((to.getX()-from.getX())/2,(to.getY()-from.getY()/2));
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
