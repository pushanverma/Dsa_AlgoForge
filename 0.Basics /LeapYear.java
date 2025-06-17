
import java.util.*;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter year =");

        int year = scn.nextInt();

        if (year % 4 == 0) {
            // may be a leap year
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a Leap year");
                }

            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }


//-----------------------------------------Shorter version------------------------------------------------
        if(year%400==0){
            System.out.println("Leap Year");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }

    }
}
