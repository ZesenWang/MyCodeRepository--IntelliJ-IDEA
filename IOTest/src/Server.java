import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by wangz on 2017/4/3.+
 * 如果客户端打开了一次输出流，而服务端打开了两次输入流，竟然都能正常执行然后退出。
 * 如果客户端打开了两次输出流，服务器端打开两次，两端都报socket is closed异常
 *
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        byte[] message = new byte[100];
        //这里的read返回-1不代表当前流的结束，而是对方在代码中调用了close方法
        while(in.read(message) != -1){
            System.out.println(new String(message));
            message = new byte[100];
        }
        in.close();
//        in = socket.getInputStream();
//        byte[] message2 = new byte[100];
//        while(in.read(message2) != -1){
//            System.out.println(new String(message2));
//        }
//        in.close();
        socket.close();
        serverSocket.close();
    }
}
