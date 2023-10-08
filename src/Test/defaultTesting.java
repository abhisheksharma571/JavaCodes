package Test;

import OOPsBasic.Student;

public class defaultTesting {
    public static void main(String[] args) {
        Student s = new Student();
        //s.name = "Abhishek";          //default can not access in different package
        s.percent = 92.8;               //public can access in different packages
    }
}
