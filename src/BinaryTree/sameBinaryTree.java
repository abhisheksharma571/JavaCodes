package BinaryTree;

public class sameBinaryTree {
    public static class Node{
        int val;    //0
        Node left;    //null
        Node right;  //null

        public Node(int val) {
            this.val = val;
        }
    }
    public static boolean isSameTree(Node p, Node q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root1.left = a;
        root1.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;

        Node root2 = new Node(1);
        Node p = new Node(2);
        Node q = new Node(3);
        root2.left = p;
        root2.right = q;
        Node r = new Node(4);
        Node s = new Node(5);
        p.left = r;
        p.right = s;
        Node t = new Node(6);
        q.right = e;

        System.out.println("Is same tree? "+isSameTree(root1,root2));
    }
}
