import java.util.*;

public class Pattern6 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // only odd values allowed
        int n = scn.nextInt();

        int tnol = n;
        int cnol = 1;

        int star = (n + 1) / 2;
        int space = 1;

        int mid = n / 2;

        while (cnol <= tnol) {

            // print stars

            for (int i = 1; i <= star; i++) {
                System.out.print("*");
            }

            // print space

            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }

            // print stars
            for (int i = 1; i <= star; i++) {
                System.out.print("*");
            }

            // prepare for next line
            if (cnol <= mid) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }
            cnol++;
            System.out.println();

        }

    }

}