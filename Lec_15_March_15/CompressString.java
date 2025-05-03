import java.util.Scanner;

public class CompressString {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter string =");
        String s = scn.next();



        String compressString = s.charAt(0) + "";

        // why we have added "" to String , because we cant just add a character in string , we have to make it string by adding empty space


        char previous = s.charAt(0);
        

        for (int i = 1; i < s.length(); i++) {

            char current = s.charAt(i);

            if (current != previous) {
                compressString = compressString + current;
            }

            previous = current;

        }

        System.out.println(compressString + ".....compressString");

    }
}