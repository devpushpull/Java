package Network;

import java.io.IOException;
import java.net.URL;

public class NetworkDemo5 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.runoob.com/html/html-tutorial.html");
        System.out.println("URL是："+url);
        System.out.println("协议是："+url.getProtocol());
        System.out.println("文件名是："+url.getFile());
        System.out.println("主机名是："+url.getHost());
        System.out.println("路径是："+url.getPath());
        System.out.println("端口号是："+url.getPort());
        System.out.println("默认端口号是："+url.getDefaultPort());
    }
}
