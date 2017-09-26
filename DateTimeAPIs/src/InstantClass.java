import java.time.Instant;

/**
 * Created by wangz on 2017/9/10.
 * represents the start of a nanosecond on the timeline.
 */
public class InstantClass {
    public static void main(String[] args) {
        Instant timeStamp = Instant.now();
        System.out.println(Instant.MIN);
        System.out.println(Instant.MAX);
        System.out.println(timeStamp.toString());
    }
}
