package Stacks;

import java.util.Stack;

//without using extra stack
public class minStack2 {
    public static class minimumStack{
        Stack<Long> st = new Stack<>();
        long min = -1;
        public minimumStack(){
            //constructor
        }
        public void push(int val){
            long x = (long)val;
            if(st.size() == 0){
                st.push(x);
                min = x;
            }
            else if(val >= min){
                st.push(x);
            }
            else if(x<min){
                st.push(2*x - min);
                min = x;
            }
        }
        public void pop(){
            if(st.size() == 0) return;
            if(st.peek() >= min) st.pop();
            if(st.peek() < min){
                //peek pe fake value padi hai
                //restore the old min
                long old = 2*min - st.peek();
                min = old;
                st.pop();
            }
        }
        public int top(){
            if(st.size() == 0) return -1;
            long q = st.peek();
            if(st.peek() >= min) return  (int)q;
            if(st.peek() < min) return (int)min;
            return 0;
        }
        public int getMin(){
            if(st.size() == 0) return -1;
            return (int)min;
        }
    }
    public static void main(String[] args) {
        minimumStack mnSt = new minimumStack();
        mnSt.push(3);
        System.out.println(mnSt.getMin());
        mnSt.push(4);
        System.out.println(mnSt.getMin());
        mnSt.push(7);
        System.out.println(mnSt.getMin());
        mnSt.push(2);
        System.out.println(mnSt.getMin());
        mnSt.push(5);
        System.out.println(mnSt.getMin());
    }
}
