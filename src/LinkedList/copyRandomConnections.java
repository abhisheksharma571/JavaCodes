package LinkedList;
//Copy list with random pointer : construct a deep copy of a linked list where each node contains an additional random pointer, which could point to any node in the list or null.
public class copyRandomConnections {

    public static class Node {
        int data;
        Node next;
        Node random;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.random = null;
        }
    }

    public static Node copyLinkedListWithRandomConnections(Node head) {
        if (head == null) {
            return null;
        }

        // Create a new linked list by copying the values of the nodes in the original linked list.
        Node head2 = new Node(0);
        Node temp2 = head2;
        Node temp1 = head;
        while(temp1!=null){
            Node t = new Node(temp1.data);
            temp2.next = t;
            temp2 = t;
            temp1 = temp1.next;
        }
        head2 = head2.next;
        temp2 = head2;
        temp1 = head;

        // Connect the nodes in the new linked list in an alternating order.
        Node temp = new Node(-1);
        while (temp1!=null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        temp2 = head2;
        temp1 = head;

        // Assign the random pointers of the nodes in the new linked list to the corresponding nodes in the original linked list.
        while(temp1!=null && temp2!=null)
        {
            if(temp1.random==null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp2.next;
            if(temp1!=null) temp2 = temp1.next;
        }
        temp2 = head2;
        temp1 = head;
        // Separate the new linked list from the original linked list by breaking the connections between the alternating nodes.
        while(temp1!=null){
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if(temp1==null) break;
            temp2.next = temp1.next;
            if(temp2.next==null) break;
            temp2 = temp2.next;
        }
        return head2;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head.random = head.next.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next;
        head.next.next.next.next.random = head.next.next;

        Node copiedHead = copyLinkedListWithRandomConnections(head);

        // Print the copied linked list.
        Node current = copiedHead;
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
