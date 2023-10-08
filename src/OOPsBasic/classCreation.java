package OOPsBasic;

public class classCreation {
    //creating a new data type
    public static class Student{
        String name;
        int rollNo;
        double percent;
    }
    public static void main(String[] args) {
         class Car{
            String name;

            String type;
            int price;
        }
        Car c1 = new Car();
         c1.name = "alto";
        System.out.println(c1.name);

        Student x = new Student();           //declaration
        x.name = "Abhishek";                 //initialization
        x.rollNo = 12;
        x.percent = 78.5;

        Student s = new Student();
        s.name = "Rahul";
        s.percent = 84.3;
        s.rollNo = 32;

        System.out.println(x.name);
        System.out.println(s.percent);
        System.out.println(x.rollNo + 88);
    }
}
