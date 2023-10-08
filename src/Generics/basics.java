package Generics;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        //type-safety
        String ar[]= new String[10];
        ar[0] = "Abhishek";
        ar[1] = "Sharma";
//        ar[2]  = 10;        //compile time error

        //String name1 = ar[0];
        //String name2 = ar[1];

        //No type-safety
        ArrayList al = new ArrayList();
        al.add("Abhishek");
        al.add("Sharma");
        al.add(10);

        String n1 = (String)al.get(0);     //typecasting
        String n2 = (String)al.get(1);
//        String n3 = (String)al.get(2);     //this wil give runtime error

        //Type-safety achieved by using generics
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Abhishek");
        al2.add("Sharma");
//        al2.add(10);        //this will give compile time error

        String name1 = al2.get(0);    //there is no need of typecasting
        String name2 = al2.get(1);


    }
}
