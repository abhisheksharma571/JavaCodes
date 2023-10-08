package Multithreading;
class Printing implements Runnable{
    public void run(){
        try{
            for(int i=0;i<2;i++){
                System.out.println("Focus is important");
                Thread.sleep(3000);
            }
        }
        catch (Exception e){
            System.out.println("Some problem");
        }
    }
}
public class joinAndIsAliveMethod {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");
        Printing p = new Printing();
        Thread t1 = new Thread(p);
        System.out.println(t1.isAlive());      //checks whether Thread is alive or not
        t1.start();
        System.out.println(t1.isAlive());
        t1.join();     //this particular main thread will not proceed until t1 task is completed
        System.out.println(t1.isAlive());

        System.out.println("Main thread finished the work");
    }
}
