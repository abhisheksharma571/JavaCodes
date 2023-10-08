package OOPsBasic;

public class constructorClass {
    public static void main(String[] args) {
        System.out.println(constructor.getNoOfStudents());
        constructor c1 = new constructor("Abhishek", 34, 92.8);
        System.out.println(c1.name);
        System.out.println(c1.rno);
        System.out.println(c1.percent);
        System.out.println(c1.getNoOfStudents());

        constructor c2 = new constructor("Rahul",45,66.6);
       // c2.schoolName = "DPS";         //Cannot assign a value to final variable 'schoolName'
        System.out.println(c2.name);
        System.out.println(c2.rno);
        System.out.println(c2.percent);
        System.out.println(c2.schoolName);
        System.out.println(c2.getNoOfStudents());
    }
}
