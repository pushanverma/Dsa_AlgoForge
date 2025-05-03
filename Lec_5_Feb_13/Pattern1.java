import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter lines --->");
        int n = scn.nextInt();

        int total_number_of_line = n;

        int current_line = 1;
        int stars = 1;

        while (current_line <= total_number_of_line) {
            // 1.Print stars

            for (int i = 1; i <= stars; i++) {
                System.out.print("*\t");
            }

            // 2. Print spaces

            // 3. Prepare for the next Line
            System.out.println();
            stars++;

            current_line++;

        }

    }
}
