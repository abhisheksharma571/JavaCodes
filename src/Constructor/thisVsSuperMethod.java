package Constructor;
class Student2{
    private String name;
    private int age;
    public Student2(){
        super();   //by default super method is included - it calls the parent class constructor
        System.out.println("Default constructor is called");
        name = "Rohan";
        age=18;
    }
    public Student2(String name){
        this();    //this method calls that class constructor which has same parameter as this method
        this.name = name;
        age = 19;
    }
    public Student2(String name, int age){
        this("Ram");
        this.name = name;
        this.age = age;
    }
    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class thisVsSuperMethod {
    public static void main(String[] args) {
        Student2 st1 = new Student2();
        st1.disp();

        Student2 st2 = new Student2("Rahul");
        st2.disp();

        Student2 st3 = new Student2("Rohit", 28);
        st3.disp();
    }
}