import java.util.*;

//-------------------------------------ABSTRACTION--------------------------------------

// note: here we have only learned about abstract class. "abstract class" and interface are two diffrent things . 

abstract class Shape {

    int numberofSides;

    abstract public double getArea();

    Shape(){
        System.out.println("Constructor in abstract class");
    }

}

class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(int length, int width) {
        super.numberofSides = 4;
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

}

class Circle extends Shape {

    int radius;

    public Circle(int radius) {
        super.numberofSides = 0;
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }
}

public class AbstractionExample {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2, 5);
        System.out.println(r.getArea());

        Circle c = new Circle(2);
        System.out.println(c.getArea());

    }

}
