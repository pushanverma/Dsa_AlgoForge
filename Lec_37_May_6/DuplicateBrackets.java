import java.util.*;

public class DuplicateBrackets {

    public static boolean checkDuplicate(String str) {

        int n = str.length();

        // making Stack of dataType character

        Stack<Character> st = new Stack<>();

        // performing LIFO operation
        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);

            // if you find any closing bracket
            if (ch == ')') {

                // start poping untill you find a opening bracket

                if (st.peek() == '(') {
                    // if you got opening bracket right infront then duplicate brackets are present

                    return true;
                } else {
                    // delete untill you find opening bracket
                    while (st.peek() != '(') {
                        st.pop();
                    }
                }

            } else {
                // if you find anything other than closing bracket just push it
                st.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String str = "((a+b)+((c+d))";

        boolean ans = checkDuplicate(str);

        if(ans){
            System.out.println("Duplicate brackets present ");
        }else {
            System.out.println("No Duplicate brackets  ");
        }

    }

}
