package LinkedList;
///Given a linked list , split it into two lists such that one contains odd values, while the other contains even values.

//To split a linked list into two lists such that one contains odd values, while the other contains even values, we can follow these steps:
//
//        Create two empty linked lists, one for odd values and one for even values.
//        Traverse the original linked list.
//        For each node in the original linked list, check if its value is odd or even.
//        If the value is odd, add the node to the odd linked list.
//        If the value is even, add the node to the even linked list.
//        Once you have traversed the original linked list, the two new linked lists will contain all of the odd and even values from the original linked list, respectively
public class linkedListSplitter {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node[] splitLinkedList(Node head) {
        Node oddHead = null;
        Node oddTail = null;
        Node evenHead = null;
        Node evenTail = null;

        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            if (current.data % 2 == 1) {
                // Odd value.
                if (oddHead == null) {
                    oddHead = current;
                } else {
                    oddTail.next = current;
                }
                oddTail = current;
            } else {
                // Even value.
                if (evenHead == null) {
                    evenHead = current;
                } else {
                    evenTail.next = current;
                }
                evenTail = current;
            }
            current = nextNode;
        }

        // Set the even tail to null.
        evenTail.next = null;

        // If the odd list is empty, set the odd head to null.
        if (oddHead == null) {
            oddHead = null;
        }

        // If the even list is empty, set the even head to null.
        if (evenHead == null) {
            evenHead = null;
        }

        return new Node[] {oddHead, evenHead};
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node[] linkedLists = splitLinkedList(head);

        // Print the odd linked list.
        System.out.println("Odd linked list:");
        printLinkedList(linkedLists[0]);

        // Print the even linked list.
        System.out.println("Even linked list:");
        printLinkedList(linkedLists[1]);
    }
}

