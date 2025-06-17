import java.util.*;

public class Pattern14 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int tnol = n;
        int cnol = 1;

        int star = 1;
        int space = 2 * n - 3;

        int startingNumber = 1;

        // note: My Approach

        while (cnol <= tnol) {
            // print star

            for (int i = 1; i <= star; i++) {
                System.out.print(startingNumber + "\t");
                startingNumber++;
            }

            // print space
            for (int i = 0; i < space; i++) {
                System.out.print("\t");
            }

            // print star

            // for last line extra star
            if (cnol == tnol) {
                star--;
                startingNumber--;
            }
            // System.out.println(startingNumber+"....startingNumber");

            for (int i = 1; i <= star; i++) {
                System.out.print((startingNumber - 1) + "\t");
                startingNumber--;

            }

            // prepare for the next line

            star++;
            space -= 2;

            cnol++;
            System.out.println();

        }

        // note: Easy and Good Approach (reverse the loop )

        while (cnol <= tnol) {
            // print star

            for (int i = 1; i <= star; i++) {
                System.out.print(i + "\t");
                // startingNumber++;
            }

            // print space
            for (int i = 1; i <= space; i++) {
                System.out.print("\t");
            }

            // print star

            // for last line extra star
            if (cnol == tnol) {
                star--;
                // startingNumber--;
            }
            // System.out.println(startingNumber+"....startingNumber");

            for (int i = star; i >= 1; i--) {
                System.out.print(i + "\t");
                // startingNumber--;

            }

            // prepare for the next line

            star++;
            space -= 2;

            cnol++;
            System.out.println();

        }

    }

}
