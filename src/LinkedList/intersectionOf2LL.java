package LinkedList;
//Finding intersection of two Linked Lists
public class intersectionOf2LL {
    public static class Node{
        int data;
        Node next;
        Node(int data){   //constructor
            this.data = data;
        }
    }
    public static Node intersection(Node headA, Node headB){
        Node tempA = headA;
        Node tempB = headB;
        int lengthA = 0;
        while(tempA!=null){
            lengthA++;
            tempA = tempA.next;
        }
        int lengthB = 0;
        while(tempB!=null){
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(lengthA>lengthB){
            int steps = lengthA-lengthB;
            for(int i=1;i<=steps;i++){
                tempA = tempA.next;
            }
        } else {
            int steps = lengthB-lengthA;
            for(int i=1;i<=steps;i++){
                tempB = tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
    public static void main(String[] args) {
        Node h1 = new Node(5);
        Node a = new Node(7);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(18);
        Node g = new Node(19);
        Node h2 = new Node(20);
        Node z = new Node(67);
        Node i = new Node(24);
        Node j = new Node(11);
        Node k = new Node(10);
        h1.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = i;

        h2.next = z;
        z.next = i;
        i.next = j;
        j.next = k;

        Node q = intersection(h1,h2);
        System.out.println(q.data);
    }
}
