// Given a binary tree, the task is to check if it is a Sum Tree. 
// A Sum Tree is a Binary Tree where the value of a node is equal to the sum of 
// the nodes present in its left subtree and right subtree. 
// An empty tree is Sum Tree and the sum of an empty tree can be 
// considered as 0. A leaf node is also considered a Sum Tree.


class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class SumTree {
    static int isSumTree(Node root){
        if (root == null)
            return 0;

        if(root.left == null && root.right == null)
            return root.data;

        int ls = isSumTree(root.left);
        if(ls == -1) return -1;

        int rs = isSumTree(root.right);
        if(rs == -1) return -1;

        if(ls+rs == root.data)
            return ls+rs+root.data;

        else
            return -1;
    }

    public static void main(String args[]) {
        Node root = new Node(26);
        root.left = new Node(10);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.right = new Node(3);

        if (isSumTree(root) != -1)
            System.out.println("The given tree is a Sum Tree");
        else
            System.out.println("The given tree is not a Sum Tree");
    }
}
