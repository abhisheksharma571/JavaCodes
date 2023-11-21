package LinkedList;
//Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list

//To group all the nodes with odd indices together followed by the nodes with even indices in a singly linked list, we can use the following algorithm:
//
//        Initialize two pointers, odd and even. Set odd to the head of the linked list and even to the next node in the linked list.
//        While odd and even are not null:
//        Move odd to the next odd node in the linked list.
//        Move even to the next even node in the linked list.
//        Set the next pointer of the last odd node to the head of the even sublist.
//        Return the head of the linked list.
public class oddEvenLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node groupOddEvenNodes(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node odd = new Node(0);
        Node even = new Node(0);
        Node tempo = odd;
        Node tempe = even;
        Node temp = head;
        while(temp!=null){
            tempo.next = temp;
            temp = temp.next;
            tempo = tempo.next;

            tempe.next = temp;
            if(temp==null) break;
            temp = temp.next;
            tempe = tempe.next;
        }
        odd = odd.next;
        even = even.next;
        tempo.next = even;
        return odd;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node groupedHead = groupOddEvenNodes(head);

        // Print the linked list.
        Node current = groupedHead;
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
