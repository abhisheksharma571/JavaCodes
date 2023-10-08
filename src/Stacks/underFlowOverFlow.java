package Stacks;

import java.util.Stack;

public class underFlowOverFlow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(4);
        st.push(37);
        st.push(6);
        st.push(34);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        //Stack UnderFlow-> If Stack is empty -> st.peek() or st.pop() -> Empty Stack Exception
//        st.pop();
//        System.out.println(st);


        //OverFlow-> If stack is full, and you are trying to st.push(). While Implementing using Array
    }
}
