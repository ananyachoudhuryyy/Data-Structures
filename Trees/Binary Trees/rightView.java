
import java.util.ArrayList;

class Node{
    int data;
    Node right, left;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class rightView {
     static void RecRightView(Node root, int level, ArrayList<Integer> res){
        if(root==null) return;

        if(level==res.size()){
            res.add(root.data);
        }

        RecRightView(root.right, level+1, res);
        RecRightView(root.left, level+1, res);
}
     
    static ArrayList<Integer> rightView(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        RecRightView(root, 0, res);
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.left.right = new Node(5);

        ArrayList<Integer> view = rightView(root);
        for (int val : view) 
            System.out.print(val + " ");
    }
    
}