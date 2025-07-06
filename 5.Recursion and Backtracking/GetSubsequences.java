
import java.util.*;

public class GetSubsequences {

    // topic : Recursion on the way down 
    public static ArrayList<String> getAllSubsequence_DOWN(String str) {

        // base case
        if (str.length() == 0) {   //1
            ArrayList<String> baseAns = new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }

        // first Character
        char firstCharacter = str.charAt(0);   //2
        // Remaining String
        String remainingString = str.substring(1); //3

        // Recursive call for sending remaining string
        ArrayList<String> smallerAns = getAllSubsequence_DOWN(remainingString); //4

        ArrayList<String> finalAns = new ArrayList<>(); //5

        // a said no   //6
        for (String element : smallerAns) {
            finalAns.add(element);
        }

        // a said yes
        for (String element : smallerAns) {
            finalAns.add(firstCharacter + element);
        }

        return finalAns;

    }

    //topic: Recursion on the way UP 
    public static void getAllSubsequence_UP(String str, String sub) {

        if (str.length() == 0) {
            System.out.println(sub);
            return;
        }

        char first_character = str.charAt(0);

        String remainString = str.substring(1);

        //first char said no 
        getAllSubsequence_UP(remainString, sub);   //1

        // first char said yes 
        getAllSubsequence_UP(remainString, sub + first_character);    //2

    }

    public static void main(String... args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter string =");
        String str = scn.next();

        // on the way down call 
        // ArrayList<String> allsubSequences = getAllSubsequence_DOWN(str);
        // System.out.println(allsubSequences + " , " + allsubSequences.size());
        // on the way up call 
        getAllSubsequence_UP(str, "");
    }

}
