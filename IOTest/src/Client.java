import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by wangz on 2017/4/3.
 * 可以肯定的是当输出流调用write方法时，确实时调用时就在传输数据了，并非等到close方法一起传输
 */
public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("172.19.13.59", 8888);
        OutputStream out = socket.getOutputStream();
        out.write("hello".getBytes());
//        out.close();
//        out = socket.getOutputStream();
        out.write(" world".getBytes());
//        Thread.sleep(10000);
//        //当线程sleep两秒以后，下面这个和上面的就不再同一个输出流里了
//        out.write(", jason".getBytes());
//        out.close();
//        socket.close();
    }
}
