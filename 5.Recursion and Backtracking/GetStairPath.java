import java.util.*;

public class GetStairPath {

    public static ArrayList<String> getStairAllPaths(int n) {

        if (n < 0) {                                //baseCase
            return new ArrayList<>();
        }

        if (n == 0) {
            ArrayList<String> baseAns = new ArrayList<>();  //baseCase
            baseAns.add("");
            return baseAns;
        }

        // note: maximum a human can take 3 steps
        ArrayList<String> oneStep = getStairAllPaths(n - 1);   //1
        ArrayList<String> twoStep = getStairAllPaths(n - 2);   //2
        ArrayList<String> threeStep = getStairAllPaths(n - 3);  //3

        ArrayList<String> allStairPaths = new ArrayList<>();

        // Adding 1 to paths

        for (String path : oneStep) {
            allStairPaths.add("1" + path);
        }

        // Adding 2 to paths

        for (String path : twoStep) {
            allStairPaths.add("2" + path);
        }

        // Adding 3 to paths
        for (String path : threeStep) {
            allStairPaths.add("3" + path);
        }

            
        return allStairPaths;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Total Stairs =");
        int total_stairs = scn.nextInt();

        ArrayList<String> finalAns = getStairAllPaths(total_stairs);

        System.out.println(finalAns);

    }

}
