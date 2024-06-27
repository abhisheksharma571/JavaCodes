package BinarySearchTree;

import java.util.ArrayList;

public class validateBST {
    static class TreeNode {
                int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static void inOrderTraversal(TreeNode node, ArrayList<Integer> res){
        // left subtree
        if(node.left != null){
            inOrderTraversal(node.left, res);
        }
        // store the result
        res.add(node.val);
        // right subtree
        if(node.right != null){
            inOrderTraversal(node.right, res);
        }
    }
    public static boolean isValidBST(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null){
            return true;
        }
        inOrderTraversal(root, res);
        int n = res.size();

        // whether the inorder traversal of a tree stored in the list is sorted or not
        for(int i=0; i<n-1; i++){
            if(res.get(i) >= res.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        boolean result = isValidBST(root);
        System.out.println(result);

    }
}
