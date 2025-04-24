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
        // System.out.println("size of LL" + this.size);

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
            this.size--;
        } else {
            // more than 1 nodes
            this.head = temp.next; // indirectly head.next
            this.size--;
        }

    }

    // topic: getNodeAt()
    public Node getNodeAt(int idx) {

        if (idx == 0 || idx >= size) {
            System.out.println("Node does not exist");
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            Node tempkaNext = temp.next;
            temp = tempkaNext;
        }
        return temp;

    }

    // topic: addNodeAt()

    public void addNodeAt(int idx, int data) {
        if (idx < 0 || idx > size) {
            System.out.println("Cannot add");
            return;
        }
        // if you have to add at 0th index
        if (idx == 0) {
            addFirst(data);
            return;
        }

        // if you have to add at Last index
        if (idx == this.size) {
            addLast(data);
            return;
        }

        // taking previous node
        Node prevNode = getNodeAt(idx - 1);
        Node nextNode = prevNode.next;

        // making new node
        Node nn = new Node(data);

        // breaking connection with rest of Linked list
        prevNode.next = null;
        // connecting newNode address to previous node
        prevNode.next = nn;
        // connecting newnode to nextNode (means rest of LL)
        nn.next = nextNode;

        this.size++;

    }

    // topic:removeNodeAt()

    public void removeNodeAt(int idx) {

        if (idx < 0 || idx >= size) {
            System.out.println("Cannot remove");
        }
        // if you have to remove first node
        if (idx == 0) {
            removeFirst();
        }
        // if you have to remove last node
        if (idx == this.size - 1) {
            removeLast();
        }

        // generic case (in middle )
        Node prevNode = getNodeAt(idx - 1);
        Node tobeRemovedNode = prevNode.next;
        Node nextNode = tobeRemovedNode.next;

        prevNode.next = null; // breaking the connection
        prevNode.next = nextNode;
        this.size--;

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
        // ll.removeFirst();
        // ll.display();
        // System.out.println();

        // note:checking getNodeAt
        // System.out.println(ll.getNodeAt(1));

        // note:adding node at a particular index
        // ll.addNodeAt(6, 89);
        // ll.display();

        ll.removeNodeAt(2);
        ll.display();

        // System.out.println(ll.head.data);
        // System.out.println(ll.head.next.data);
        // System.out.println(ll.head.next.next.data);
        // System.out.println(ll.head.next.next.next.data);
    }
}