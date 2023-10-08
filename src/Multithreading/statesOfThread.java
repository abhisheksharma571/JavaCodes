package Multithreading;
class Demo1 implements Runnable{
    public void run(){
        System.out.println("Child thread executing");
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println("Some problem");
        }
        System.out.println("Child thread task completed");
    }
}
public class statesOfThread {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Demo1 d = new Demo1();
        Thread t1 = new Thread(d);
        t1.start();
        //after start(), thread goes from New state to Runnable state/Ready state and when task is executing, it is in Running state and when task is completed, it is in Dead state
        //But while in Running state if there is sleep(), wait(), join(), etc, it goes into Blocked state/Waiting state, comes back after completing the condition
    }
}
