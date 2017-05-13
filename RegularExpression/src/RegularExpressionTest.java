import java.lang.reflect.Method;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wangz on 2017/1/29.
 */
public class RegularExpressionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Formatter formatter = new Formatter(System.out);
        while(true){
            formatter.format("Regex:");
            //set up a flag to enable case-insensitive
            //Pattern regex = Pattern.compile(scanner.nextLine(), Pattern.CASE_INSENSITIVE);
            Pattern regex = Pattern.compile(scanner.nextLine());
            formatter.format("Input String:");
            String input = scanner.nextLine();
            //在硬编码的正则表达式中，"\"需要写成"\\",the method below returns false
            //System.out.println(Pattern.matches("\\d","1a"));
            Matcher matcher = regex.matcher(input);
            boolean isFound = false;
            while(matcher.find()){
                formatter.format("I found text %s starting at %d and ending at %d%n",
                        matcher.group(), matcher.start(), matcher.end());
                isFound = true;
            }

            if(!isFound){
                formatter.format("no match found%n");
            }
        }
    }
}
