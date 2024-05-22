package Multithreading;

public class daemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running.");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        daemonThread daemonThread = new daemonThread();
        daemonThread.setDaemon(true);  // Set the thread as daemon
        daemonThread.start();  // Start the thread

        try {
            Thread.sleep(3000);  // Main thread sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is finished.");
        // When the main thread finishes, the daemon thread will terminate.
    }
}

