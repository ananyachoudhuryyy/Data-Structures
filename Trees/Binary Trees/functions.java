import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class functions {

       static void inorder(Node root, ArrayList<Integer> res){
          
             if(root== null) return;

             inorder(root.left, res);
             res.add(root.data);
             inorder(root.right, res);  
             
       }
     public static void main(String[] args) {
        Node root = new Node(10);
        Node firstleft = new Node(20);
        root.left= firstleft;
        Node firstright= new Node(30);
        root.right= firstright;


     }

}