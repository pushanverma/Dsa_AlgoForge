// A Single Node contains two data - one is Data and other one is the address of Next Node 
class Node {
    int data;
    Node next;

    // parametrized constructor
    public Node(int data) {
        this.data = data;
    }
}

public class Main {

    public static void main(String [] args){

        // 3 Nodes are made at a random place inside the Heap 
        Node n1 = new Node(10);   // 4k 
        Node n2 = new Node(20);   // 5k 
        Node n3 = new Node(30);   // 6k 

        //note: The First guy is also called the "Head" of the Linked List (In most of question , we will only be getting the Head )
        
        n1.next =n2;      // n1.next stores 5k 
        n2.next =n3;      // n2.next stores 6k 


        Node firstGuy = n1;     
        System.out.println(n1 + "...first Guy ");
        System.out.println(n1.data +"...data of First Guy ");
        System.out.println(n1.next + "...Address of Second guy");

        System.out.println("___________");
        
        Node secondGuy= n1.next; // next of n1 will store the address of n2 
        System.out.println(secondGuy+"...Second Guy");
        System.out.println(secondGuy.data+" ...data of Second guy");
        System.out.println(secondGuy.next+"...Address of Third Guy");
        
        System.out.println("___________");

        Node thirdGuy = secondGuy.next;
        System.out.println(thirdGuy+"...third Guy ");
        System.out.println(thirdGuy.data+"...data of third Guy");
        System.out.println(thirdGuy.next+"....Address of Third Guy");









      

        







    }

}
