import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by wangz on 2017/4/2.
 */
public class ConcurUDPServer implements Runnable {

    @Override
    public void run() {
        process();
        sendResponse();
    }

    final int buffSize = 500;
    DatagramSocket sock;
    String request;
    String response;
    InetAddress clientAddr;
    int clientPort;

    ConcurUDPServer(DatagramSocket socket){
        sock = socket;
    }
    void getRequest(){
        byte[] recvBuff = new byte[buffSize];
        DatagramPacket recvPacket = new DatagramPacket(recvBuff, buffSize);
        //todo will the code proceed when the exception occur?
        try {
            sock.receive(recvPacket);
        } catch (IOException e) {
            e.printStackTrace();
        }
        recvBuff = recvPacket.getData();
        request = new String(recvBuff);
        clientAddr = recvPacket.getAddress();
        clientPort = recvPacket.getPort();
    }
    void process(){
        System.out.println(request);
        response = request;
    }
    void sendResponse() {
        byte[] sendBuff = new byte[buffSize];
        sendBuff = response.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendBuff, sendBuff.length, clientAddr, clientPort);
        try {
            sock.send(sendPacket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SocketException {
        final int port = 8888;
        DatagramSocket sock = new DatagramSocket(port);

        while(true){
            ConcurUDPServer server = new ConcurUDPServer(sock);
            server.getRequest();
            Thread thread = new Thread(server);
            thread.start();
        }
    }
}
