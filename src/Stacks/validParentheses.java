package Stacks;
//Given a string s containing just the characters '(',')','{','}','[',']' determine if the input string is valid.
import java.util.Scanner;
import java.util.Stack;

public class validParentheses {
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                if(st.peek()=='(' || st.peek()=='{' || st.peek()=='['){
                    char temp = st.pop();
                    if((temp=='(' && ch==')' ) || (temp=='{' && ch=='}' ) ||(temp=='[' && ch==']' )  )
                    {
                        continue;
                    }else
                    {
                        return false;
                    }
                }
            }
        }
        if(st.size()>0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isValid(str));
    }
}
