package Generics;

import java.util.*;
class Gen<T>{
    T obj;
    public Gen(T obj){
        this.obj = obj;
    }
    void disp(){
        System.out.println("The type of data is : "+ obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }

}
public class moreOnGenerics {
    public static void main(String[] args) {
        Gen<Integer> g = new Gen<Integer>(10);
        g.disp();
        System.out.println(g.getObj());
        System.out.println("*******************************************");
        Gen<String> g1 = new Gen<String>("PW");
        g1.disp();
        System.out.println(g1.getObj());

        ArrayList<Gen> list = new ArrayList<Gen>();  //
        ArrayList<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();     //ArrayList implements List, so we have reference List
        Collection<Integer> list3 = new ArrayList<Integer>();  //List implements Collection, so we have reference Collection
//        List<Object> list4 = new ArrayList<String>();    //String implements Object, but we cannot have different generics types on both sides
//        List<String> list5 = new ArrayList<Integer>();
//        List<int> list6 = new ArrayList<int>();     //generics cannot have primitive value

    }
}
