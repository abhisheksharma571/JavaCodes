package Encapsulaton;
class Student{
    private int age;    //private members cannot use outside class, we can use it in same class
    private String name;
    public void setData(){
        age = 19;
        name = "Sharma";
    }
    public void show(){
        System.out.println(name+" "+age);
    }
}
public class privatekeyword {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setData();
        obj.show();
    }
}
