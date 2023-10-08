package Stacks;
//insert elements at any index in stacks
import java.util.Stack;

public class insertInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(4);
        st.push(37);
        st.push(6);
        st.push(34);
        System.out.println(st);
        int idx = 2;  //index at which you want to insert
        int x = 12; //element
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
