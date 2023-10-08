package Stacks;

import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());   //tell us whether stack is empty or not
        System.out.println();
        st.push(6);
        st.push(4);
        st.push(37);
        st.push(6);
        st.push(34);
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size is : "+st.size());
        //printing 1st element
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}
