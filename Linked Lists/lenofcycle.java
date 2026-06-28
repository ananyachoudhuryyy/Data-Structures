import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class lenofcycle {

    static int cycle(Node head){
        HashSet<Node> visited = new HashSet<>();
        Node current = head;
        int count=0;

        while(current!=null){
            if(visited.contains(current)) {
                Node start= current;

                do {
                    count ++;
                    current=current.next;
                }
                while(current!=start);
                return count;
            }
            visited.add(current);
            current=current.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        Node head= new Node(20);

        head.next = new Node(35);
        head.next.next= new Node(42);
        head.next.next= head.next;

        System.out.println(cycle(head));
    }
}
