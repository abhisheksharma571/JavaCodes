package BinarySearchTree;

public class searchInBST {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static TreeNode searchBST(TreeNode root, int target) {
        if (root == null || root.val == target) {
            return root;
        }
        if (target < root.val) {
            return searchBST(root.left, target);
        } else {
            return searchBST(root.right, target);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int target = 2;
        TreeNode result = searchBST(root, target);

        if (result != null) {
            System.out.println("Found: " + result.val);
        } else {
            System.out.println("Not found");
        }
    }
}
