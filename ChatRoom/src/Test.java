import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by wangz on 2017/4/6.
 */
public class Test {
    public static void main(String[] args) {
        try {

            URL url = new URL("http", "localhost", 8080, "/ChatRoom/Test");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            OutputStream out = conn.getOutputStream();

            out.write("hello".getBytes());

            Thread.sleep(3000);

            out.write("world".getBytes());

            Thread.sleep(1000);
            System.out.println(conn.getResponseCode());
            System.out.println(conn.getResponseMessage());

            out.close();
            conn.getClass();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
