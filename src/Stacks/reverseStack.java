package Stacks;

import java.util.Stack;

public class reverseStack{
    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }
    public static void reverseSt(Stack<Integer> st){
        if (st.size()==1) return;
        int top = st.pop();
        reverseSt(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(4);
        st.push(37);
        st.push(6);
        st.push(34);
//        System.out.println(st);
//        //reverse recursively
//        reverseSt(st);
//        System.out.println(st);
        System.out.println();
        //reverse iteratively
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println(gt);
        Stack<Integer> rt = new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
