import java.util.*;

public class CountDigits {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number = ");

        int num = scn.nextInt();

        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println(count);

    }
}