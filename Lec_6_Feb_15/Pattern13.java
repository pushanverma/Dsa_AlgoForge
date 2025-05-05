import java.util.*;

public class Pattern13 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int tnol = 2 * n + 1;
        int cnol = 1;

        int space = n;
        int star = 1;

        int mid = (tnol + 1) / 2;

        int startingNumber = 1;

        while (cnol <= tnol) {

            // print spaces
            for (int i = 0; i < space; i++) {
                System.out.print("\t");
            }

            // print stars

            int currentNumber = startingNumber;

            for (int i = 1; i <= star; i++) {

                System.out.print(currentNumber + "\t");

                if (i <= star / 2) {
                    currentNumber++;
                } else {
                    currentNumber--;
                }
            }

            // prepare for the next Line

            if (cnol < mid) {
                space--;
                star += 2;
                startingNumber++;
            } else {
                space++;
                star -= 2;
                startingNumber--;
            }

            cnol++;
            System.out.println();

        }

    }

}
