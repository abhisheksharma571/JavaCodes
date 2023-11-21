package shutdownmycomputer;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class shutdown {
    public static void main(String[] args) {
        // Set the time you want to shutdown the computer
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 2); 
        calendar.set(Calendar.MINUTE, 44);
        calendar.set(Calendar.SECOND, 3);
        Date time = calendar.getTime();

        Timer timer = new Timer();
        timer.schedule(new ShutDownTask(), time);
    }

    static class ShutDownTask extends TimerTask {
        public void run() {
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("shutdown -s -t 0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}