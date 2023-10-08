package OOPsBasic;
//we have to declare the class outside main
//classes are passed by reference
public class passingClassToFunction {
    //Student class is created in another file but in same package-->Student.java
                //OR-->Creating a nw data type
//    public static class Student{
//        String name;
//        int rollNo;
//        double percent;
//    }
    public static void fun(Student x){
        System.out.println(x.name);
        return;
    }
    public static void change(Student s){
        s.name = "Sharma";
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhishek";
        //s1.rollNo = 12;     we cannot access private in another class
        System.out.println(s1.getRollNo());            //we can access private by using getter which is written in Student.java file

        System.out.println(s1.setRollNo(57));           //we can also change private by using setter

        s1.percent = 78.5;
        System.out.println(s1.name);
        change(s1);
        System.out.println(s1.name);
    }
}
