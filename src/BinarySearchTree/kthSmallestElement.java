package BinarySearchTree;

import java.util.ArrayList;

public class kthSmallestElement {
    static class TreeNode {
                int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
        // function definition
        public static ArrayList<Integer> inOrderTraversal(TreeNode root, ArrayList<Integer> result){
            if(root == null){
                return result;
            }

            // 1. traverse towards the left side of the node
            inOrderTraversal(root.left, result);
            // 2. store the node value in the result array
            result.add(root.val);
            // 3. traverse towards the right side of the node
            inOrderTraversal(root.right, result);
            return result;
        }

        // Driver code
        public static int kthSmallest(TreeNode root, int k) {
            // function calling
            ArrayList<Integer> result = inOrderTraversal(root, new ArrayList<>());
            // return the kth smallest element
            return result.get(k-1);
        }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int k = 2;
        int result = kthSmallest(root, k);
        System.out.println("The kth smallest element is: " + result);

    }
}
