import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by wangz on 2017/9/10.
 */
public class DateClasses {
    public static void main(String[] args) {
        getDayOfWeek();
        mothersDay();
        yearMonth();
        validateLeapYear();
        validateLeapYear(2018);
    }
    public static void getDayOfWeek(){
        DayOfWeek dow = LocalDate.of(2017, Month.SEPTEMBER, 17).getDayOfWeek();
        System.out.printf("%s%n",dow);
    }
    public static void mothersDay(){
        LocalDate date = LocalDate.of(2018, Month.MAY, 1);
        TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.SUNDAY);
        LocalDate mothersDay = date.with(adj).with(adj);
        System.out.printf("Mother's Day in 2018 is %s%n", mothersDay);
    }
    public static void yearMonth(){
        YearMonth date = YearMonth.now();
        System.out.printf("%s%n", date);
    }
    public static void validateLeapYear(){
        MonthDay date = MonthDay.of(Month.FEBRUARY, 29);
        boolean validLeapYear = date.isValidYear(2017);
        System.out.println("is 2017 a leap year? " + validLeapYear);
    }

    public static void validateLeapYear(int year) {
        boolean validLeapYear = Year.of(year).isLeap();
        System.out.printf("is %d a leap year? %b", year, validLeapYear);
    }
}
