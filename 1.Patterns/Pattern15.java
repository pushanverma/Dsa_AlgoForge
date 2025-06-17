import java.util.*;

public class Pattern15 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int tnol = n;
        int cnol = 1;
        int mid = (n + 1) / 2;

        int stars = n;
        int space = 0;

        while (cnol <= tnol) {

            // print spaces
            for (int i = 1; i <= space; i++) {
                System.out.print("\t");
            }

            // print stars
            for (int i = 1; i <= stars; i++) {

                // half
                if (cnol > 1 && cnol <= n / 2) {

                    if (i == 1 || i == stars) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }

                }

                else {
                    System.out.print("*\t");
                }

            }

            // prepare for the next line

            if (cnol < mid) {
                space++;
                stars -= 2;
            } else {
                space--;
                stars += 2;
            }

            cnol++;
            System.out.println();

        }

    }

}
