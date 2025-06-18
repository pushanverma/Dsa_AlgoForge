import java.util.*;

public class PrintDecreasingIncreasing {

    public static void printDecreasingIncreasing(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printDecreasingIncreasing(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {

        int n = 5;

        printDecreasingIncreasing(n);
    }

}
