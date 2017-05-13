import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by wangz on 2017/4/7.
 */
public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(52000);
            Socket socket = serverSocket.accept();

            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            //read a message from client side
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        byte[] buff = new byte[100];
                        while (in.read(buff) != -1){
                            System.out.println(new String(buff));
                            buff = new byte[100];
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            //send a message to client side
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        try{
                            byte[] buff;
                            Scanner scanner = new Scanner(System.in);
                            String message = scanner.nextLine();

                            buff = message.getBytes();
                            out.write(buff);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();

            while(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
