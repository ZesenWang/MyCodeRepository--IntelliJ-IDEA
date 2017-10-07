import java.lang.annotation.Documented;

/**
 * Created by wangz on 2017/8/23.
 */
//Note: To make the information in
// @ClassPreamble appear in Javadoc-generated documentation
//you must annotate the @ClassPreamble definition
// with the @Documented annotation:
@Documented
public @interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String[] reviewers();
}

