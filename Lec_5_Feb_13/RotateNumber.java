import java.util.*;

public class RotateNumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number= ");
        int num = scn.nextInt();

        int originalNum = num;

        System.out.println("Enter rotation number =");
        int k = scn.nextInt();

        // count of digits
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        k = k % count; // making number smaller , irrespective of whether its negative or positive

        if (k < 0) {
            k = k + count; // if number is negative
        }

        int ans = originalNum;

        int rotationDone = 0;

        while (rotationDone < k) {

            int lastDigit = ans % 10;
            ans = ans / 10;
            ans = ans + lastDigit * (int) Math.pow(10, count - 1);

            rotationDone++;
        }

        System.out.println(ans);

    }
}