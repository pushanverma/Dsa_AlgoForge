import java.util.*;

public class Bikes {

    String engineType;
    String color;
    int horsePower;

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
        this.horsePower = horsePower;
    }

    public static void main(String[] args) {

        Bikes b1 = new Bikes("V8", "Red", 100);

        System.out.println(b1.engineType + " , " + b1.color + " , " + b1.horsePower);

        b1.colorChange("blue");

        System.out.println(b1.engineType + " , " + b1.color + " , " + b1.horsePower);

        b1.doubleHorsePower(200);

        System.out.println(b1.engineType + " , " + b1.color + " , " + b1.horsePower);

    }
}