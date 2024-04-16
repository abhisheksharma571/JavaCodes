package LinkedList;
//remove duplicates from sorted linkedlist

//To remove duplicates from a sorted linked list, we can use the following algorithm:
//
//        Initialize a current pointer to the head of the linked list.
//        Initialize a previous pointer to null.
//        While the current pointer is not null:
//             If the current node and the previous node have the same value, then remove the current node.
//             Otherwise, update the previous pointer to the current node and move the current pointer to the next node.
//        Return the head of the linked list.
public class linkedListDuplicateRemover {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeDuplicates(Node head) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (previous != null && current.data == previous.data) {
                // Remove the current node.
                previous.next = current.next;
                current = current.next;
            } else {
                // Update the previous pointer and move the current pointer to the next node.
                previous = current;
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        head = removeDuplicates(head);

        // Print the linked list.
        Node current = head;
        while (current != null) {
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

