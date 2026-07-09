// Given a binary tree containing n nodes. 
// The task is to find the sum of all nodes on the longest path from root to 
// leaf node. If two or more paths compete for the longest path, 
// then the path having the maximum sum of nodes is considered

class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class LongestBranchSum {

    static int maxSum=0;
    static int maxHeight=0;

    static void longestPathSum(Node root, int sum, int height){
        if(root==null){
            if(height>maxHeight){
                maxHeight=height;
                maxSum=sum;
            }
            else if(height==maxHeight){
                maxSum=Math.max(maxSum, sum);
            }
            return;
        }

        sum+=root.data;
        longestPathSum(root.left, sum, height+1);
        longestPathSum(root.right, sum, height+1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node firstleft = new Node(20);
        root.left= firstleft;
        Node firstright= new Node(30);
        root.right= firstright;

        longestPathSum(root, 0, 0);
        System.out.println("The maximum sum of the longest path is: " + maxSum);
    }
}
