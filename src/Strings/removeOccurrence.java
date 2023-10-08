package Strings;

import java.util.Scanner;

//Remove all the occurrences of 'a' from the string s="abcax"
public class removeOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        String ans = new String();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'){
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
