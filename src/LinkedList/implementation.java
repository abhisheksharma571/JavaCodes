package LinkedList;
public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if(head == null){
//                head = tail = temp;
                insertAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size){   //insert at end
                insertAtEnd(val);
                return;
            } else if (idx==0) {
                insertAtBeginning(val);
                return;
            } else if (idx<0 || idx>size) {
                System.out.println("Wrong Index");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getElement(int idx){
            Node temp = head;
            if (idx<0 || idx>size) {
                System.out.println("Wrong Index");
                return -1;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if(idx==0){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx==size-1) tail = temp;
            size--;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.display();
        System.out.println();
        ll.insertAtBeginning(4);
        ll.insertAtBeginning(3);
        ll.display();
        System.out.println();
        ll.insertAt(3,10);
        ll.insertAt(2,20);
        ll.display();
        ll.insertAt(6,30);   //insert at end
        System.out.println();
        ll.display();
        ll.insertAt(0,100);   //insert at beginning
        System.out.println();
        ll.display();
        System.out.println();
        System.out.println(ll.size);
        System.out.println(ll.getElement(4));
        System.out.println(ll.getElement(0));
        ll.deleteAt(5);
        System.out.println();
        ll.display();
        ll.deleteAt(6);
        System.out.println();
        ll.display();
        ll.deleteAt(0);
        System.out.println();
        ll.display();
    }
}