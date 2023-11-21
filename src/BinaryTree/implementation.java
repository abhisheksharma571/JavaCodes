package BinaryTree;

public class implementation {
    static int size = 0;
    public static class Node{
        int val;    //0
        Node left;    //null
        Node right;  //null

        public Node(int val) {
            this.val = val;
        }
    }
    public static void display(Node root){     //pre order traversal
        if(root == null) return;
        size++;
        System.out.print(root.val+" -> ");
        if(root.left!=null) System.out.print(root.left.val+" ");
        else System.out.print("null ");
        if(root.right!=null) System.out.print(root.right.val);
        else System.out.print("null ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int product(Node root){
        if(root==null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    public static int maxValue(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maxValue(root.left),maxValue(root.right)));
    }
    public static int minValue(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(minValue(root.left),minValue(root.right)));
    }
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
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

        display(root);
        System.out.println("Size of tree is "+size);
        System.out.println("Size of tree by recursion is "+size(root));
        System.out.println("Sum of tree is "+sum(root));
        System.out.println("Product of tree is "+product(root));
        System.out.println("Max value of tree is "+maxValue(root));
        System.out.println("Min value of tree is "+minValue(root));
        System.out.println("Height of tree is "+height(root));
    }
}
