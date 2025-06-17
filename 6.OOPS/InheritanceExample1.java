import java.util.*;



//-----------------------------------SINGLE INHERITANCE EXAMPLE------------------------------------------

//topic:PARENT CLASS
class Vehicle {

    // note:attributes
    String color;
    int mileage;

    // note:constructor
    public Vehicle() {
        System.out.println("Constructor of Vehicle class is called");
        // System.out.println(this.color+","+this.mileage);
    }

    public Vehicle(String color, int mileage) {
        this.color = color;
        this.mileage = mileage;

        System.out.println("Parametrized constructor called for Vehicle class");

    }

    // note:methods
    public void Honk() {
        System.out.println("BEEP BEEP !!");
    }

}

// topic: CHILD CLASS
class Bike extends Vehicle {
    // note: extends keyword means it is extending the features of Vehicle in Bike
    // (just like a child inherits features of Parent )

    // note:attributes
    int bikePower;

    // note:constructor
    public Bike() {
        System.out.println("Constructor of Bike class is called");
    }

    public Bike(String color, int mileage, int bikePower) {
        super(color, mileage);
        // topic:SUPER keyword(super will call the parametrized constructor of Parent class(Super class) from  child class(sub class)
        this.bikePower = bikePower;

        System.out.println("Parametrized constructor called for Bike class");

    }

    // note:methods
    public void BikeStunt() {
        System.out.println("Doing wheely !!");
    }

}

public class InheritanceExample1 {

    public static void main(String[] args) {

        Bike b1 = new Bike();
        // note: After making an object , constructor is called .Making object of class
        // child , will call the constuctor of Parent class first , because Parent has
        // produced children not the reverse.

        b1.color = "blue";
        b1.mileage = 20;
        b1.Honk();
        // note: Object of child class can access attributes and function of Parent
        // class

        Bike b2 = new Bike("Red", 24, 67);

        System.out.println("b2 color-> " + b2.color);
        System.out.println("b2 mileage-> " + b2.mileage);
        System.out.println("b2 bikePower-> " + b2.bikePower);

    }

}