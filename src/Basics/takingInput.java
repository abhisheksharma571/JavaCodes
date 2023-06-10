package Basics;
import java.util.Scanner;
public class takingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //this will let you enter only one word
//        System.out.println("Enter your first name:");
//        String name=sc.next();
//        System.out.println("Your name is: "+ name);

        //this will let you enter whole sentence
        System.out.println("Enter your name:");
        String address=sc.nextLine();
        System.out.println("Your name is: "+ address);

        System.out.println("Enter your lucky number:");
        int num_1=sc.nextInt();
        System.out.println("Lucky number is: "+ num_1);
    }
}
