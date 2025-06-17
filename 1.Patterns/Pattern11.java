import java.util.*;

public class Pattern11 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int star = 1;

        int tnol = n;
        int cnol = 1;
        int count=1;

        while (cnol <= tnol) {

            // print stars

            for (int i = 0; i < star; i++) {
                System.out.print(count+"\t");
                count++;
            }

            // prepare for the next line
            star++;
            cnol++;
            System.out.println();

        }

    }
}