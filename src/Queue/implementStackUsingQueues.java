package Queue;
//push efficient
import java.util.LinkedList;
import java.util.Queue;

public class implementStackUsingQueues {
    public static class MyStack{
        Queue<Integer> q = new LinkedList<>();
        public MyStack(){

        }
        public void display(){
            System.out.print(q);
        }
        public void push(int x){
            q.add(x);
        }
        public int pop(){
            for(int i=0;i<q.size()-1;i++){
                q.add(q.remove());
            }
            int val = q.remove();
            return val;
        }
        public int top(){
            for(int i=0;i<q.size()-1;i++){
                q.add(q.remove());
            }
            int val = q.peek();
            q.add(q.remove());
            return val;
        }
        public boolean empty(){
            if(q.size()==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.println();
        System.out.println(st.pop());
        st.display();
        System.out.println();
        System.out.println(st.top());
        System.out.println(st.empty());

    }
}
