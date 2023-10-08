package Encapsulaton;
class Student3{
    private int age;
    private String name;
    public void setData1(int age){
        this.age = age;           //this keyword referring to the current object, it tells that this is instance variable(not local variable)
    }
    public void setData2(String name){
        this.name = name;
    }
    public void show(){
        System.out.println(name+" "+age);
    }
}
public class thiskeyword {
    public static void main(String[] args) {
        Student3 obj = new Student3();
        Student3 obj1 = new Student3();
        obj.setData1(20);
        obj1.setData1(25);
        obj.setData2("Abhishek");
        obj1.setData2("Sharma");
        obj.show();
        obj1.show();
    }
}