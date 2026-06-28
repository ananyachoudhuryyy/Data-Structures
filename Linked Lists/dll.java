
class Node {
    int data;
    Node prev, next;

    Node(int data){
        this.data=data;
        prev=null;
        next=null;
    }
}

public class dll {
    static void display(Node head){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+ " <->");
            temp=temp.next;
        }
    }

    static Node insertAtFirst(Node head, int data){
        Node newnode = new Node(data);

        newnode.next=head;
        if(head !=null){
            head.prev=newnode;
        }
        head=newnode;
        
        return head;
    }

    static Node insertAtEnd(Node head, int data){
        Node newnode= new Node(data);

        Node temp= head;
        while(temp!=null) temp= temp.next;

        temp.next=newnode;
        newnode.prev=temp;

        return head;
    }
    public static void main(String[] args) {
        Node head= new Node(10);
        Node second = new Node(20);
        head.next=second;
        second.prev=head;

        Node third = new Node(30);
        second.next=third;
        third.prev=second;

        System.out.println("Original DLL: \n"); 
        display(head);

        insertAtFirst(head, -12);
        display(head);

        insertAtEnd(head, 420);
        display(head);
    }
}
