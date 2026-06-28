import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class detectloop {
    static boolean findLoop(Node head){
        HashSet <Node> set = new HashSet<>(); // use a hash map to contain data

        Node temp = head;

        while(temp!=null){
             if(set.contains(temp)) return true;  // if hash map contains the same node, loop

             set.add(temp); // every traversal add the node to hashmap
             temp=temp.next; // forward the node pointer
        }
return false;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = head.next;

        System.out.println(findLoop(head));
    }
}
