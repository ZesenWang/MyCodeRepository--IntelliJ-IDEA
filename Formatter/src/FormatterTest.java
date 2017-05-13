import java.util.Formatter;

/**
 * Created by wangz on 2017/1/26.
 */
public class FormatterTest {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        f.format("%-15s end", "jason");
    }
}
