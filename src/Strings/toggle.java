package Strings;
import java.util.*;
//Given a string, the task is to toggle all the characters of the string i.e. to convert Upper case to Lower case and vice versa.
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
              //toggle
              // PHysiCs-->phYSIcS
        for(int i=0;i<str.length();i++){
            //P-->p
            //check --> alphabet small or capital
            boolean flag = true;
            char ch = str.charAt(i);
            if(ch==' ')  continue;
            int ascii = (int)ch;
            if(ascii>=97) flag = false;
            if(flag==true){       // capital
                ascii += 32;
                char dh =(char)ascii;      //small
                str.setCharAt(i,dh);
            }
            else{
                ascii -= 32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
