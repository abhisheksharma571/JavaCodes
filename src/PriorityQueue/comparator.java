package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class comparator {
    private  static class Student{
        String name;
        Integer rollNo;
        Integer marks;
        String dob;
    }
    private static class StudentComparator implements Comparator<Student> {
        //overriding
        public int compare(Student s1, Student s2){
            if(s1.marks > s2.marks){
                return 1;
            }
            else if(s2.marks > s1.marks){
                return -1;
            }
            //you can exchange return -1 to return 1, to get max heap
            else {    //if marks of both will be same then it will compare on the basis of rollNo
                if(s1.rollNo > s2.rollNo){
                    return 1;
                }
                else if(s1.rollNo < s2.rollNo){
                    return -1;
                }
                else return 0;
            }
        }
    }
    public static void main(String[] args) {

        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(new StudentComparator());   //min heap on the basis of marks
        Student harsh = new Student();
        harsh.name = "Harsh";
        harsh.rollNo = 14;
        harsh.marks = 98;
        harsh.dob = "12-10-2001";
        Student raghav = new Student();
        raghav.name = "Raghav";
        raghav.rollNo = 18;
        raghav.marks = 98;
        raghav.dob = "11-10-2002";
        studentPriorityQueue.add(harsh);
        studentPriorityQueue.add(raghav);
        System.out.println(studentPriorityQueue.peek().name);
        System.out.println(studentPriorityQueue.peek().rollNo);
        System.out.println(studentPriorityQueue.peek().marks);

    }
}
