package BinaryTree;

public class diameter {
    public static class Node{
        int val;    //0
        Node left;    //null
        Node right;  //null

        public Node(int val) {
            this.val = val;
        }
    }
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static int diameterOfBinaryTree(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        int leftAns = diameterOfBinaryTree(root.left);
        int rightAns = diameterOfBinaryTree(root.right);
        int mid = height(root.left) + height(root.right);
        if(root.left!=null) mid++;
        if(root.right!=null) mid++;
        int max = Math.max(leftAns,Math.max(rightAns,mid));
        return max;
    }
    static int max1 = 0;
    public static int height1(Node root){
        if(root == null) return 0;
        int left = height1(root.left);
        int right = height1(root.right);
        max1 = Math.max(max1,left+right);
        return 1 + Math.max(left,right);
    }
    public static int diameterOfBinaryTree2(Node root){
        height1(root);
        return max1;
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

        System.out.println("Diameter of Binary Tree: "+diameterOfBinaryTree(root));
        System.out.println("Diameter of Binary Tree: "+diameterOfBinaryTree2(root));
    }
}

