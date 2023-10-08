package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class finallyBlock {
    public static void main(String[] args) {
        int num =0;
        Scanner sc = new Scanner(System.in);
        try{     //try block needs catch block or finally block or both
            num = sc.nextInt();
        }
//        catch (InputMismatchException e){
//            System.out.println("Enter a number");
//        }
        finally{       //run definitely
            sc.close();
            System.out.println("Resource closed");
        }
        System.out.println(num);
    }
}