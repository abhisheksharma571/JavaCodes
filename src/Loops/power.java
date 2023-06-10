package Loops;
//given 2 numbers a and b. Find a raise to the power b.
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base: ");
        int a=sc.nextInt();
        System.out.print("Enter power: ");
        int b= sc.nextInt();
        int ans=1;
        for(int i=0;i<b;i++){
            ans*=a;
        }
        System.out.println("Anwer is "+ans);
    }
}
