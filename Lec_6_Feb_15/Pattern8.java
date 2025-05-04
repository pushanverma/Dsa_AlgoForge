import java.util.*;

public class Pattern8 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        // note: 1st Approcach (Pattern template method)
        int tnol = n;
        int cnol = 0;

        while (cnol < tnol) {

            // print stars
            for (int i = 0; i < n; i++) {
                if (cnol + i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // prepare for the next line
            cnol++;
            System.out.println();
        }

        // note: 2nd Approach (using for loop)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
