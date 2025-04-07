import java.util.*;

public class Factorial {

    public static int factorialOfNumber(int n) {

        if (n == 0) {
            return 1;
        }

        int smallerAns = factorialOfNumber(n - 1);
        int finalAns = n * smallerAns;
        return finalAns;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number=");
        int n = scn.nextInt();

        int fact =factorialOfNumber(n);

        System.out.println(fact);
    }

}
