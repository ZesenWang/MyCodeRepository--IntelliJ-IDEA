/**
 * Created by wangz on 2017/9/26.
 */
public class Varargs {
    public static void countArgs(int... args) {
        System.out.println(args.length);
    }

    public static void main(String[] args) {
        countArgs(1, 2, 3);

        System.out.printf("%d");
    }
}
