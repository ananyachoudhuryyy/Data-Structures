// Given the roots r1 and r2 of two binary trees, determine whether they are identical.
// Two trees are considered identical if they have the same structure and the same node values.

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class identical {
    static boolean isIdentical(Node r1, Node r2){
        if(r1==null && r2==null)
            return true;

        if(r1==null || r2==null)
            return false;
        return (r1.data==r2.data &&
             isIdentical(r1.left,r2.left) &&
              isIdentical(r1.right,r2.right));

}

public static void main(String args[]) {
       Node root1= new Node(1);
       root1.left= new Node(2);
       root1.right= new Node(3);    

       Node root2= new Node(1);
         root2.left= new Node(2);
          root2.right= new Node(3);
        if (isIdentical(root1, root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");
    }


}