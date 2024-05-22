package BinaryTree;
//A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them.
// A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
//The path sum of a path is the sum of the node's values in the path.
public class maxPathSum {
    public static class Node{
        int val;    //0
        Node left;    //null
        Node right;  //null

        public Node(int val) {
            this.val = val;
        }
    }
    static int max = Integer.MIN_VALUE;
    public static int helper(Node root){
        if(root == null) return 0;
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        max = Math.max(max, root.val + left + right);
        return root.val + Math.max(left, right);

    }
    public static int maximumPathSum(Node root) {
        helper(root);
        return max;
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

        System.out.println("Max Path Sum: "+maximumPathSum(root));
    }
}
