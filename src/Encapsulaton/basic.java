package Encapsulaton;
class Student2{
    int age;
    String name;
    public void setData(){
        age=19;
        name="Sharma";
    }
    public void show(){
        System.out.println(name+" "+age);
    }
}
public class basic {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setData();
        obj.show();
    }
}
