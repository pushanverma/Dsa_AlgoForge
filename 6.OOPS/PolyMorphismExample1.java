import java.util.*;

class Vehicle {

    String color;
    int mileage;

    public Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    // note: methods

    public void Honk(String a) {
        System.out.println("BEEP BEEP vehicle !!");
    }

    public void run(int a) {
        System.out.println("Running in class Vehicle ");
    }

}

class Car extends Vehicle {
    int HorsePower;

    public Car() {
        System.out.println("Car constructor called");
    }

    // note: methods
    public void Honk(int a) {
        System.out.println("BEEP BEEP car!!");
    }

    public void Honk(int a, String str) {
        System.out.println("BEEP BEEP car more arguments");
    }

    public void run(int a) {
        System.out.println("Running in class Car ");
    }

}

class Bike extends Vehicle {
    int cc;

    public Bike() {
        System.out.println("Bike constructor called");
    }

    // note: methods
    public void run(int a) {
        System.out.println("Running in class Bike  ");
    }

}

public class PolyMorphismExample1 {

    public static void main(String[] args) {

        // ------------------COMPILE TIME POLYMORPHISM-------------------------------

        // note: this is Compile time polymorphism, because at compile time we can
        // detect which method will run, Vehicle class has Honk method with string
        // argument and Car class has Honk method with int argument.

        // Car c1 = new Car();

        // c1.Honk(1); // Car class fn will run
        // c1.Honk("abc"); // Vehicle class fn will run
        // c1.Honk(12, "abc"); // Car class fn will run with 2 arguments

        // ------------------RUN TIME POLYMORPHISM-----------------------------------

        // upcasting , creating a Vehicle object with Car
        Vehicle obj1 = new Car();
        obj1.run(12);
        Vehicle obj2 = new Bike();
        obj2.run(24);

    }

}
