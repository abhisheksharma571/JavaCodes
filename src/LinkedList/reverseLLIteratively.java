package LinkedList;
//To reverse a linked list iteratively without using extra space, we can use the following algorithm:
//
//        Initialize two pointers, current and previous. Set current to the head of the linked list and previous to null.
//        While current is not null:
//        Set the next pointer of the current node to previous.
//        Set previous to the current node.
//        Move current to the next node in the list.
//        Set the head of the linked list to previous.

public class reverseLLIteratively {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseLinkedList(Node head) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        return previous;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = reverseLinkedList(head);

        // Print the linked list.
        Node current = head;
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
