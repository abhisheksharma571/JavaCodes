package LinkedList;
//find the maximum twin sum of a linked list of even length.
//twin of any node at ith index is the node at (n-i-1)th index. Twin sum is the sum of values of a node and its twin.
public class maximumTwinSum {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static int findMaximumTwinSum(Node head) {
        if (head == null || head.next == null) {
            return 0;
        }

        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node reversedCurrent = reverseLinkedList(slow.next);
        int maximumTwinSum = Integer.MIN_VALUE;
        slow.next = reversedCurrent;
        Node current1 = head;
        Node current2 = slow.next;

        while (current2 != null) {
            int twinSum = current1.data + current2.data;
            if (twinSum > maximumTwinSum) {
                maximumTwinSum = twinSum;
            }


            current1 = current1.next;
            current2 = current2.next;
        }

        return maximumTwinSum;
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
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);

        int maximumTwinSum = findMaximumTwinSum(head);

        System.out.println("The maximum twin sum of the linked list is: " + maximumTwinSum);

    }
}
