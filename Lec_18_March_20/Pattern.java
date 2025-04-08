import java.util.*;

public class Pattern {

    public static void printPattern(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n);
        printPattern(n - 1);
        System.out.print(n);
        printPattern(n - 1);
        System.out.print(n);

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number =");
        int n = scn.nextInt();

        printPattern(n);
        System.out.println();

    }
}
