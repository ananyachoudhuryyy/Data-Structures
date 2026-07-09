// Given the root of a binary tree, find its diameter. 
// The diameter of a tree is defined
//  as the number of edges in the longest path between any two nodes.

class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class diameter {
     static int maxDiameter = 0;

    // Recursive function to calculate height and update diameter
    static int diameterRecur(Node root) {
        if (root == null)
            return 0;

        // Find the height of left and right subtree
        int lHeight = diameterRecur(root.left);
        int rHeight = diameterRecur(root.right);

        // Update the global max diameter if this node gives a longer path
        if (lHeight + rHeight > maxDiameter)
            maxDiameter = lHeight + rHeight;

        // Return height of current subtree
        return 1 + Math.max(lHeight, rHeight);
    }

    // Function to get diameter of a binary tree
    static int Diameter(Node root) {
        maxDiameter = 0; 
        diameterRecur(root);
        return maxDiameter;
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);
        root.right.right = new Node(4);
      	root.right.left.left = new Node(5);
      	root.right.right.right = new Node(6);

        System.out.println(Diameter(root));
    }
}
