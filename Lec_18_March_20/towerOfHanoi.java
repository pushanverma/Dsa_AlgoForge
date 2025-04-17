import java.util.*;

public class towerOfHanoi {

    public static void toh(int n, char from_rod, char to_rod, char helper_rod) {
        if (n == 0) {
            return;
        }

        toh(n - 1, from_rod, helper_rod, to_rod);
        System.out.println("Moving disk " + n + " from " + from_rod + "-->" + to_rod);
        toh(n - 1, helper_rod, to_rod, from_rod);

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number=");

        int n = scn.nextInt();

        toh(n, 'A', 'C', 'B');

    }

}