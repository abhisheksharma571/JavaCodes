package Queue;

public class CircularQueueArrayImplementation {
    public static class CQueueA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];
        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is full");
            }
            else if(size==0) {
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear<arr.length-1){  //normal case
                arr[++rear] = val;
            }
            else if(rear==arr.length-1) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }
            else {
                int val = arr[front];
                if(front==arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }
            else return arr[front];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty");
                return;
            }
            else if(front<=rear){
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else {
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        CQueueA cqa = new CQueueA();
        cqa.display();
        cqa.add(1);
        cqa.add(2);
        cqa.add(3);
        cqa.add(4);
        cqa.display();
//        cqa.remove();
        System.out.println(cqa.remove());
        for(int i=0;i<cqa.arr.length;i++){
            System.out.print(cqa.arr[i]+" ");
        }
        System.out.println();
        cqa.display();
        cqa.add(5);
        cqa.display();
        cqa.add(6);
        cqa.display();
        cqa.remove();
        cqa.display();
        cqa.add(7);
        cqa.display();
        System.out.println(cqa.peek());
        System.out.println(cqa.isEmpty());
        for(int i=0;i<cqa.arr.length;i++){
            System.out.print(cqa.arr[i]+" ");
        }
    }
}
