package Constructor;

public class staticKeyword {
    static int a;   //static variable and static block will execute before main method
    static {
        System.out.println("Static block");
        a=10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
