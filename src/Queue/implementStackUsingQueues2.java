package Queue;
//pop efficient
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class implementStackUsingQueues2 {
    public static class MyStack{
        Queue<Integer> q = new LinkedList<>();
        public MyStack(){

        }
        public void push(int x){
            if(q.size()==0) q.add(x);
            else {
                q.add(x);
                for(int i=1;i<=q.size()-1;i++){
                    q.add(q.remove());
                }
            }
        }
        public int pop(){
            return q.remove();
        }
        public int top(){
            return q.peek();
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
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.empty());

    }
}