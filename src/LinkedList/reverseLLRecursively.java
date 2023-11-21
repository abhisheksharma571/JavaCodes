package LinkedList;
//reverse a linkedList and return its new head recursively
public class reverseLLRecursively {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node reverse(Node head){
        if(head.next==null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void display(Node head){
        if(head==null){
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(5);
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
        display(a);
        Node r = reverse(a);
        display(r);

    }
}
