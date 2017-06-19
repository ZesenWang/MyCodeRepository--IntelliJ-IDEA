import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by wangz on 2017/6/3.
 */
public class PathTest {
    public static void main(String[] args) {
        Path path = Paths.get("C:tmp\\foo\\foo2");
        System.out.printf("%s%n", path.getRoot());
        System.out.printf("%s%n",path.getFileName());
        System.out.printf("%s%n",path.getName(0));
        System.out.printf("%s%n",path.getNameCount());
        System.out.printf("%s%n",path.getParent());
        System.out.printf("%s%n",path.subpath(0,2));
    }
}
