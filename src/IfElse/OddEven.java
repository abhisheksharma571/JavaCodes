package IfElse;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
//        if(num%2==0){
//            System.out.println("Number is Even");
//        }
//        else System.out.println("Number is Odd");
        String ans;
        ans=(num%2==0)?"even":"odd";
        System.out.println(ans);

    }
}
