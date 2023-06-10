package IfElse;
import java.util.Scanner;
public class evenAndDivBy3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number:");
        int value=sc.nextInt();
        if(value%2==0 && value%3==0){
            System.out.println("It is even and divisible by 3");
        }
        else {
            if(value%2==0){
                System.out.println("It is even but not divisible by 3");
            }
            else System.out.println("It is not even nor divisible by 3");
        }

    }
}
