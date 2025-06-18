import java.util.*;

public class ValidParanthesis {

    public static boolean checkValidParanthesis(String str) {

         int n =str.length();

        Stack<Character>st = new Stack<>();

        for(int i=0;i<n;i++){

            char ch =str.charAt(i);

            //small bracket - (  , curly bracket - { , square bracket - [

            // if you find any opening bracket , push in the stack 
            if(ch=='(' || ch =='{' || ch =='['){
                st.push(ch);
            }

            // if you find any closing bracket 
            else if(ch==')' ){
                if(st.peek()!='('){
                    return true;
                }else {
                    st.pop();
                }

            }
            else if(ch=='}'){
                if(st.peek()!='{'){
                    return true;
                }else {
                    st.pop();
                }

            }
            else if(ch==']'){
                if(st.peek()!='['){
                    return true;
                }else {
                    st.pop();
                }

            }

        }








        return false;
    }

    public static void main(String[] args) {

        String str = "(())";

        boolean ans = checkValidParanthesis(str);

        if (ans) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }

    }

}
