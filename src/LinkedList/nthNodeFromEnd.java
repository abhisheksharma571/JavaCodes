package LinkedList;
//Finding Nth node from the end of the Linked List, if only head is given. Return Node.
public class nthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){   //constructor
            this.data = data;
        }
    }
    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        //mth node from start
        temp = head;
        for(int i=1;i<=m-1;i++){
            temp = temp.next;
        }
        return temp;
    }
    public static Node nthNode2(Node head, int n){   //in one traversal
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static Node deleteNthNodeFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        if(fast==null) {   //for head
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
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
        Node e = new Node(16);  //tail node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node q = nthNode(a,3);
        System.out.println(q.data);
        Node p = nthNode2(a,3);
        System.out.println(p.data);
        display(a);
        deleteNthNodeFromEnd(a,2);
        display(a);
        a = deleteNthNodeFromEnd(a,4);
        display(a);
    }
}
