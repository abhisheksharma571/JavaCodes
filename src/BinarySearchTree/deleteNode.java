package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class deleteNode {
    public static class Node{
        int val;    //0
        Node left;    //null
        Node right;  //null

        public Node(int val) {
            this.val = val;
        }
    }
    public static Node constructbfs(String[] arr){     //iterative
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(x);
        q.add(root);
        int i = 1;
        while (i<n-1){
            Node temp  = q.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if(arr[i].equals("")) left = null;
            else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if(arr[i+1].equals("")) right = null;
            else {
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }
    public static void preOrder(Node root){
        //preorder is root left right
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    private static void delete(Node root, int target) {
        if(root == null) return;
        if(root.val > target){  //go left
            if(root.left == null) return;
            if(root.left.val == target){
                Node l = root.left;
                if(l.left == null && l.right == null) root.left = null; //0 children
                else if(l.left == null || l.right == null){ //1 child
                    if(l.left != null) root.left = l.left;
                    else root.left = l.right;
                }
                else{ //2 children
                    Node curr = l;
                    Node pred = curr.left;
                    while(pred.right != null) pred = pred.right;
                    delete(root, pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.left = pred;
                }
            }
            else delete(root.left, target);
        }
        else {  //go right
            if(root.right == null) return;
            if(root.right.val == target){
                Node r = root.right;
                if(r.left == null && r.right == null) root.right = null; //0 children
                else if(r.left == null || r.right == null){ //1 child
                    if(r.left != null) root.right = r.left;
                    else root.right = r.right;
                }
                else{ //2 children
                    Node curr = r;
                    Node pred = curr.left;
                    while(pred.right != null) pred = pred.right;
                    delete(root, pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.right = pred;
                }
            }
            else delete(root.right, target);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"50", "20", "60", "17", "34", "55", "89", "10", "", "28", "", "", "", "70", "", "", "14"};
        Node root = constructbfs(arr);

        System.out.println("Preorder ");
        preOrder(root);
        System.out.println();

        Node temp = new Node(Integer.MAX_VALUE);
        temp.left = root;
        delete(temp, 60);
        preOrder(temp.left);
    }

}
