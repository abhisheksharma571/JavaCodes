package Collection;
import java.util.*;
public class treeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        //data is in sorted form(ascending order) - It follows Binary Search Tree data structure
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);
        ts.add(100);    //duplicates is not allowed and also null value is not allowed
        System.out.println(ts);
        System.out.println(ts.higher(50));   //greater than 50
        System.out.println(ts.lower(50));     //less than 50
        System.out.println(ts.ceiling(40));    //greater than 40, if 40 is not present otherwise it will give 40
        System.out.println(ts.floor(40));        //less than 40, if 40 is not present otherwise it will give 40
        System.out.println(ts.ceiling(50));
        System.out.println(ts.floor(50));

    }
}
