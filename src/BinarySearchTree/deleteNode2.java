package BinarySearchTree;
import java.util.LinkedList;
import java.util.Queue;

public class deleteNode2 {
    public static class Node{
        int val;    //0
        Node left;    //null
        Node right;  //null

        public Node(int val) {
            this.val = val;
        }
    }
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
    public static void preOrder(Node root){
        //preorder is root left right
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    // method definition of successor
    public static int successor(Node root){
        // 1. right side
        root = root.right;
        // 2. minimum value
        while(root.left != null){
            root = root.left;
        }

        return root.val;
    }

    // method definition of predecessor
    public static int predecessor(Node root){
        // 1. left side
        root = root.left;
        // 2. maximum value
        while(root.right != null){
            root = root.right;
        }
        return root.val;
    }

    public static Node delete2(Node root, int key) {
        // 1. Search the key in the given tree
        // base case condition
        if(root == null){
            return null;
        }

        // traverse towards the right subtree - recursion
        if(key > root.val){
            root.right = delete2(root.right, key);
        }

        // traverse towards the left subtree - recursion
        else if(key < root.val){
            root.left = delete2(root.left, key);
        }

        else{
            // case 1: node to be deleted is the leaf node
            if(root.left == null && root.right == null){
                root = null;
            }

            // case 2: non-leaf node
            else if(root.right != null){
                // function calling of successor
                // right side - minimum value
                root.val = successor(root);
                root.right = delete2(root.right, root.val);
            }

            else{
                // function calling of predecssor
                // left side - maximum value
                root.val = predecessor(root);
                root.left = delete2(root.left, root.val);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        String[] arr = {"50", "20", "60", "17", "34", "55", "89", "10", "", "28", "", "", "", "70", "", "", "14"};
        Node root = constructbfs(arr);

        System.out.println("Preorder ");
        preOrder(root);
        System.out.println();
        delete2(root, 60);
        preOrder(root);
    }
}
