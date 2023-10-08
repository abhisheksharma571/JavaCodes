package Constructor;
class Student{
    private int age;
    private String name;

    Student(String name, int age){    //Constructor- not have return type, and it has same name as class - initializes the value during the object creation
        this.name = name;
        this.age = age;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setAge(int age) {   //setters
//        this.age = age;
//    }
    public String getName() {
        return name;
    }
    public int getAge() {        //getters
        return age;
    }
}
public class basic {
    public static void main(String[] args) {
        Student st = new Student("Abhishek",20);   //Constructor call and value passed - during object creation
//        st.setAge(20);
//        st.setName("Abhishek");

        int age = st.getAge();
        System.out.println(age);

        String name = st.getName();
        System.out.println(name);
    }
}