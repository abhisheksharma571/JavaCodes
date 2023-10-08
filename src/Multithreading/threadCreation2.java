package Multithreading;
//Thread Creation by Extending Thread class

import java.util.Scanner;
class Calc extends Thread{
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
class Message extends Thread{
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

public class threadCreation2 {
    public static void main(String[] args) {
        System.out.println("Main method started");
        Calc t1 = new Calc();
        Message t2 = new Message();
        t1.start();
        t2.start();
    }
}
