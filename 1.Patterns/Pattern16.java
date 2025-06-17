import java.util.*;

public class Pattern16 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int tnol = n;
        int cnol = 0;

        int stars = 1;

        int mid = tnol / 2;
        // int spaces = n - 1;

        // 1. diagonal and anti-diagonal

        while (cnol <= tnol) {

            // print stars

            for (int i = 0; i < n; i++) {

                if (i == cnol || i + cnol == n - 1) {
                    // printing
                    System.out.print("*\t");

                } else if (cnol > 0 && cnol < n && i == 0 || cnol > 0 && cnol < n && i == n - 1) {
                    // printing left and right walls of stars
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            // prepare for the next line
            cnol++;
            System.out.println();

        }

    }

}
