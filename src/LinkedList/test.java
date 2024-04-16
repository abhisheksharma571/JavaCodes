package LinkedList;
class Node {
    int data;
    Node next;
    Node(int value) {
        data = value;
        next = null;
    }
}
public class test {
    Node head;
    public void insertAfter(int index, int value) {
        if (index < 0) {
            System.out.println("Invalid index. Index should be non-negative.");
            return;
        }
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Index out of bounds. Cannot insert at index " + index);
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        test list = new test();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(5);
        list.head.next.next.next.next = new Node(6);

        System.out.println("Original linked list:");
        list.printList();

        int index = 2; // Index after which new node will be inserted
        int value = 3; // Value of the new node

        list.insertAfter(7, 3);

        System.out.println("\nLinked list after inserting node with value " + value + " after index " + index + ":");
        list.printList();
    }
}
