package Trees.BST;
//Given the root of a Binary Search Tree (BST) and a positive integer k,
//  find the kth smallest element in the Binary Search Tree. 
class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class kthSmallest {
     static int kthSmallest(Node root, int k) {
        int count = 0;
        
        
        Node curr = root;
        int nodes = 0;
        while (curr != null) {
            if (curr.left == null) {
                count++;
                if( count == k ) return curr.data;
                curr = curr.right;
            } 
            else {
                
                // Find the inorder predecessor of curr
                Node prev = curr.left;
                while (prev.right != null && 
                       prev.right != curr) {
                    prev = prev.right;
                }
                
                 // Make curr the right child of its inorder predecessor
                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } 
                else {
                    count++;
                    if( count == k ) return curr.data;
                    
                    // Revert the changes made in the tree structure
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }
        return -1;
    }
 public static void main(String[] args) {

        // Binary search tree
        //      20
        //    /   \
        //   8     22
        //  / \
        // 4   12
        //    /  \
        //   10   14
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        int k = 3;

        System.out.println(kthSmallest(root, k));
    }
}
