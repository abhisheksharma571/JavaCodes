package Inheritance;
class Human1{
    private String name;       //private members of a class will not be participating in inheritance
    int age;
    Human1(){
        System.out.println("Human class constructor");           //constructor is also not inherited
    }
    void sleep(){
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1{            //single level inheritance
//    public Student1(){             //default constructor
//        //super()    //by default: calls constructor of its parent class
//    }
    void disp(){
        System.out.println("the age is :"+ age);
//        System.out.println("the name is :"+ name);
    }

}
public class basics2 {
    public static void main(String[] args) {
        Student1 st = new Student1();            //constructor call
        st.sleep();
        st.disp();

    }
}
