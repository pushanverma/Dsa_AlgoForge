
//note: by default , all the methods in interface are abstract and all the constansts are static 

interface Shape {

    int a = 65;

    // note: abstract methods(onlt declared here , but defined in child class)

    public abstract void draw();

    public abstract void area();

    // note: static methods(can only be acessed by parent i.e SHape)
    public static void info() {
        System.out.println("Shape information ");
    }

    // note: default methods(can only be accessed by child i.e rectangle and circle
    // )
    public default void marks(int marks) {
        System.out.println(marks + " is obtained");
    }

}

class Circle implements Shape {

    public void draw() {
        System.out.println("Drawing circle !!");
    }

    public void area() {
        System.out.println("Area of circle !!");
    }

}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Drawing Rectangle  !!");
    }

    public void area() {
        System.out.println("Area of Rectangle !!");
    }

}

public class InterfaceExample {
    public static void main(String[] args) {

        // Shape s = new Shape();
        Shape s1 = new Circle();

        // calling abstract method

        s1.draw();
        s1.area();

        Shape s2 = new Rectangle();

        s2.draw();
        s2.area();

        // calling static method
        Shape.info();

        // calling default method
        s1.marks(23);
        s2.marks(34);

    }

}
