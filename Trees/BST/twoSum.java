package Trees.BST;
// Given the root of a Binary Search Tree (BST) of size n and an integer 
// target, determine whether there exists a pair of distinct nodes in the 
// BST such that the sum of their values is equal to the given target.
//  Return true if such a pair exists; otherwise, return false.

import java.util.HashSet;

class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class twoSum {
 static boolean dfs(Node root, HashSet<Integer> set, int target) {
        if (root == null)
            return false;

        // Check if the complement (target - current node's value)
        // exists in the set
        if (set.contains(target - root.data))
            return true;

        // Insert the current node's value into the set
        set.add(root.data);

        // Continue the search in the left and right subtrees
        return dfs(root.left, set, target) || dfs(root.right, set, target);
    }

    // Main function to check if two elements
    // in the BST target to target
    static boolean findTarget(Node root, int target) {
        HashSet<Integer> set = new HashSet<>();
        return dfs(root, set, target);
    }
    
    public static void main(String[] args) {
         Node root = new Node(7);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(9);

        int target = 12;

        if (findTarget(root, target))
            System.out.println("true");
        else
            System.out.println("false");
    
    }
}
