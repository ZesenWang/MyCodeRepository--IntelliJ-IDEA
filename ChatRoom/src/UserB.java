import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

/**
 * Created by wangz on 2017/4/7.
 */
public class UserB {
    public static void main(String[] args) throws InterruptedException {
        try {
            Socket socket = new Socket("localhost", 52000);

            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            Boolean isExit = new Boolean(false);

            UserB userB = new UserB();
            //userB.notifyAll();

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
            //System.out.println("here2");
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        System.out.println("I'm in loop");
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
            //System.out.println("here3");
            while (!isExit){
                userB.wait();
            };

            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
