package LinkedList;
//Given the head of a Linked List, return the middle node of the linked list. Return right middle if two middle element is present.
public class middleOfLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){   //constructor
            this.data = data;
        }
    }
    public static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node deleteMiddle(Node head){
        if(head.next==null) return null;
        Node slow = head;
        Node fast = head;
        while (fast.next.next!=null && fast.next.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(5);  //head node
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(67);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node q = middleNode(a);
        System.out.println(q.data);
        display(a);
        a = deleteMiddle(a);
        display(a);
    }
}
