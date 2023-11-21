package Stacks;

import java.util.Scanner;
import java.util.Stack;

//Check whether a given bracket sequence is balanced or not
public class balancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) return false;
        else return true;
    }
    public static int numberOfBracketsToRemove(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0) count++;
                else st.pop();
            }
        }
        return count+st.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        System.out.println("The number of brackets we have to remove to balance the brackets: "+numberOfBracketsToRemove(str));
    }
}
