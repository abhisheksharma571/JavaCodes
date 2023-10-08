package ExceptionHandling;

import java.util.Scanner;

public class tryWithResources {
    public static void main(String[] args) {
        int num =0;
        //try with resource
        try(Scanner sc = new Scanner(System.in)){     //even if exception throws or not, resource will definitely close
            num = sc.nextInt();
        }
        System.out.println(num);
    }
}