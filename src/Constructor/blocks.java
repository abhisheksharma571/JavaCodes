package Constructor;
public class blocks {
    static int age;
    static {            //static variables and static block execute before main method at the time of class loading
        System.out.println("Static block");
        age=17;
    }
    static void disp(){          //we have to call static method to execute
        System.out.println("Disp static method");
        System.out.println(age);
    }
    public static void main(String[] args) {         //main method executed by JVM
        System.out.println("Main method");
        disp();
    }
}
