package Strings;
import java.util.*;
public class toggleString {
    public static void main(String[] args) {
        String str = "PhySIcS";
        for(int i=0;i<str.length();i++){
            boolean flag = true;
            char ch = str.charAt(i);
            if(ch==' ')  continue;
            int ascii = (int)ch;
            if(ascii>=97) flag = false;
            if(flag==true){       // capital
                ascii += 32;
                char dh =(char)ascii;      //small
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
            else{
                ascii -= 32;
                char dh = (char)ascii;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
