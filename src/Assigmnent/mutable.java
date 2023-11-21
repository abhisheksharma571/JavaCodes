package Assigmnent;

public class mutable {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        System.out.println("String initially :"+str);
        str.append("Hello");
        System.out.println("String has been changed: "+str);
        str.append(" World");
        System.out.println("String has been changed: "+str);
    }
}
