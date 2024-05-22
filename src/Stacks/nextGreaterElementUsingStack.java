package Stacks;
//The Next greater Element for an element x is the first greater element on the right side of x in the array.
// Elements for which no greater element exist, consider the next greater element as -1.
import java.util.Stack;

public class nextGreaterElementUsingStack {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}
