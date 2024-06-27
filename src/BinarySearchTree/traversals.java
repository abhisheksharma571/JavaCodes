package BinarySearchTree;
import java.util.*;

public class traversals {
    public static class Node{
        int val;    //0
        Node left;    //null
        Node right;  //null

        public Node(int val) {
            this.val = val;
        }
    }
    public static void preOrder(Node root){
        //preorder is root left right
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        //postorder is left right root
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void inOrder(Node root){
        //inorder is left root right
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    //Breadth First Search
    public static Node constructbfs(String[] arr){     //iterative
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(x);
        q.add(root);
        int i = 1;
        while (i<n-1){
            Node temp  = q.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if(arr[i].equals("")) left = null;
            else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if(arr[i+1].equals("")) right = null;
            else {
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }

    public static void main(String[] args) {
        String[] arr = {"10", "5", "15", "2", "8", "12", "17"};
        Node root = constructbfs(arr);

        System.out.print("Preorder ");
        preOrder(root);
        System.out.println();
        System.out.print("Inorder ");
        inOrder(root);
        System.out.println();
        System.out.print("Postorder ");
        postOrder(root);
    }
}
