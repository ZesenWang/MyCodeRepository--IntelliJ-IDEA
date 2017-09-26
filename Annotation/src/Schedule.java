import java.lang.annotation.Repeatable;

/**
 * Created by wangz on 2017/8/23.
 */
@Repeatable(Schedules.class)
public @interface Schedule {
    String dayOfMonth() default "first";
    String dayOfWeek() default "Mon";
    int hour() default 12;
}