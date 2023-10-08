package LinkedList;

public class basics {
    public static void insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next!=null){
            t = t.next;
        }
        t.next = temp;
    }
    public static void displayReverse(Node head){
        if(head == null)  return;
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void displayRecursively(Node head){
        if(head == null)  return;
        System.out.print(head.data+" ");
        displayRecursively(head.next);
    }
    public static void display(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static class Node{
        int data; //value
        Node next; //address of next node
        Node(int data){   //constructor
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);  //head node
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);  //tail node
        // 5 -> 3 -> 9 -> 8 -> 16
        System.out.println(a.next);
        a.next = b;
        System.out.println(a.next.data);
        System.out.println(b.data);
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(a.next);
        System.out.println(b);
        //displaying a LinkedList
        Node temp = a;
//        for(int i=0;i<5;i++){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
        //displaying a Linked list if size is not given
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
//        display(a);
//        System.out.println();
//        displayRecursively(a);
//        System.out.println();
//        displayReverse(a);
        System.out.println();
        insertAtEnd(a,56);
        display(a);
    }
}
