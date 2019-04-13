package Network.Communication;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("启动服务器...");
            Socket s = ss.accept();
            System.out.println("客户端："+s.getInetAddress().getHostAddress()+"已连接到服务器");
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //读取客户端发来的消息
            String message = br.readLine();
            System.out.println("客户端："+message);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write(message+"\n");
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
