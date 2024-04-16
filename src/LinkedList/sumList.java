package LinkedList;
//Given two numbers represented by two lists, write a function that returns the sum list. The
//        sum list is a list representation of the addition of two input numbers.
//        Input: List1: 5->6->3    // represents number 563
//        List2: 8->4->2    // represents number 842
//        Output: Resultant list: 1->4->0->5    // represents number 1405

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class sumList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return reverseList(dummyHead.next);
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        sumList solution = new sumList();

        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(6);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(8);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(2);

        System.out.println("List 1:");
        solution.printList(l1);
        System.out.println("List 2:");
        solution.printList(l2);

        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println("Resultant list:");
        solution.printList(result);
    }
}
