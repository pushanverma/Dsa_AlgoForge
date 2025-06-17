import java.util.*;

public class Pattern12 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int tnol = n;
        int cnol = 1;
        int stars = 1;

        int a = 0;
        int b = 1;

        while (cnol <= tnol) {
            // print stars

            for (int i = 0; i < stars; i++) {
                int sum = a + b;
                System.out.print(a + "\t");
                a = b;
                b = sum;

            }

            // prepare for the next line
            stars++;
            cnol++;
            System.out.println();

        }

    }

}
