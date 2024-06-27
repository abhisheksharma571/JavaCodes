package BinarySearchTree;

public class lowestCommonAncestor {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
    public static TreeNode findLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;
        int pVal = p.val;
        int qVal = q.val;

        if(pVal > parentVal && qVal > parentVal){
            // traverse towards the right subtree
            return findLowestCommonAncestor(root.right, p, q);
        }

        else if(pVal < parentVal && qVal < parentVal){
            // travese towards the left subtree
            return findLowestCommonAncestor(root.left, p, q);
        }

        else{
            return root;
        }
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        TreeNode result = findLowestCommonAncestor(root, p, q);
        System.out.println(result.val);

    }
}
