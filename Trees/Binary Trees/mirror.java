class Node {
    int data;
    Node left, right;   

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class mirror {
    static boolean areMirror(Node r1, Node r2){
        if(r1==null && r2==null)
            return true;

        if(r1==null || r2==null)
            return false;
        return (r1.data==r2.data &&
             areMirror(r1.left,r2.right) &&
              areMirror(r1.right,r2.left));

    }

    public static void main(String[] args) {
        Node root1= new Node(1);
        root1.left= new Node(2);
        root1.right= new Node(3);    

        Node root2= new Node(1);
        root2.left= new Node(3);
        root2.right= new Node(2);

        if (areMirror(root1, root2))
            System.out.println("Both trees are mirror of each other");
        else
            System.out.println("Trees are not mirror of each other");
    }
}
