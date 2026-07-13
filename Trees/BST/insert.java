package Trees.BST;

class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class insert {
      static Node insert(Node root, int key) {

        // If the tree is empty, return a new node
        if (root == null)
            return new Node(key);

        // Otherwise, recur down the tree
        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        // Return the (unchanged) node pointer
        return root;
    }

    public static void main(String[] args) {
        Node root = null;

        // Create BST
        //       22
        //      /  \
        //     12   30
        //     / \   
        //    8  20
        //       / \
        //      15  30

        root = insert(root, 22);
        root = insert(root, 12);
        root = insert(root, 30);
        root = insert(root, 8);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 15);

        // print the level order 
        // traversal of the BST
        levelOrder(root);
    }    

}
