package Multithreading;

import java.util.Scanner;

class MyThread1 extends Thread{
    public void run(){
       String tName = Thread.currentThread().getName();
       if(tName.equals("CALC")){
           calc();
       }
       else importantMsg();
    }
    public void calc(){
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
    public void importantMsg(){
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

public class multipleTaskInSingleRunMethod {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();

        thread1.setName("CALC");
        thread2.setName("PRINT");

        thread1.start();
        thread2.start();
    }
}
