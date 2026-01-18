import java.util.Stack;

public class Questions {

    // topic_1: Check Duplicates
    public static boolean CheckDuplicate(String expression) {

        // an new stack of character is made .
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            // if you encounter closing bracket
            if (ch == ')') {
                // if just at the top , opening bracket is present that means its a extra
                // bracket and duplicate is present
                if (st.peek() == '(') {
                    return true;
                }
                // pop till you find a opening bracket
                while (st.peek() != '(') {
                    st.pop();
                }
                // since we are poppin till we find opening bracket , then removing the last
                // opening bracket .
                st.pop();

            } else {

                // if you do not encounter a closing bracket just push elements
                st.push(ch);
            }

        }
        return false;
    }
    // topic_2: Valid Paranthesis(Leetcode_20)

    public static Boolean isValid(String expression){



    }

    public static void main(String[] args) {

        // topic_1: Check Duplicates

        // String expression = "((a+b)+((e+f)))"; // must return True , since it has duplicate brakcets

        // // String expression = "((a+b)+(e+f))"; // must return False , since it does not
        // // has duplicate brackets .

        // Boolean ans = CheckDuplicate(expression);
        // if (ans == true) {
        // System.out.println(ans + " , Expression has duplicate brackets");
        // } else {
        // System.out.println(ans + " , Expression does not has duplicate brackets");
        // }


        // topic_2: Valid Paranthesis(Leetcode_20)

        String expression = 



        //topic_3 : Next Greater Element on Right (Moving Right to Left)


        


    }

}
