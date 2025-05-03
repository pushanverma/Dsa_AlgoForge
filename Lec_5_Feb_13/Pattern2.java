import java.util.*;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter lines --->");
        int n = scn.nextInt();

        int total_number_of_line = n;

        int current_line = 1;
        int stars = n;

        while (current_line <= total_number_of_line) {
            // print stars

            for (int i = 1; i <= stars; i++) {
                System.out.print("*\t");
            }

            // prepare for the next line
            System.out.println();
            stars--;

            current_line++;

        }

    }
}
