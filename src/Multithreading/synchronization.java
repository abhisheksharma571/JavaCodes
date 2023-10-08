package Multithreading;
class Car implements Runnable{
    synchronized public void run(){      //this method will get executed by one thread at a time only
        try{
            System.out.println(Thread.currentThread().getName() + " Has started the parking lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Got into car to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Came back and park the car");
        }
        catch (Exception e){
            System.out.println("Some problem");
        }
    }
}
public class synchronization {
    public static void main(String[] args) {
        Car c = new Car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
