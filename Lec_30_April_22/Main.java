class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    // topic: addLast function
    public void addLast(int data) {

        Node newnode = new Node(data);

        // if the Linked list is empty
        if (this.head == null) {
            this.head = newnode;
            this.tail = newnode;
        } else {
            // if there are elements in Linkedlist
            tail.next = newnode;
            tail = newnode;
        }

        this.size++;

    }

    // topic: addFirst function
    public void addFirst(int data) {
        Node newnode = new Node(data);

        if (this.head == null) {
            this.head = newnode;
            this.tail = newnode;
        } else {
            // if there are elements in LinkedList
            newnode.next = head;
            head = newnode;
        }

        this.size++;

    }

    // topic : display function

    public void display() {

        // temporary Node

        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " , ");
            temp = temp.next;
        }
        System.out.println();

    }

    // topic: removeLast

    public void removeLast() {

        // if there is no element
        if (this.head == null) {
            System.out.println("We have nothing to remove");
            return;
        }
        // if there is only 1 element
        if (this.head.next == null) {
            this.head = null;
            this.tail = null;
            size = 0;
            return;
        }

        Node temp = this.head;

        while (temp.next != this.tail) {
            temp = temp.next;
        }
        temp.next = null;
        this.tail = temp;

    }

    // topic: removeFirst

    public void removeFirst() {
        Node temp = this.head;
        // no element
        if (this.head == null) {
            System.out.println("There is nothing to remove");
        }
        // 1 element(only 1 node present )
        if (this.head.next == null) {
            this.head = null;
            this.tail = null;
        } else {
            // more than 1 nodes
            this.head = temp.next; // indirectly head.next
        }

    }
}

class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        for (int i = 1; i <= 4; i++) {
            ll.addLast(i);
        }

        // ll.display();

        ll.addFirst(55);
        ll.addFirst(10);

        ll.display();

        // note: checking removeLast fn
        // ll.removeLast();
        // ll.display();

        // ll.removeLast();
        // ll.display();

        // ll.removeLast();
        // ll.display();

        // note:checking removeFirst
        ll.removeFirst();
        ll.display();

        // System.out.println(ll.head.data);
        // System.out.println(ll.head.next.data);
        // System.out.println(ll.head.next.next.data);
        // System.out.println(ll.head.next.next.next.data);
    }
}