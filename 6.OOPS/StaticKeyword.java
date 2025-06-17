import java.util.*;

class Bikes {

    String engineType;
    String color;
    int horsePower;

    // topic:static attribute

    static String companyName = "TVS";

    // default constructor

    public Bikes(String engineType, String color, int horsePower) {
        this.engineType = engineType;
        this.color = color;
        this.horsePower = horsePower;
    }

    public void colorChange(String newColor) {
        this.color = newColor;
    }

    public void doubleHorsePower(int horsePower) {
        this.horsePower = horsePower * 2;
    }

    // topic : non static method
    public void noChange() {
        System.out.println("NO change ");
        // topic: RULE(static methods can be called inside non-static method)
        makeSomeChange();
        // topic: RULE(static values can be changed inside non-static method)
        companyName = "TESLA";
    }

    // topic : static method
    public static void makeSomeChange() {
        System.out.println("Calling makeSome Change");

        // this.color="grey";
        // topic: RULE(non static variable cannot be changed inside a static function)
        // note: above line cannot happen , we cant change non-static variable inside a
        // static method because static variable will belong to class and to change
        // color we need object

        // noChange();
        // topic:RULE(non static functions cannot be called inside a static function ,
        // only static to static is possible)

    }
}

// note: we are studying here about static values and functions , but remember
// static values can be changed

public class StaticKeyword {

    public static void main(String[] args) {

        Bikes b1 = new Bikes("v8", "red", 100);
        Bikes b2 = new Bikes("v9", "black", 200);

        System.out.println(b1.companyName);
        System.out.println(b2.companyName);

        // note: changing static values(if you change value for one object , it will be
        // changed for all the objects)
        b1.companyName = "SUZUKI";

        System.out.println(b1.companyName);
        System.out.println(b2.companyName);

        // note: static methods inside class can be invoked without creating a
        // object(comment objects)
        Bikes.makeSomeChange();

        // topic:RULE(non static function can call static functions)
        b1.noChange();

        System.out.println(b1.companyName);
        System.out.println(b2.companyName);

    }

}
