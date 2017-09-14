/*Excercise1
Zdefiniuj klasę Point z konstruktorem public Point(double x, double y) i metodami
dostępowymi getX, getY. Zdefiniuj klasę podrzędną LabeledPoint z konstruktorem
public LabeledPoint(String label, double x, double y) oraz metodę dostępową
getLabel.

Zdefiniuj metody toString, equals i hashCode dla klasy z poprzedniego ćwiczenia.

Utwórz zmienne instancji x i y klasy Point z ćwiczenia 1. z modyfikatorem protected.
Zademonstruj, że klasa LabeledPoint może uzyskać dostęp do tych zmiennych
jedynie w instancjach klasy LabeledPoint.

Zdefiniuj klasę abstrakcyjną Shape ze zmiennymi instancji klasy Point, konstruktorem,
zdefiniowaną metodą public void moveBy(double dx, double dy), która przesuwa
punkt o zadaną wielkość, oraz abstrakcyjną metodą public Point getCenter().
Utwórz zdefiniowane klasy podrzędne: Circle, Rectangle, Line z konstruktorami:
public Circle(Point center, double radius), public Rectangle(Point topLeft,
double width, double height) oraz public Line(Point from, Point to).
Excercise2
Zdefiniuj metody clone dla klas z poprzedniego ćwiczenia.
*/
package Excercise1;

public class Main {

    public static void main(String[] args) {

    }
}
