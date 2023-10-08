package Collection;
//Iterator and List Iterator(Cursor)
import java.util.*;
public class iterator {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(100);;
        System.out.println(a1);
//loops are used for index based collection
        //for loop
        for(int i=0; i<a1.size();i++){
//            Object o=a1.get(i);   //fetch data at ith index
//            System.out.println(o);
            System.out.println(a1.get(i));
        }

        //for each loop
        for(Object o:a1){
            System.out.println(o);
        }

        Iterator itr=a1.iterator();
        while(itr.hasNext()){          //hasNext() checks that next data is available or not and next() fetch the next data
//            Integer i=(Integer) itr.next();     //it gives data into Object form, and I am storing it into Integer type, so I am doing down-cast here
            System.out.println(itr.next());
        }

        //ListIterator is only available with List based classes like ArrayList and LinkedList
        ListIterator litr =a1.listIterator(a1.size());     //you can also fetch data from last by giving a1.size() by using ListIterator
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

    }
}
