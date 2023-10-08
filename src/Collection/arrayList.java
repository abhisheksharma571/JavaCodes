package Collection;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);       //to add elements
        al1.add(200);
        al1.add(300);
        System.out.println(al1);      //to show ArrayList

        ArrayList al2 = new ArrayList();
        al2.add("Pw skills");          //ArrayList stores heterogeneous type of data
        al2.add(1);
        al2.add('j');
        al2.add(2.2);
        System.out.println(al2);

        al2.add(100);      //size of ArrayList is dynamic
        System.out.println(al2);

        ArrayList al3 = new ArrayList();
        al3.add(1);
        al3.add(2);
        al3.add(4);
        System.out.println(al3);
        al3.addAll(al2);    //adds al2 collection into al3 collection
        System.out.println(al3);

        al3.add(2,"PW");    //adds PW at index 2, you can also add collection at specific index
        System.out.println(al3);

    }
}
