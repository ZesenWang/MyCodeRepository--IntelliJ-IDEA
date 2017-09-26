import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * Created by wangz on 2017/9/10.
 */
public class TimeZoneAndOffsetClasses {
    public static void main(String[] args) {
        getZoneAndOffset();
    }
    public static void getZoneAndOffset(){
        ZoneId localZone = ZoneId.systemDefault();
        LocalDateTime dt = LocalDateTime.now();
        ZonedDateTime zdt = dt.atZone(localZone);
        ZoneOffset offset = zdt.getOffset();
        System.out.printf("%s UTC+%d%n", localZone, offset.getTotalSeconds() / (60 * 60));

    }
}
