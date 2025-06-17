import java.util.*;

public class InverseNumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number = ");

        int num = scn.nextInt();

        int inverse = 0;

        int digit = 0;

        int originalNum = num;

        while (originalNum > 0) {

            // System.out.println(originalNum+"....originalNum ");

            digit++;

            int oldValue = originalNum % 10;
            int oldPosition = digit;


            int newValue = oldPosition;
            int newPosition = oldValue;

            inverse = inverse + newValue * (int) Math.pow(10, newPosition - 1);

            System.out.println(inverse + ".....inverse");

            originalNum = originalNum / 10; // decreasing number

        }

        System.out.println(inverse + ".....inverse");

    }
}