package BinaryTree;

public class lowestCommonAncestor {
    public static class Node{
        int val;    //0
        Node left;    //null
        Node right;  //null

        public Node(int val) {
            this.val = val;
        }
    }
    public static boolean contains(Node root,Node node){
        if(root==null) return false;
        if(root==node) return true;
        return contains(root.left,node) || contains(root.right,node);
    }
    public static Node lowestCommonAncestorSolution(Node root, Node p, Node q){
        if(p==root || q==root) return root;
        if(p==q) return p;
        boolean leftp = contains(root.left,p);
        boolean rightq = contains(root.right,q);
        if((leftp && rightq) || (!leftp && !rightq)) return root;
        if(leftp && !rightq) return lowestCommonAncestorSolution(root.left,p,q);
        if(!leftp && rightq) return lowestCommonAncestorSolution(root.right,p,q);
        return root;
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

        System.out.println("Lowest Common Ancestor: "+lowestCommonAncestorSolution(root,c,e).val);
    }
}
