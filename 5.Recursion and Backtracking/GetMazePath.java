import java.util.*;

public class GetMazePath {

// sr-source row ,  sc- source column , dr- destination row , dc-destination column 

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc){


        if(sr>dr || sc > dc){   // reached out of matrix , just return empty arraylist 
            return new  ArrayList<>();
        }


        if(sr==dr && sc==dc){  // reached destination , return arraylist with empty string
        ArrayList<String>baseAns = new ArrayList<>();
        baseAns.add("");
        return baseAns;
        }


        ArrayList<String>allMazePaths = new ArrayList<>();

        //horizontal call 
            ArrayList<String>hpath = getMazePath(sr, sc+1, dr, dc);   //1
        //vertical call 
            ArrayList<String>vpath = getMazePath(sr+1, sc, dr, dc);   //2

          for(String path : hpath){   //3
                allMazePaths.add("h"+path);
            }

            for(String path : vpath){   //4
                allMazePaths.add("v"+path);
            }

    return allMazePaths;


    }

    public static void main(String[] args) {

        ArrayList<String>allPaths = getMazePath(0,0,2,2);
        System.out.println(allPaths);
        
        
    }
}