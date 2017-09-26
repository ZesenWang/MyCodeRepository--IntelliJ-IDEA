import com.sun.istack.internal.NotNull;
import java.lang.annotation.*;
/**
 * Created by wangz on 2017/8/23.
 */
@ClassPreamble(
        author = "Jason",
        date = "23/8/2017",
        currentRevision = 1,
        reviewers = {"Alice", "Bob", "Cindy"}
)
public class TestClassPreamble {
    /*
     *@deprecated
     * put explanations here
     */
    @Deprecated
    static void deprecatedMethod(){}

    @SuppressWarnings("deprecation")
    static void useDeprecatedMethod(){
        TestClassPreamble.deprecatedMethod();
    }
    //This annotation can only be used by field
    @ApplyToOtherAnnotations
    public String annotatedField;

    public static void main(String[] args) {
        TestClassPreamble.deprecatedMethod();

        //@ApplyToOtherAnnotations
        int cannotBeAnnotated;
    }
}
