import java.util.*;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number = ");

        int num = scn.nextInt();

        int originalNum = num;

        // 1. count number of digits

        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println("count - " + count + " , num -" + num + " , OriginalNum - " + originalNum);

        int ans = 0;

        while (originalNum > 0) {
            // taking lastDigit
            int lastDigit = originalNum % 10;

            // ans = lastdigit*10000
            ans = ans + lastDigit * ((int) Math.pow(10, count - 1));

            // shortening the originalNum
            originalNum = originalNum / 10;

            // decreasing count
            count--;

            System.out.println(ans + " ans ," + originalNum + ".....originalNum , " + count + ".....count");

        }

        System.out.println(ans);

        // 2nd method(Shorter)

        



    }
}