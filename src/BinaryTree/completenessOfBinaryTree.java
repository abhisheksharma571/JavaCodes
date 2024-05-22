package BinaryTree;
//Given the root of a binary tree, check if it is a complete binary tree or not. A complete binary
//tree is a binary tree in which every level, except possibly the last, is filled, and all nodes are as far left as possible.
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class completenessOfBinaryTree {
    public static boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean end = false; // Flag to mark the encounter of the first null node

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current == null) {
                end = true;
            } else {
                if (end) {
                    // If we have encountered a null node before and now we encounter a non-null node
                    return false;
                }
                queue.add(current.left);
                queue.add(current.right);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println(isCompleteTree(root)); // Output: true
    }
}

