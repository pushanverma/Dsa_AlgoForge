import java.util.*;

public class Pattern9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int tnol = n;
        int cnol = 0;

        while (cnol < tnol) {

            // print stars

            for (int i = 0; i < n; i++) {
                if (cnol == i || cnol + i == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            // prepare for the next line
            cnol++;
            System.out.println();
        }

        // note: 2nd Approach (for loop)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
