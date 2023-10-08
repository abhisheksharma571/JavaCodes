package LinkedList;

public class findLength {
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head= head.next;
        }
        return count;
    }
    public static class Node{
        int data; //value
        Node next; //address of next node
        Node(int data){   //constructor
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node temp = a;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        System.out.println(size);
        System.out.println(length(a));
    }
}
