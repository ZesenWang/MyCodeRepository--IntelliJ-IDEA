import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by wangz on 2017/9/12.
 */
public class TemporalAdjustersClass {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.printf("5 months ago before %s is %s%n", date, date.withMonth(4));

        TemporalAdjuster firstFriday = TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY);
        System.out.printf("First Friday in %s is %s%n", date, date.with(firstFriday));

        DayOfWeek dow = date.getDayOfWeek();
        System.out.printf("It is %s today%n", dow);
        TemporalAdjuster nextDOW = TemporalAdjusters.next(dow);
        System.out.printf("Next %s is %s%n", dow, date.with(nextDOW));
    }
}
