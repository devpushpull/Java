/*
以下实例演示了如何检测端口是否已经使用：
*/

package Network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class CheckPort {
    public static void main(String[] args){
        Socket skt;
        String host = "localhost";
        if(args.length>0){
            host = args[0];
        }
        for (int i = 0; i < 1024; i++) {
            try{
                System.out.println("查看端口："+i);
                skt = new Socket(host,i);
                System.out.println("端口 "+i+" 已被占用");
            }
            catch(UnknownHostException e){
                System.out.println("Exception Occured"+e);
            }
            catch(IOException e){
            }
        }
    }
}
