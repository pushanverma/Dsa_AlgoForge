import java.util.*;

//-----------------------------------MULTI-LEVEL INHERITANCE EXAMPLE------------------------------------------
//topic: PARENT CLASS 1 
class Vehicle {

    // note:attributes
    String color = "red";
    int mileage = 10;

    // note:constructor
    public Vehicle() {
        System.out.println("Constructor of Vehicle class is called");
        // System.out.println(this.color+","+this.mileage);
    }

    // note:methods
    public void Honk() {
        System.out.println("BEEP BEEP !!");
    }

}

//topic: CHILD CLASS 1 
class Car extends Vehicle {
    // note: extends keyword means it is extending the features of Vehicle in Car
    // (just like a child inherits features of Parent )

    // note:attributes
    int hosrsePower = 2000;

    // note:constructor
    public Car() {
        System.out.println("Constructor of Car class is called");
    }

    // note:methods
    public void CarStunt() {
        System.out.println("Lucky the Racer is Doing wheely on car , whooooooooooo !!");
    }

}

//topic: CHILD CLASS 2
class Ferrari extends Car {
    // note:attribute
    String modelNumber = "F8 Turbo";

    // note:constructor
    public Ferrari() {
        System.out.println("Constructor of Ferrari class is called");
    }

    // note: method
    public void FerrariNoise() {
        System.out.println("I am the best !!");
    }

}

public class InheritanceExample2 {
    public static void main(String[] args) {

        Ferrari f1 = new Ferrari();

        // accessing attributes of parent classes 
        System.out.println("Color->" + f1.color);
        System.out.println("Mileage->" + f1.mileage);
        System.out.println("HorsePower->" + f1.hosrsePower);
        System.out.println("Model Number->" + f1.modelNumber);


        // accessing the methods of parent classes 
        f1.FerrariNoise();
        f1.CarStunt();
        f1.Honk();

        // modifying the values of parent classes 
        f1.color = "blue";
        System.out.println("Modified Color->" + f1.color);

    }

}
