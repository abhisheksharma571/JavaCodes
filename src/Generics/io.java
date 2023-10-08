package Generics;
class Students{
    private String name;
    private int age;
    private String city;
    public Students(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String toString(){     //data of the object will be printed, address
        return "Name :"+ name+ "| Age :"+ age +"| City :"+ city;
    }
}
public class io {
    public static void main(String[] args) {
        Students st1 = new Students("Virat",34,"Delhi");
        System.out.println(st1);

        Students st2 = new Students("Vivek",19,"Patna");
        System.out.println(st2);
    }
}
