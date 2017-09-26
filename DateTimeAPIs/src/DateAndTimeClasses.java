import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by wangz on 2017/9/10.
 */
public class DateAndTimeClasses {
    public static void main(String[] args) {
        getLocalTime();
        getLocalDateTime();
    }
    public static void getLocalTime(){
        LocalTime thisSec = LocalTime.now();
        System.out.println(thisSec);
    }
    public static void getLocalDateTime(){
        LocalDateTime date = LocalDateTime.now().plusMonths(10);
        System.out.println(date);
    }
}
