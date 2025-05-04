import java.util.*;

public class Pattern7 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int tnol = n;
        int cnol = 1;

        // note: 1st Approach(using Pattern template)
        while (cnol <= tnol) {

            // print stars

            for (int i = 1; i <= n; i++) {
                if (cnol == i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            cnol++;
            System.out.println();

        }

        // note: 2nd Approach

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

}
