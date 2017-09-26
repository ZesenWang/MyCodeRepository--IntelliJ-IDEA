import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Created by wangz on 2017/9/11.
 */
public class ParsingAndFormatting {
    public static void main(String[] args) {
        parsing();
        formatting();
    }
    public static void parsing(){
        //这里要用所在地的语言输入日期
        String input = "九月 12 2017";
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
            LocalDate date = LocalDate.parse(input, formatter);
            System.out.println(date);
        }catch (DateTimeParseException exc) {
            System.out.printf("%s is not parsable!%n", input);
            throw exc;      // Rethrow the exception.
        }
    }
    public static void formatting(){
        LocalDateTime dateTime = LocalDateTime.of(2017, Month.SEPTEMBER, 12, 10, 48, 50);
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy hh:mm a");
            String out = dateTime.format(formatter);
            System.out.println(out);
        } catch (DateTimeException exc) {
            System.out.printf("%s can't be formatted!%n", dateTime);
            throw exc;
        }
    }
}
