package Strings;
import java.util.*;
public class subString {
    public static void main(String[] args) {
        //abcd-->a, ab,abc,abcd,b,bc,bcd,c,cd,d
        String str = "Abhishek";
        System.out.println(str.substring(0,2));                  //0 to 1 index(2-1)
        System.out.println(str.substring(3));          //beginning index
        String s="Physics";
        for(int i=2;i<4;i++){
            System.out.println(s.substring(i));
        }

        //Given a string s1,print all the substrings of s1:abcd-->a, ab,abc,abcd,b,bc,bcd,c,cd,d
        String s1 = "abcd";
        for(int i=0;i<=3;i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(s1.substring(i,j)+" ");
            }
        }
    }
}
