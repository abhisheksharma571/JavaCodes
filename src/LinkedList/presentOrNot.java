package LinkedList;
//Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
public class presentOrNot {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static boolean search(Node head, int x) {
        Node current = head;

        while (current != null) {
            if (current.data == x) {
                return true; //found
            }
            current = current.next;
        }
        return false; //not found
    }
    public static void main(String[] args) {
        Node head = new Node(14);
        head.next = new Node(21);
        head.next.next = new Node(11);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);

        int x = 14;

        if (search(head, x)) {
            System.out.println("Output: Yes");
        } else {
            System.out.println("Output: No");
        }
    }
}
