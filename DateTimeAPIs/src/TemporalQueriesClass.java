import java.time.*;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;

/**
 * Created by wangz on 2017/9/12.
 */
public class TemporalQueriesClass {
    public static void main(String[] args) {
        precision();
    }
    public static void precision(){
        TemporalQuery query = TemporalQueries.precision();
        System.out.printf("LocalDate precision is %s%n",
                LocalDate.now().query(query));
        System.out.printf("LocalDateTime precision is %s%n",
                LocalDateTime.now().query(query));
        System.out.printf("Year precision is %s%n",
                Year.now().query(query));
        System.out.printf("YearMonth precision is %s%n",
                YearMonth.now().query(query));
        System.out.printf("Instant precision is %s%n",
                Instant.now().query(query));
    }
}
