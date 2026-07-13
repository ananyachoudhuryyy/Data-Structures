// Given the root of a binary Tree, Find its vertical traversal
//  starting from the leftmost level to the rightmost level.
//  Horizontal Distance = Number of right moves − Number of left moves
//   in the path from the root to that node.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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

public class verticalTraversal {
 static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        
        // Map to store nodes and their vertical levels.
        Map<Integer, ArrayList<Integer>> lst = new HashMap<>();
        
        // Queue to store nodes and their vertical levels.
        Queue<Pair<Node, Integer>> q = new LinkedList<>();
        q.offer(new Pair<>(root, 0));

        int mn = 0, mx = 0;

        while (!q.isEmpty()) {
            Pair<Node, Integer> c = q.poll();
            mn = Math.min(mn, c.getValue());
            mx = Math.max(mx, c.getValue());

            // adding node to the corresponding vertical level.
            lst.putIfAbsent(c.getValue(), new ArrayList<>());
            lst.get(c.getValue()).add(c.getKey().data);

            // pushing left child with decreased vertical level.
            if (c.getKey().left != null)
                q.offer(new Pair<>(c.getKey().left, c.getValue() - 1));

            // pushing right child with increased vertical level.
            if (c.getKey().right != null)
                q.offer(new Pair<>(c.getKey().right, c.getValue() + 1));
        }

        // creating the result vector in vertical order.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = mn; i <= mx; i++)
            res.add(lst.get(i));

        return res;
    }

    public static void main(String[] args) {
        
        // Create binary tree
        //            1
        //          /   \
        //         2     3
        //        / \   / \
        //       4   5 6   7
        //            \  \   \
        //             8  9   10
        //            /
        //           11

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.right = new Node(8);
        root.right.left.right = new Node(9);
        root.right.right.right = new Node(10);
        root.left.right.right.left = new Node(11);

        ArrayList<ArrayList<Integer>> res = verticalOrder(root);

        System.out.print("[");
        for (int i = 0; i < res.size(); i++) {
            System.out.print("[");
            List<Integer> line = res.get(i);
            for (int j = 0; j < line.size(); j++) {
                System.out.print(line.get(j));
                if (j != line.size() - 1) System.out.print(", ");
            }
            System.out.print("]");
            if (i != res.size() - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
   
}
