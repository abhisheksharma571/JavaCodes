package Strings;
import java.util.*;
//Program to reverse each word in String
public class reverseEachWord {
    public static void main(String[] args) {
        String str = "I am a good Student";
        String ans ="";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
//                sb.delete(0,sb.length());
                sb = new StringBuilder("");
            }
        }
        //I ma a doog
        sb.append(" ");
        sb.reverse();
        ans += sb;
        //I ma a doog  tnedutS
        System.out.println(ans);
    }
}
