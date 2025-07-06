
import java.util.*;

public class GetMazePathWithJumps {

    public static ArrayList<String> getMazePathwithJumps(int sr, int sc, int dr, int dc) {

        //base Case
        if (sr > dr || sc > dc) {
            return new ArrayList<>();
        }

        if (sr == dr && sc == dc) {
            ArrayList<String> baseAns = new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }

        ArrayList<String> allPaths = new ArrayList<>();

        //horizontal path 
        for (int jump = 1; jump <= dc - sc; jump++) {
            ArrayList<String> hpath = getMazePathwithJumps(sr, sc + jump, dr, dc);

            for (String path : hpath) {
                allPaths.add("h" + jump + path);
            }
        }

        //vertical paths
        for (int jump = 1; jump <= dr - sr; jump++) {
            ArrayList<String> vpath = getMazePathwithJumps(sr + jump, sc, dr, dc);

            for (String path : vpath) {
                allPaths.add("v" + jump + path);
            }
        }

        //diagonal paths 
        for (int jump = 1; jump <= Math.min(dr-sr, dc-sc); jump++) {
            ArrayList<String> dpath = getMazePathwithJumps(sr + jump, sc + jump, dr, dc);

            for (String path : dpath) {
                allPaths.add("d" + jump + path);
            }
        }

        return allPaths;
        

    }

    public static void main(String[] args) {

        ArrayList<String> ans = getMazePathwithJumps(0, 0, 3, 4);
        System.out.println(ans);
        System.out.println("size->"+ ans.size());

    }

}
