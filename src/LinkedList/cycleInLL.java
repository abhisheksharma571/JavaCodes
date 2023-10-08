package LinkedList;

public class cycleInLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){   //constructor
            this.data = data;
        }
    }
    public static boolean hasCycle(Node head){
        if(head==null) return false;
        if(head.next==null) return false;
        Node slow = head;
        Node fast = head;
        while(fast!=null){
            if(slow==null) return false;
            slow = slow.next;
            if(fast.next==null) return false;
            fast = fast.next.next;
            if(fast==slow) return true;
        }
        return false;
    }
    //find out the node where the cycle begins
    public static Node cycleStartNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow) break;
        }
        Node temp = head;
        while(temp!=slow){
            temp = temp.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(5);  //head node
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);  //tail node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = c;
        System.out.println(hasCycle(a));
        Node q = cycleStartNode(a);
        System.out.println(q.data);
    }
}
