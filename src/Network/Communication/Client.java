package Network.Communication;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args){
        try{
            Socket s = new Socket("http://127.0.0.1",8888);
            //构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            //向服务器发送一条消息
            bw.write("测试客户端和服务器通信，服务器接收到消息返回到客户端\n");
            bw.flush();
            BufferedReader  br = new BufferedReader(new InputStreamReader(is));
            String message = br.readLine();
            System.out.println("服务器："+message);
        }
        catch(UnknownHostException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
