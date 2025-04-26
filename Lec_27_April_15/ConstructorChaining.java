import java.util.*;

class Vehicle {

    // attributes/properties
    String color;
    int mileage;
    int seats;
    int wheels;

    // function / method
    public void honk() {
        System.out.println("BEEP BEEP!!");
    }

    // constructor
    public Vehicle(String color) {
        this.color = color;
        System.out.println("Constructor with color param is called");
    }

    public Vehicle(String color, int mileage) {
        // topic: new syntax (where we are calling constructor having parameter color )
        this(color); // note: calling above constructor having color as param
        this.mileage = mileage;
        System.out.println("Constructor with color,mileage param is called");
    }

    public Vehicle(String color, int mileage, int seats) {
        this(color, mileage); // note: calling above constructor having (color,mileage) as param
        this.seats = seats;
        System.out.println("Constructor with color,mileage,seats param is called");
    }

    public Vehicle(String color, int mileage, int seats, int wheels) {
        this(color, mileage, seats); // note: calling above constructor having (color,mileage,seats ) as param
        this.wheels = wheels;
        System.out.println("Constructor with color,mileage,seats,wheels param is called");
    }

}

public class ConstructorChaining {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Blue", 50, 2, 4);
        System.out.println(v1.color);
        System.out.println(v1.mileage);
        System.out.println(v1.seats);
        System.out.println(v1.wheels);
    }

}
