package Collection;
import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        //index based insertion is not allowed
        //order of insertion is not preserved, HashTable data structure is followed(randomly data is filled into bucket)
        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println(hs);
        hs.add(40);    //duplicates of data is not allowed
        System.out.println(hs);
        //to maintain the order of data we have to use LinkedHashSet
        LinkedHashSet hs1 = new LinkedHashSet();
        //it follows Linked List and HashTable also
        hs1.add(100);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);
        System.out.println(hs1);
    }
}
