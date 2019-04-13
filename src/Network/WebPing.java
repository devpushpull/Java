package Network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class WebPing {
    public static void main(String[] args){
        try{
            InetAddress addr;
            Socket sock = new Socket("www.runoob.com",80);
            addr = sock.getInetAddress();
            System.out.println("连接到： "+addr);
        }catch(IOException e){
            System.out.println("无法连接到"+args[0]);
            System.out.println(e);
        }
    }
}
