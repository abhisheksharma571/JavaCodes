package Queue;

public class linkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class QueueLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x){
            Node temp = new Node(x);
            if(size==0){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        public int remove(){
                if(size==0){
                    System.out.println("Queue is empty");
                    return -1;
                }
                int x = head.val;
                head = head.next;
                size--;
                return x;
            }
            public void display(){
                if(size==0){
                    System.out.println("Queue is empty");
                    return;
                }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
                }
                System.out.println();
            }
            public boolean isEmpty(){
            if(size==0) return true;
            else return false;
            }
        }
    public static void main(String[] args) {
        QueueLL qL = new QueueLL();
        qL.display();
        qL.add(1);
        qL.add(2);
        qL.add(3);
        qL.add(4);
        qL.display();
        System.out.println(qL.peek());
        System.out.println(qL.isEmpty());
        System.out.println(qL.size);
        qL.remove();
        qL.display();
    }
}
