package Recursion;

import java.util.Scanner;

//Write a program to print the reverse of a String
public class reverseString {
    static String reverseStr(String s,int idx){
        //base case
        if(idx==s.length()) return "";
        //recursive work
        String smallAns = reverseStr(s,idx+1);
        //self work
        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(reverseStr(s,0));
    }
}
