class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}



public class reverse {
    Node head;
    static Node reverseList(Node head){
    Node curr = head;
    Node prev= null;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;

        prev=curr;
        curr=next;
    }
    return prev;
}
    public static void main(String[] args) {
         reverse list = new reverse();
         list.head= new Node(10);
         Node second = new Node(20);
         list.head.next=second;
         Node third= new Node(30);
         list.head.next.next=third;

        list.head= reverseList(list.head);

        Node temp= list.head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }

    }
}
