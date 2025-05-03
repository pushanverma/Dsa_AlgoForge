
import java.util.*;

public class Questions {

    // note:GFG template

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // note: Leetcode template

    // topic:getKthFromLast()
    int getKthFromLast(Node head, int k) {
        // Your code here

        // two pointers
        Node slow = head;
        Node fast = head;

        // shifting fast to k position far from slow
        while (k > 0) {
            if (fast == null) {
                // if while shifting fast to k position , fast goes null means linked list did
                // not have much nodes
                return -1;
            }

            fast = fast.next;
            k--;
        }

        //Now slow and fast are maintaing a gap of k b/w them 

        while(fast !=null){

            slow =slow.next;
            fast =fast.next;

            return slow.data;
            
        }

    }

    
    public static void main(String[] args) {

        getKthFromLast(head, k);
        
        

    }

}