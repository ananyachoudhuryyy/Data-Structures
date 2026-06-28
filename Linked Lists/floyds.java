// This following program is an enhancement of detection of loop using fast and slow pointers

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class floyds {
    static boolean floydAlgo(Node head){
        Node slow = head, fast= head;
        
        while(slow!=null && fast!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}
