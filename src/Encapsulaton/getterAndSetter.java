package Encapsulaton;
class Student4{
    private int age;
    private String name;

    public int getAge() {        //getters
        return age;
    }

    public void setAge(int age) {   //setters
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class getterAndSetter {
    public static void main(String[] args) {
        Student4 obj = new Student4();
        Student4 obj1 = new Student4();
        obj.setAge(20);
        obj1.setAge(25);
        obj.setName("Abhishek");
        obj1.setName("Sharma");
        int stud1Age = obj.getAge();
        int stud2Age = obj1.getAge();
        String stud1Name = obj.getName();
        String stud2Name = obj1.getName();
        System.out.println(stud1Age+" "+stud1Name);
        System.out.println(stud2Age+" "+stud2Name);
    }
}