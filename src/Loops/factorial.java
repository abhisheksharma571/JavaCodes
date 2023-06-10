package Loops;
//print the first n factorial numbers
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        System.out.println("Factorial is "+f);

    }

}
