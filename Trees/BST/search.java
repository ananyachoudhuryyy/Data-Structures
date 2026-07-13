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

public class search {
     static boolean search(Node root, int key) {
        boolean present = false;
        
       // iterative traversal
        while( root != null ) {
            if( root.data == key ) {
                present = true;
                break;
            }
            
            else if( key > root.data )
                root = root.right;
            
            else root = root.left;
        }
        return present;
    }

    public static void main(String[] args) {
        
        // Creating BST
        //    6
        //   / \
        //  2   8
        //     / \
        //    7   9
        
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.right.left = new Node(7);
        root.right.right = new Node(9);

        int key = 7;
        // Searching for key in the BST
        System.out.println(search(root, key));
    }
}
