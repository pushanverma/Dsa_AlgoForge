import java.util.*;

public class GetSubsequences {

    public static ArrayList<String> getAllSubsequence(String str) {

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
        ArrayList<String> smallerAns = getAllSubsequence(remainingString); //4

        ArrayList<String> finalAns = new ArrayList<>();

        // a said no
        for (String element : smallerAns) {
            finalAns.add(element);
        }

        // a said yes
        for (String element : smallerAns) {
            finalAns.add(firstCharacter + element);
        }

        return finalAns;

    }

    public static void main(String... args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter string =");
        String str = scn.next();

        ArrayList<String> allsubSequences = getAllSubsequence(str);

        System.out.println(allsubSequences + " , " + allsubSequences.size());

    }

}
