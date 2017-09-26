import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by wangz on 2017/8/25.
 */
public class SetUpTheProperties {
    public static void main(String[] args) throws IOException {
        Properties defaultProps = new Properties();
        FileOutputStream out = null;
        try {
            defaultProps.setProperty("name", "Jason W.");
            defaultProps.setProperty("age", "22");
            out = new FileOutputStream("defaultProperties");
            defaultProps.store(out, "----No Comment----");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(out != null){
                out.close();
            }
        }
    }
}
