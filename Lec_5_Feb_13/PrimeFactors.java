import java.util.*;

public class PrimeFactors {

    public static boolean isPrime(int n) {

        boolean isPrime = true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number =");
        int num = scn.nextInt();

        System.out.print("Prime factors are -");

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                // System.out.println(i+"....i");
                boolean result = isPrime(i);
                if (result) {
                    System.out.print(i + ", ");
                }

            }
        }

    }

}
