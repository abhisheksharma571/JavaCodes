package Inheritance;
class Human{   //Super class/Base class/Parent class-class from which properties inherited
    int age;
    void sleep(){
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student extends Human{     //Child class/Sub class/Derived class-class in which properties get inherited
    //extends keyword is used to create a relation between two classes

}
public class basics {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();    //Human class is related with Student class that's why we are able to call sleep() method by object of Student class, this is inheritance(by the use of extends keyword)

    }
}
