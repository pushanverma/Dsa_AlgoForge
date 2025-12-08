

//note:---------------  NODE CLASS ------------
 class Node {

    int data;
    Node next;

    // empty Constructor
    public Node() {

    }

    // constructor(Node)
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//note:------------ LINKED LISTS CLASS ------------

class LinkedList {
    //variables 

    Node head;
    Node tail;
    int size;

    // constructor( Linked_list)
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // function - addLast

    public void addLast(int data) {
        //Firstly creating new Node which contains data 
        
        Node newNode = new Node(data);

        // note : always in LL , look at three cases

        if (head == null) {
            // 1. when there are no Nodes(Empty)
            head = newNode;
            tail=newNode;

        } else if (head == tail) {
            // 2. Only one Node is present
            head.next=newNode;
            tail=newNode;
        } else {
            // 3. Rest all cases
             head.next=newNode;
             tail=newNode;
        }


    }

    public String toString(){
        String list = "";

        Node temp = head;
        while(temp != null){
            list += temp.data + ", ";
            temp = temp.next;
        }

        return list;
    }

}

public class Main {

    LinkedList ll = new LinkedList();

    ll.addLast(10);
    ll.addLast(20);
    ll.addLast(30);

    System.out.println(ll);
    

}
