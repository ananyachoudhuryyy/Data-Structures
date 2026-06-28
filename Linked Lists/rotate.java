class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class rotate {
    
    static Node rotatelist(Node head, int k){
        if(k ==0 || head==null){
            return head;
        }
        for(int i=0;i<k;i++){
            Node curr = head;
            while(curr.next!=null){
                  curr=curr.next;
            }
            curr.next=head;
            curr=curr.next;
            head= head.next;
            curr.next=null;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next= new Node(30);
        head.next.next.next = new Node(40);

        rotatelist(head, 2);

        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}
