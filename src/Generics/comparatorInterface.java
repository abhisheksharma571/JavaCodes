package Generics;
import java.util.*;

class Student2 implements Comparable<Student2> {
    int marks;
    int age;
    String name;

    public Student2(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }
    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public String toString() {      //to print the data of the Object, not address
        return "" + marks + " - " + age + " - " + name;
    }

    public int compareTo(Student2 a) {
        if (this.age > a.age)
            return 1;
        else return -1;
    }

    public class comparatorInterface {
        public static void main(String[] args) {
            Student2 st1 = new Student2(45, 18, "Rohan");
            Student2 st2 = new Student2(55, 17, "Rohit");
            Student2 st3 = new Student2(65, 19, "Rahul");

            List<Student2> list = new ArrayList<>();

            list.add(st1);
            list.add(st2);
            list.add(st3);
            System.out.println(list);

            Collections.sort(list);
            System.out.println(list);
        }
    }
}
