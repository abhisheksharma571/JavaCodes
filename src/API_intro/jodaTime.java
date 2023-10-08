package API_intro;
//more efficient
import java.time.*;
public class jodaTime {
    public static void main(String[] args) {
        LocalDate date =LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        int hour = time.getHour();
        int min = time.getMinute();
        int sec =time.getSecond();
        int nano = time.getNano();

        System.out.println(day+ "/" + month+ "/" + year);
        System.out.println(hour+ ":" + min+ ":" + sec +":"+ nano);
    }
}
