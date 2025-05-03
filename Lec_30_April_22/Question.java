import java.util.*;

class Node {
    int data;
    Node next;

    // Node constructor (parametrized with 1 value)
    public Node(int data) {
        this.data = data;
    }

}

class Question {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // taking input
        System.out.print("Enter n1 =");
        int value1 = scn.nextInt();

        System.out.print("Enter n2 =");
        int value2 = scn.nextInt();

        System.out.print("Enter n3 =");
        int value3 = scn.nextInt();

        System.out.print("Enter n4 =");
        int value4 = scn.nextInt();

        // Creating node

        Node n1 = new Node(value1);
        Node n2 = new Node(value2);
        Node n3 = new Node(value3);
        Node n4 = new Node(value4);

        // Connecting nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Printing Linked Lists
        System.out.println(n1.data);
        System.out.println(n2.data);
        System.out.println(n3.data);
        System.out.println(n4.data);

        // 2nd way
        System.out.println("------------------------------");
        System.out.println(n1.data);
        System.out.println(n1.next.data);
        System.out.println(n1.next.next.data);
        System.out.println(n1.next.next.next.data);
        System.out.println(n1.next.next.next.next);

    }

}