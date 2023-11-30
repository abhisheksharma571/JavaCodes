package Stacks;

import java.util.Stack;

//Leetcode
public class minStack {
    public static class minimumStack{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> min = new Stack<>();
        public minimumStack(){
            //constructor
        }
        public void push(int val){
            if(st.size() == 0){
                st.push(val);
                min.push(val);
            }
            else{
                st.push(val);
                if(min.peek() < val) min.push(min.peek());
                else min.push(val);
            }
        }
        public void pop(){
            st.pop();
            min.pop();
        }
        public int top(){
            return st.peek();
        }
        public int getMin(){
            return min.peek();
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
