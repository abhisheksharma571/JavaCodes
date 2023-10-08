package Multithreading;

import java.util.Scanner;

//Thread creation by implementing Runnable interface
class Demo{

}
class Calc1 extends Demo implements Runnable{      //you can also extend to another class in this method, but it is not possible in previous method, so it is better user this method
    public void run(){      //the task you want to execute by thread, write in run method
        System.out.println("Calculation task started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println(res);
        System.out.println("Calculation task ended");

        System.out.println("--------------------------------");
    }
}
class Message1 implements Runnable{
    public void run(){
        System.out.println("Displaying important message task");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Focus is important so master skills");
                Thread.sleep(2000);    //you are forcing thread to sleep for 2 seconds
            }
        }
        catch (Exception e) {
            System.out.println("Some problem");
        }
        System.out.println("Displaying important message task ended");
    }
}
public class threadCreation3 {
    public static void main(String[] args) {
        System.out.println("Main method started");
        Calc1 c1 = new Calc1();
        Message1 m2 = new Message1();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }
}
