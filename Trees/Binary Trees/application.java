import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class application{
    static Scanner sc = new Scanner(System.in);

    static Node BuildTree(){
        int data = sc.nextInt();
        if(data == -1) return null;

        Node root = new Node(data);
        root.left= BuildTree();
        root.right= BuildTree();

        return root;
    }
    static void inorder(Node root){
        if(root== null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    static void preorder(Node root){
        if(root== null) return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    static void postorder(Node root){
        if(root== null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }

    static void levelorder(Node root){
        if(root== null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp==null){
                System.out.println();
                if(q.isEmpty()) break;
                else{
                    q.add(null);
                }
            }else{
                System.out.print(temp.data+" ");
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
        }
    }
    static void BFS(Node root){
        
    }
}