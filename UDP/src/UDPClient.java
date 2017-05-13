import java.io.IOException;
import java.net.*;

/**
 * Created by wangz on 2017/4/2.
 */
public class UDPClient {
    final int buffSize = 500;
    DatagramSocket sock;
    String request;
    String response;
    InetAddress servAddr;
    int servPort;

    UDPClient(DatagramSocket s, String sName, int sPort) throws UnknownHostException{
        sock = s;
        servAddr = InetAddress.getByName(sName);
        servPort = sPort;
    }
    void makeRequest(){
        request = "hello";
    }
    void sendRequest(){
        try{
            byte[] sendBuff = new byte[buffSize];
            sendBuff = request.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendBuff, sendBuff.length, servAddr, servPort);
            sock.send(sendPacket);
        } catch (SocketException e){
            System.err.println("SocketException in sendRequest");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void getResponse(){
        try{
            byte[] recvBuff = new byte[buffSize];
            //todo what does buffSize mean ?
            DatagramPacket recvPacket = new DatagramPacket(recvBuff, buffSize);
            sock.receive(recvPacket);
            //todo Doesn't byte array already store in recvBuff?
            recvBuff = recvPacket.getData();
            response = new String(recvBuff, 0, recvBuff.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void useResponse(){
        System.out.println(response);
    }
    void close(){
        sock.close();
    }

    public static void main(String[] args) throws SocketException, UnknownHostException {
        final int servPort = 8888;
        final String servName = "172.19.6.252";
        DatagramSocket sock = new DatagramSocket();
        UDPClient client = new UDPClient(sock, servName, servPort);
        client.makeRequest();
        client.sendRequest();
        client.getResponse();
        client.useResponse();
        client.close();
    }
}
