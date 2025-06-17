import java.util.*;

public class Pattern10 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int tnol = n;
        int cnol = 0;

        int star = 1;

        int outerspace = n / 2;
        int innerspace = -1;

        int mid = n / 2;

        // note: 1st Approach (using Pattern Template)

        while (cnol < tnol) {

            // print outer space
            for (int i = 0; i < outerspace; i++) {
                System.out.print(" ");
            }

            // print star
            System.out.print("*");

            // print innerspace

            for (int i = 0; i < innerspace; i++) {
                System.out.print(" ");
            }

            // print star
            if (cnol > 0 && cnol < n - 1) {
                System.out.print("*");
            }

            // preparing for the next line

            if (cnol < mid) {
                outerspace--;
                innerspace += 2;
            } else {
                outerspace++;
                innerspace -= 2;
            }

            cnol++;
            System.out.println();

        }

        // note: 2nd Approach(using for loop)

        for (int i = 0; i < n; i++) {

            // print outer space
            for (int j = 0; j < outerspace; j++) {
                System.out.print(" ");
            }

            // print star
            System.out.print("*");

            // print innerspace

            for (int j = 0; j < innerspace; j++) {
                System.out.print(" ");
            }

            // print star
            if (i > 0 && i < n - 1) {
                System.out.print("*");
            }

            // preparing for the next line

            if (i < mid) {
                outerspace--;
                innerspace += 2;
            } else {
                outerspace++;
                innerspace -= 2;
            }

            // cnol++;
            System.out.println();

        }

    }
}
