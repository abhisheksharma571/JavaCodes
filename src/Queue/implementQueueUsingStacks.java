package Queue;
//push efficient
import java.util.Stack;

public class implementQueueUsingStacks {
    public static class MyQueue{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        public MyQueue(){

        }
        public void push(int x){
            st.push(x);
        }
        public int pop(){
            while(st.size()>1){
                helper.push(st.pop());
            }
            int x = st.pop();
            while(helper.size()>0){
                st.push(helper.pop());
            }
            return x;
        }
        public int top(){
            while(st.size()>1){
                helper.push(st.pop());
            }
            int x = st.peek();
            while(helper.size()>0){
                st.push(helper.pop());
            }
            return x;
        }
        public boolean empty(){
            if(st.size()==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println(q.pop());
        System.out.println(q.top());
        System.out.println(q.empty());
    }
}