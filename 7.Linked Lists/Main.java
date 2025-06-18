import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(34);
        st.push(-12);
        st.push(0);
        st.push(101);
        st.push(11);

        System.out.println("1.displaying values inside stack ");

        System.out.println(st);
        // note : this will display all the values present in the stack in the form of
        // array ->[34, -12, 0, 101, 11]

        System.out.println("2.topmost value in stack  ");

        System.out.println(st.peek());

        System.out.println("3.deleting value from stack ");

        st.pop();

        System.out.println("4.displaying values inside stack ");

        System.out.println(st);

    }

}
