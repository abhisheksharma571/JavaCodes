package Generics;

import java.util.ArrayList;

class Student1{
    private String name;
    private int id;
}
class Employee1{
    private String name;
    private int id;
}
public class basics2 {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        Student1 st2 = new Student1();

        Employee1 e = new Employee1();

        ArrayList<Student1> al =new ArrayList<Student1>();
        //this collection can only store Student1 type of data
        al.add(st1);
        al.add(st2);
//        al.add(e);  this will give compile time error

    }
}
