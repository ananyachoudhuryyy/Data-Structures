

class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class sort {
    static void sortList(Node head){
        Node temp = head;

        int[] count = {0,0,0};

        while(temp!=null){
            if (temp.data==0) count[0]++;
            if(temp.data==1) count[1]++;
            if(temp.data==2) count[2]++;
            temp = temp.next;
        }
        temp=head;

        while(temp!=null){
            if(count[0]>0){
                temp.data=0;
                count[0]--;
            }

            else if(count[1]>0){
                temp.data=1;
                count[1]--;
            }
            else {
                temp.data=2;
                count[2]--;
            }

        temp=temp.next;

        }

        temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->" );
            temp=temp.next;
        }
        
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next=new Node(2);
        head.next.next= new Node(0);
        head.next.next.next=new Node(0);
        head.next.next.next.next=new Node(2);

        Node temp = head;

        System.out.println("Initial Linked List");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }

        System.out.println("\nAfter Sorting.");
        sortList(head);
    }
}
