import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by wangz on 2017/4/3.
 */
public class UserA {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http","localhost", 8080, "/ChatRoom/Server");

        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.connect();

            System.out.println("here0");
            OutputStream out = connection.getOutputStream();
            out.write("hello from client".getBytes());

            System.out.println("here1");
            //todo the codes were stuck at here
            InputStream in = connection.getInputStream();

            Boolean isExit = new Boolean(false);

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
                    } finally {
                        try {
                            System.out.println(connection.getResponseCode());
                            System.out.println(connection.getResponseMessage());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
            System.out.println("here2");
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
                        } finally {
                            try {
                                System.out.println(connection.getResponseCode());
                                System.out.println(connection.getResponseMessage());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }).start();
            System.out.println("here3");
            while (!isExit);

            in.close();
            out.close();
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
