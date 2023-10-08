package Stacks;

import java.util.Stack;

public class displayStack {
    public static void displayRec(Stack st){
        if(st.size()==0) return;
        int top = (int) st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(4);
        st.push(37);
        st.push(6);
        st.push(34);
        //through recursion
        displayRec(st);
        System.out.println();
        //through stacks
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            int x = rt.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();
        //through array
        int n = st.size();
        int[] arr = new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i] = st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}
