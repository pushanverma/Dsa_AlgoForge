
import java.util.*;

public class Combination {

    //note: factorial with  recursion 
    // public static int factorial(int n) {
    //     if (n == 1) {
    //         return 1;
    //     }
    //     int ans = n * factorial(n - 1);
    //     return ans;
    // }
    //note: factorial with loop 
    public static int factorial(int n) {

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n=");
        int n = scn.nextInt();
        System.out.print("Enter r=");
        int r = scn.nextInt();

        int nCr = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println(n + "C" + r + "= " + nCr);

    }

}
