package Generics;

import java.util.*;

class Student{
    int marks;
    int age;
    String name;
    public Student(int marks, int age, String name){
        this.marks = marks;
        this.age = age;
        this.name = name;
    }
    public int getMarks(){
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String toString(){      //to print the data of the Object, not address
        return ""+ marks + " - "+ age + " - "+ name;
    }
}
class Alpha1 implements Comparator<Student>{     //comparator interface
    public int compare(Student a, Student b){
        if(a.age>b.age)     //sorting according to age
        return 1;
        else return -1;
    }
}
public class comparator {
    public static void main(String[] args) {
        Student st1 = new Student(45,18,"Rohan");
        Student st2 = new Student(55,17,"Rohit");
        Student st3 = new Student(65,19,"Rahul");

        List<Student> list = new ArrayList<Student>();

        list.add(st1);
        list.add(st2);
        list.add(st3);
        System.out.println(list);

//        Collections.sort(list);      //there are multiple types of data here, so we cannot sort simply
        Alpha1 a = new Alpha1();


        //we can do it with lambda expressions also-->
//        Comparator<Student> com =(Student a, Student b)->{
//            if(a.age>b.age)     //sorting according to age
//                return 1;
//            else return -1;
//        };
//        Collections.sort(list,com);


        Collections.sort(list,a);      //sorting by comparator interface
        System.out.println(list);
    }
}
