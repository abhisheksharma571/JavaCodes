package BinaryTree;
//Given the root of a binary tree, return the spiral level order traversal of its nodes' values.
// The solution should consider the binary tree nodes level by level in spiral order, i.e., all nodes present at level 1 should be processed
// first from left to right, followed by nodes of level 2 from right to left, followed by nodes of level 3 from left to right and so on...
// In other words, odd levels should be processed from left to right, and even levels should be processed from right to left.
import java.util.*;

public class zigzagLevelOrder {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static List<List<Integer>> zigzagOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while(!q.isEmpty()) {
            int count = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                if (leftToRight) {
                    TreeNode x = q.pollFirst();
                    level.add(x.val);
                    if (x.left != null) {
                        q.addLast(x.left);
                    }
                    if (x.right != null) {
                        q.addLast(x.right);
                    }
                } else {
                    TreeNode x = q.pollLast();
                    level.add(x.val);
                    if (x.right != null) {
                        q.addFirst(x.right);
                    }
                    if (x.left != null) {
                        q.addFirst(x.left);
                    }
                }
            }
            result.add(level);
            leftToRight = !leftToRight;



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

        List<List<Integer>> result = zigzagOrderTraversal(root);
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
