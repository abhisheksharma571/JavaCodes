package LinkedList;

public class merge2SortedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){   //constructor
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node mergeList(Node headA, Node headB){   //without using extra space
        Node t1 = headA;
        Node t2 = headB;
        Node h = new Node(4);
        Node t = h;
        while(t1!=null && t2!=null){
            if(t1.data<t2.data){
                t.next = t1;
                t = t1;
                t1 = t1.next;
            } else {
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }
        if(t1==null){
            t.next = t2;
        } else {
            t.next = t1;
        }
        return h.next;
    }
    public static Node mergeList2(Node head1, Node head2){  //using extra space
        Node temp1 = head1;
        Node temp2 = head2;
        Node head = new Node(100);
        Node temp = head;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                Node a = new Node(temp1.data);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            } else {
                Node a = new Node(temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        if(temp1==null){
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }
        return head.next;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(16);

        Node w = new Node(6);
        Node x = new Node(10);
        Node y = new Node(13);
        Node z = new Node(20);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        w.next = x;
        x.next = y;
        y.next = z;
        Node q = mergeList(a,w);
        display(q);
    }
}
