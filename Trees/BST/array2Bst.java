// Given a sorted array arr[]. Convert it into a Balanced Binary Search Tree
//  (BST). Return the root of the BST.

// A Balanced Binary Search Tree (BST) is a type of binary tree in which the 
// difference between the heights of the left and right subtrees of
//  every node is at most one.
package Trees.BST;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class array2Bst {
    static Node sortedArrayToBST(int arr[], int start, int end) {
        // Base Case
        if (start > end) {
            return null;
        }

        // Get the middle element and make it root
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        // Recursively construct the left subtree and make it left child of root
        node.left = sortedArrayToBST(arr, start, mid - 1);

        // Recursively construct the right subtree and make it right child of root
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    static void levelOrder(Node root) {

    if (root == null)
        return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {

        Node current = queue.poll();
        System.out.print(current.data + " ");

        if (current.left != null)
            queue.add(current.left);

        if (current.right != null)
            queue.add(current.right);
    }
}

    public static void main(String[] args) {
        int arr[] = {8, 12, 15, 20, 22, 30};
        int n = arr.length;

        Node root = sortedArrayToBST(arr, 0, n - 1);

        // print the level order 
        // traversal of the BST
        levelOrder(root);
    }
}