package Strings;
import java.util.*;
public class finalImutability {
    public static void main(String[] args) {
        final int a=20;
//        a=30;    //error    you can not change the value of 'a' here, due to final keyword
        System.out.println(a);

        StringBuffer sb = new StringBuffer("Virat");
        sb.append("Kohli");
        System.out.println(sb);
        sb= new StringBuffer("Sahin");
        System.out.println(sb);

        final StringBuffer rs = new StringBuffer("Rohit");
        sb.append("Kohli");
        System.out.println(rs);
//        rs= new StringBuffer("Sharma");          //error
//        System.out.println(rs);
        // final keyword can not make string immutable, but you can not change the address given to the variable
    }
}
