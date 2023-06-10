package Strings;
import java.util.*;
//The string should be compressed such that consecutive duplicates of characters are replaced by the number with the character
// and followed by the number of consecutive duplicates.
public class duplicatesToNo {
    public static void main(String[] args) {
        String str = "aaabbbbcddddeeeee";
        String ans = ""+ str.charAt(0);
        int count=1;
        for(int i=i=1;i<str.length();i++){
            char current = str.charAt(i);
            char prev = str.charAt(i-1);
            if(current==prev){
                count++;
            }
            else{
                if(count>1)  ans += count;
                count = 1;
                ans += current;
            }
        }
        if(count>1)  ans += count;
        System.out.println(ans);
    }
}
