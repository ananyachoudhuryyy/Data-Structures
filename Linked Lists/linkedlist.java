class Node {
    int data;
    Node next;

Node(int data) {
    this.data=data;
    this.next=null;
      }
  }

  class linkedlist {
    Node head;

    public static void main(String[] args) {
         linkedlist list = new linkedlist();
         list.head=new Node(10);
         Node second = new Node(20);
         list.head.next=second;
         Node third= new Node(30);
         list.head.next.next=third;

         Node temp= list.head;

         while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
         }
    }
  }