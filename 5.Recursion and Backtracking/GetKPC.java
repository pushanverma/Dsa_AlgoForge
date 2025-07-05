import java.util.*;

public class GetKPC {

    // Leetcode 17
    // -https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

    static String[] mobile_letters_array = { ",:", "<;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static ArrayList<String> getAllKPC(String str) {

        // base case //1
        if (str.length() == 0) {
            ArrayList<String> baseAns = new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }

        int firstDigit = str.charAt(0) - '0'; // digit - 4 (Here the ASCII values are subtracted) //2

        String remainingString = str.substring(1); // String - "56" //3

        ArrayList<String> smallAns = getAllKPC(remainingString); // recursion call //4

        ArrayList<String> final_subsequence = new ArrayList<>(); // final arraylist to be returned //5

        String current_letter = mobile_letters_array[firstDigit]; // String - "ghi" //6

        for (int i = 0; i < current_letter.length(); i++) { // 7

            char firstLetter = current_letter.charAt(i);

            for (String element : smallAns) {
                final_subsequence.add(firstLetter + element);

            }

        }

        return final_subsequence;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // System.out.print("Enter string =");
        // String str = scn.next();

        ArrayList<String> finalAns = getAllKPC("23");
        System.out.println(finalAns + " , " + finalAns.size());

    }

}
