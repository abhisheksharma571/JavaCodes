package Collection;
//Other In-Built Classes and In=Built Methods Under Map Hierarchy
import java.util.*;
public class otherMaps {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        //order of insertion is not preserved
        ht.put(1,"Rohit");
        ht.put(2,"Virat");
        ht.put("Rahul",67);
//        ht.put(null,"Rohan");    //null value of key or value is not allowed
        System.out.println(ht);
        ht.putIfAbsent(2,"Virat");     //adds if not present
        ht.putIfAbsent(3,"Virat");
        System.out.println(ht);

        TreeMap tm = new TreeMap();
        //order of insertion is not preserved, but it is sorted based on the keys
        tm.put(2,"Rohit");
        tm.put(1,"Ramesh");
        tm.put(4,"Rahul");
        tm.put(3,"Rohan");
        System.out.println(tm);
    }
}
