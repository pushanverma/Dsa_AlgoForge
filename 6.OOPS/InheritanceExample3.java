import java.util.*;

//-----------------------------------HIERARCHIAL INHERITANCE EXAMPLE------------------------------------------

//topic: PARENT CLASS
class Vehicle {

    String color;
    int mileage;

    public Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    public void Honk() {
        System.out.println("BEEP BEEP !!");
    }

}

//topic: CHILD CLASS 1 
class Car extends Vehicle {
    int HorsePower;

    public Car() {
        System.out.println("Car constructor called");
    }

    public void carFunction() {
        System.out.println("Riding Rolls Royce !!");
    }

}

//topic: CHILD CLASS 2
class Bike extends Vehicle {
    int cc;

    public Bike() {
        System.out.println("Bike constructor called");
    }

    public void bikeFunction() {
        System.out.println(" Riding yamaha rx100");
    }

}

public class InheritanceExample3 {

    public static void main(String[] args) {

        Bike b1 = new Bike();
        b1.bikeFunction();
        b1.Honk();

        Car c1 =new Car();
        c1.carFunction();
        c1.Honk();

    }

}
