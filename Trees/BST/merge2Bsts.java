package Trees.BST;

import java.util.ArrayList;

// Node structure
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}

class merge2Bsts {
    
    // Function to perform inorder traversal of a BST
    // Stores elements in sorted order in the given list
    static void inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
    
    // Function to merge two sorted lists into one sorted list
    static ArrayList<Integer> mergeArrays(ArrayList<Integer> arr1, 
                                          ArrayList<Integer> arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        
        // Traverse both lists and pick the smaller element
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                result.add(arr1.get(i++));
            } 
            else {
                result.add(arr2.get(j++));
            }
        }
        
        while (i < arr1.size()) result.add(arr1.get(i++));
        
        while (j < arr2.size()) result.add(arr2.get(j++));
        
        return result;
    }
    
    // Function to merge elements of two BSTs into a single sorted list
    static ArrayList<Integer> merge(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        // Get inorder traversal of both BSTs
        inorder(root1, arr1);
        inorder(root2, arr2);
        
        return mergeArrays(arr1, arr2);
    }

    public static void main(String[] args) {
        
        // Create binary tree 1
        //           3
        //         /   \
        //       1      5
        Node root1 = new Node(3);
        root1.left = new Node(1);
        root1.right = new Node(5);
        
        // Create binary tree 2
        //           4
        //         /   \
        //       2      6
        Node root2 = new Node(4);
        root2.left = new Node(2);
        root2.right = new Node(6);
        
        ArrayList<Integer> res = merge(root1, root2);
        for (int val : res) System.out.print(val + " ");
        System.out.println();
    }
}