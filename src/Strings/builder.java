package Strings;
import java.util.*;
public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        StringBuilder qtr = new StringBuilder(150);          //defines capacity
        System.out.println(qtr.capacity());     //150
        qtr.append("Hi");
        qtr.trimToSize();               //delete extra size of string which is not used
        System.out.println(qtr.capacity());     //2
        StringBuilder ptr = new StringBuilder("Hello");
        System.out.println(ptr.capacity());         //5+16
        System.out.println(str.capacity());        //16 capacity initially
             //append()-->to add strings
        str.append("Hello");
        str.append(" World shets");
        System.out.println(str.length());
        System.out.println(str.capacity());           //if string exceeds to 16 --> (16+1)*2
        str.append(123);
        System.out.println(str);
            //setCharAt()-->changes character in the strings
        System.out.println(str.charAt(3));
        str.setCharAt(0,'m');
        System.out.println(str);
             //insert()->insert character in strings
        str.insert(2,'y');
        System.out.println(str);
             //deleteCharAt()-->deletes character in strings
        str.deleteCharAt(3);
        System.out.println(str);
              //reverse()-->reverse strings
        StringBuffer sb = new StringBuffer("Physics");
        sb.reverse();
        System.out.println(sb);
             //delete-->deletes part of strings
        sb.delete(2,4);       //2 to 3 delete
        System.out.println(sb);
    }
}
