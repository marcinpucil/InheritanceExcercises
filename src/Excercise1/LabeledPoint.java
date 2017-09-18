package Excercise1;

import java.util.Objects;

public class LabeledPoint extends Point {

    private String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label=label;
    }
    private String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "label='" + label + getX() + getY() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LabeledPoint that = (LabeledPoint) o;
        return Objects.equals(getLabel(), that.getLabel());
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLabel());
    }



    @Override
    protected LabeledPoint clone() throws CloneNotSupportedException {
        return (LabeledPoint) super.clone();
    }
}
