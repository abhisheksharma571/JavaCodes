package LinkedList;

//To check whether a linked list is a palindrome without using extra space in Java, we can use the following algorithm:
//
//        Initialize two pointers, slow and fast. Set slow to the head of the linked list and fast to the head.next.
//        While fast is not null and fast.next is not null:
//        Move slow to the next node in the list.
//        Move fast two nodes ahead in the list.
//        Reverse the second half of the linked list starting at the slow node.
//        Compare the two halves of the linked list starting at the head and the reversed head.
//        If all nodes match, then the linked list is a palindrome, otherwise it is not.

public class palindromeChecker {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list starting at the slow node.
        Node reversedHead = reverseLinkedList(slow.next);

        // Compare the two halves of the linked list starting at the head and the reversed head.
        slow.next = reversedHead;
        Node current1 = head;
        Node current2 = slow.next;
        while (current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        // If we reach the end of both halves of the linked list, then the linked list is a palindrome.
        return true;
    }

    private static Node reverseLinkedList(Node head) {
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
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        boolean isPalindrome = isPalindrome(head);

        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}

