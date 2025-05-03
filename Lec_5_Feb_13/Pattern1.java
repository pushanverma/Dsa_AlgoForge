import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter lines --->");
        int n = scn.nextInt();

        int tnol = n;// total number of line

        int cnol = 1;// current number of line
        int stars = 1;

        // note: 1st Method (using while loop )

        while (cnol <= tnol) {
            // 1.Print stars

            for (int i = 1; i <= stars; i++) {
                System.out.print("*\t");
            }

            // 2. Print spaces

            // 3. Prepare for the next Line
            System.out.println();
            stars++;

            cnol++;

        }

        // note: 2nd method (using for loop)
        for (; cnol <= tnol; cnol++) {
            // 1. print stars

            for (int i = 1; i <= stars; i++) {
                System.out.print("*\t");
            }

            // 2. print spaces

            // 3.prepare for the next line
            stars++;
            System.out.println();
        }

    }
}
