package LinkedList;
//Can we delete a node given the node itself as a parameter? Is there any efficient way, provided that the given node is not the last node?
public class deleteNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){   //constructor
            this.data = data;
        }
    }
    public static void delete(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
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
        display(a);
        System.out.println();
        delete(c);
        display(a);
    }
}
