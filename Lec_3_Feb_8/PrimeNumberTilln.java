
import java.util.*;

public class PrimeNumberTilln {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number = ");
        int n = scn.nextInt();

        int count =0;

        // 1.loop for each number

        //2. Prime number ka logic

        for (int num = 2; num <= n; num++) {

            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a Prime number ");
                count++;
            }
        }

        System.out.println("Total prime numbers till "+n+" = "+count);
    }
}