package BinarySearchTree;

public class insertIntoBST {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
    public static TreeNode insertInBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(root.val > val){ // go left
            root.left = insertInBST(root.left, val);
        } else {// root.val< val:- go right
            root.right = insertInBST(root.right, val);
        }
        return root;
    }
    public static void display(TreeNode root){     //pre order traversal
        if(root == null) return;
        System.out.print(root.val+" -> ");
        if(root.left!=null) System.out.print(root.left.val+" ");
        else System.out.print("null ");
        if(root.right!=null) System.out.print(root.right.val);
        else System.out.print("null ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int target = 8;
        TreeNode result = insertInBST(root, target);
        display(result);

    }
}
