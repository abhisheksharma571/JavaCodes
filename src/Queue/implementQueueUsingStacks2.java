package Queue;
//pop efficient
import java.util.Stack;

public class implementQueueUsingStacks2 {
    public static class MyQueue{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        public MyQueue(){

        }
        public void push(int x){
            if(st.size()==0) st.push(x);
            else{
                while(st.size()>0){
                    helper.push(st.pop());
                }
                st.push(x);
                while(helper.size()>0){
                    st.push(helper.pop());
                }
            }
        }
        public int pop(){
            return st.pop();
        }
        public int top(){
            return st.peek();
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