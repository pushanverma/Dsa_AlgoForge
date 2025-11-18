
public class Main {

    public static class Node {

        // note: Every LinkedLists has a node in which it has data and address of next
        // Node variables
        int data;
        Node next;

        // constructor function
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {

        // defining nodes with data
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        // connecting it
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // printing it (Navigating it )
        System.out.println("n1->" + n1.data);
        System.out.println("n2->" + n1.next.data);
        System.out.println("n3->" + n1.next.next.data);
        System.out.println("n4->" + n1.next.next.next.data);

    }
}