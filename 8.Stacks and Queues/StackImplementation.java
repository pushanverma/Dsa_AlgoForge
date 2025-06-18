// static stack 
class Stack {
    int maxSize = 10;

    int[] arr = new int[maxSize];7

    // constructor
    public Stack(int val) {

    }

    // Stack methods

    public int peek() {

    }

    public int pop() {

    }

    // if our stack is full, throw error of stackOverflow
    public void push(int value) {

        for (int i = 0; i < arr.length; i++) {

            if (arr.length < 10) {
                arr[i] = value;
            }

        }

    }

    public int size() {

    }
}

class StackImplementation {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(2);
        st.push(23);

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());

    }
}