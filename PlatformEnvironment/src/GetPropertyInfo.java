import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by wangz on 2017/8/25.
 */
public class GetPropertyInfo {
    public static void main(String[] args) {
        Properties defaultProps = new Properties();
        try (FileInputStream in = new FileInputStream("defaultProperties")) {
            defaultProps.load(in);
            System.out.println("name exists? " + defaultProps.containsKey("name"));
            defaultProps.list(System.out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
