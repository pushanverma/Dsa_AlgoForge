import java.util.*;

public class Fever {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Temprature =");
        double temprature = scn.nextDouble();

        if(temprature>100){
            System.out.println("You have Fever");
        }
        else {
            System.out.println("You don't have Fever");
        }

    }
}