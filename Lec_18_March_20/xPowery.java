import java.util.*;

public  class xPowery {

    public static int PowerFunction(int x, int y) {

        if (y == 0) {
            return 1;
        }

        int smallerAns = PowerFunction(x, y - 1);
        int finalAns = x * smallerAns;
        return finalAns;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter x=");
        int x = scn.nextInt();

        System.out.print("Enter y=");
        int y = scn.nextInt();

        int ans = PowerFunction(x, y);

        System.out.println(ans);

    }
}