package Stacks;
//copy elements of Stacks into another stacks in same order
import java.util.Scanner;
import java.util.Stack;

public class moveStacksInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of elements you want to insert: ");
        n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=1;i<=n;i++)
        {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        //reverse order
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println(gt);
        //again reverse
        Stack<Integer> rt = new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}
