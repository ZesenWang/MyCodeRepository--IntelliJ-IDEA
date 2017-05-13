import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by wangz on 2016/11/14.
 */
public class CalendarTest {
    public static void main(String[] args){
        Calendar rightNow = Calendar.getInstance();
        //System.out.println(rightNow.toString());
        Calendar someDay = new GregorianCalendar(2016,10,14);
        System.out.println(rightNow.compareTo(someDay));
    }
}
