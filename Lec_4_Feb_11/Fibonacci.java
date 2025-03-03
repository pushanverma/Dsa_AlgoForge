import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = scn.nextInt();

        int a = 0, b = 1;
        int ans = 0;

        if (n <= 1) {
            ans = n;
        } else {

            for (int i = 2; i <= n; i++) {
                ans = a + b;
                a = b;
                b = ans;
            }

        }

        System.out.println(n + "th term = " + ans);

    }
}