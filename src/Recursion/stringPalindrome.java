package Recursion;
//Write a program to check given string is palindrome or not
import java.util.Scanner;

public class stringPalindrome {
    static String reverse(String s,int idx){
        //base case
        if(idx==s.length()) return "";
        //recursive work
        String smallAns = reverse(s,idx+1);
        //self work
        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String rev = reverse(s,0);
        if(rev.equals(s)){
            System.out.printf("%s is Palindrome ",s);
        }
        else System.out.printf("%s is Not palindrome ",s);
    }
}
