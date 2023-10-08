package Recursion;

import java.util.Scanner;

//Given a string, WAP to print all its subsequences
public class printSubsequence {
    static void printSSQ(String s, String currAns){
        if(s.length()==0){
            System.out.print(currAns+" ");
            return;
        }
        char currChar = s.charAt(0);
        String remString = s.substring(1);
        //currChar chooses to be a part of currAns
        printSSQ(remString,currAns+currChar);
        //currChar does not choose to be a part of currAns
        printSSQ(remString,currAns);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        printSSQ(s,"");
    }
}
