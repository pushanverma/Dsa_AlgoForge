import java.util.*;

class Bikes {

    String engineType;
    String color;
    int horsePower;

    static int numberofBikes = 0;

    // default constructor

    public Bikes(String engineType, String color, int horsePower) {
        this.engineType = engineType;
        this.color = color;
        this.horsePower = horsePower;

        this.numberofBikes++;

    }

    public void colorChange(String newColor) {
        this.color = newColor;
    }

    public void doubleHorsePower(int horsePower) {
        this.horsePower = horsePower * 2;
    }

    public static int getNumberofBikes() {
        return numberofBikes;
    }
}

public class BikesQuestion2 {

    public static void createBikes(int bikes) {
        while (bikes-- > 0) {
            Bikes b1 = new Bikes("V8", "Blue", 200);

        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("How many bikes you want ");

        int n = scn.nextInt();

        createBikes(n);

        // Bikes b1 = new Bikes("V8", "Red", 100);

         System.out.println(Bikes.getNumberofBikes()); 


    }

}
