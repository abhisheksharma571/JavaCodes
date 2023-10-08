package Multithreading;
//Thread Creation by Extending Thread class
class MyThread extends Thread{
    public void run(){    //the task you want to execute by thread, write in run method
        System.out.println("Child thread");
    }
}
public class threadCreation {
    public static void main(String[] args) {
        System.out.println("Main thread");

        MyThread t = new MyThread();   //creating Object of MyThread means you are creating Object of Thread because MyThread inherits Thread
        t.start();      //You can not directly call run method because it will work as single thread if call it, you can call start method which include run method

    }
}
