import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Created by wangz on 2017/9/10.
 */
public class DayOfWeekAndMonthEnums {
    public static void main(String[] args) {
        dayOfWeek();
        getMondayDisplayName();
        month();
        getAugustDisplayName();
    }

    public static void dayOfWeek(){
        System.out.printf("%s%n", DayOfWeek.SATURDAY.plus(3));
    }
    public static void getMondayDisplayName(){
        DayOfWeek dow = DayOfWeek.MONDAY;
        Locale locale = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
    }
    public static void month(){
        System.out.printf("%d%n", Month.FEBRUARY.maxLength());
    }
    public static void getAugustDisplayName(){
        Month month = Month.AUGUST;
        Locale locale = Locale.getDefault();
        System.out.println(month.getDisplayName(TextStyle.FULL, locale));
        System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(month.getDisplayName(TextStyle.SHORT, locale));
    }
}
