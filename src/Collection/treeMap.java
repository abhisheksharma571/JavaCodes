package Collection;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
//    public int compareTo(Student that) {
//        //sort inc id
//        return this.id - that.id;
//    }

    public int compareTo(Student that) {
        if(this.marks == that.marks) {
            if(this.id == that.id) {
                return this.name.compareTo(that.name);
            }
            return this.id - that.id;    //sort inc id
        }
        //sort dec marks
        return that.marks - this.marks;
    }
    public String toString() {
        return "Student: " + this.id + " " + this.name + " " + this.marks;
    }
}
public class treeMap {
    public static void main(String[] args) {
        //TreeMap<Integer, String> tmap = new TreeMap<>();
        TreeMap<Integer, String> tmap = new TreeMap<>(Collections.reverseOrder()); // to sort in decreasing order
        tmap.put(2, "Two");
        tmap.put(4, "Four");
        tmap.put(5, "Five");
        tmap.put(1, "One");
        tmap.put(3, "Three");

        System.out.println(tmap);
        System.out.println(tmap.get(2));   // to the values
        System.out.println(tmap.getOrDefault(6, "Not Present"));  // get the values, or if not present return "Not Present"
        System.out.println(tmap.containsKey(2));  //true
        System.out.println(tmap.containsValue("Two"));   //true
        System.out.println(tmap.keySet());  // set of keys
        System.out.println(tmap.values());  //set of values
        System.out.println(tmap.entrySet());  //set of key value pairs
        //traversal -> key are sorted
        for(Map.Entry<Integer, String> entry : tmap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        tmap.remove(2);
        System.out.println(tmap);

        TreeMap<Student, String> tmap2 = new TreeMap<>();
        tmap2.put(new Student(2, "Aman", 34), "Two");
        tmap2.put(new Student(4, "Rahul", 45), "Four");
        tmap2.put(new Student(5, "Pawan", 45), "Five");
        tmap2.put(new Student(1, "Ajay", 56), "One");
        tmap2.put(new Student(3, "Sumit", 56), "Three");

        System.out.println();
        //System.out.println(tmap2);

//        Student obj = new Student(2, "Raman", 34);
//        System.out.println(tmap2.containsKey(obj));  //true - in case you didn't compare on basis of name
//        System.out.println(tmap2.containsKey(obj));  //false - in case you compare on basis of all parameters

        Student obj = new Student(2, "Raman", 64);
        System.out.println(tmap2.containsKey(obj));  //false
    }
}
