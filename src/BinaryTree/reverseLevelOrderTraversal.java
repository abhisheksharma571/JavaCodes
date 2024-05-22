package BinaryTree;
//Given the root of a binary tree, return the reverse level order traversal of its nodes' values. The
//solution should consider the binary tree nodes level by level in bottom-up order from left to right,
//i.e., process all nodes of the last level first, followed by all nodes of the second last level, and so on.
import java.util.*;

public class reverseLevelOrderTraversal {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static List<Integer> reverseLevelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            stack.push(level);
        }

        while (!stack.isEmpty()) {
            result.addAll(stack.pop());
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> result = reverseLevelOrder(root);
        System.out.println(result);
    }
}
