package BinaryTree;
import java.util.*;

public class preInPost {
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
    public static void bfs(Node root){     //iterative
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
    //Depth First Search
    public static List<Integer> dfs(Node root){
        List<Integer> arr = new LinkedList<>();
        if(root==null) return arr;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node temp = st.peek();
            if(temp.left!=null){
                st.push(temp.left);
                temp.left = null;
            } else {
                st.pop();
                arr.add(temp.val);
                if(temp.right!=null) st.push(temp.right);
            }
        }
        return arr;
    }
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static void nthLevel(Node root, int n){
        if(root==null) return;
        if(n==1){
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
        System.out.print("Preorder ");
        preOrder(root);
        System.out.println();
        System.out.print("Inorder ");
        inOrder(root);
        System.out.println();
        System.out.print("Postorder ");
        postOrder(root);
        System.out.println();

        System.out.print("Nth level ");
        nthLevel(root,3);
        System.out.println();

        //Level Order Traversal
        System.out.println("Level Order Traversal ");
        int level = height(root) + 1;
        for(int i=1;i<=level;i++){
            nthLevel(root,i);
            System.out.println();
        }
        System.out.print("Breadth First Search ");
        bfs(root);
        System.out.println();

        System.out.print("Depth First Search ");
        System.out.println(dfs(root));
    }
}
