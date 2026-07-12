// Given a binary tree, we need to find its maximum width.
//  The width of a binary tree is defined
//  as the maximum number of nodes present at any level of the tree.

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class maxWidth {
     static void preorder(Node root, int level, List<Integer> count) {
        if (root == null) return;

        // If this is the first node of this level, extend the list
        if (level == count.size()) {
            count.add(0);
        }

        // Increase count of nodes at this level
        count.set(level, count.get(level) + 1);

        // Recurse for left and right subtrees
        preorder(root.left, level + 1, count);
        preorder(root.right, level + 1, count);
    }

    // Function to get maximum width
    static int getMaxWidth(Node root) {
        List<Integer> count = new ArrayList<>();
        preorder(root, 0, count);

        int maxWidth = 0;
        for (int c : count) {
            maxWidth = Math.max(maxWidth, c);
        }
        return maxWidth;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(8);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(7);

        System.out.println(getMaxWidth(root));
    }
}
