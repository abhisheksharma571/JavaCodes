package Collection;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        //order of insertion is not preserved
        hm1.put(null,null);   //you can also give null value to key and value also
        hm1.put(01,"Rohit");     //put() is used to add data which includes key and value
        hm1.put(02,"Virat");
        hm1.put(03,"Dhoni");
        hm1.put(04,"Rohit");   //value can be same but key should be different
        hm1.put(03,"Dhoni");   //is not considered, key should be unique
        System.out.println(hm1);

        HashMap hm2 = new HashMap();
        hm2.put("Virat","Rohit");    //key or value can be of any type
        hm2.put("Rohit","Kohli");
        hm2.put(03,"Rohit");
        hm2.put(04,9);
        System.out.println(hm2);

        //to maintain the order of insertion we have to use LinkedHashMap
        LinkedHashMap hm3 = new LinkedHashMap();
        hm3.put("Virat","Rohit");    //key or value can be of any type
        hm3.put("Rohit","Kohli");
        hm3.put(03,"Rohit");
        hm3.put(04,9);
        System.out.println(hm3);
    }
}
