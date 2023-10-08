package Queue;

public class arrayImplementation {
    public static class QueueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f==-1){   //queue is currently empty
                f = r = 0;
                arr[0] = val;
            }
            else arr[++r] = val;
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0) {
                System.out.println("Queue is empty");
            } else {
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueA qA = new QueueA();
        qA.display();
        qA.add(1);
        qA.add(2);
        qA.add(3);
        qA.display();
        qA.remove();
        qA.display();
        System.out.println(qA.peek());
        System.out.println(qA.isEmpty());
        System.out.println(qA.size);
    }
}
