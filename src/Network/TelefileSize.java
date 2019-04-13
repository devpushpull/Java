/*
以下实例演示了如何获取远程文件的大小：
*/

package Network;

import java.net.URL;
import java.net.URLConnection;

public class TelefileSize {
    public static void main(String[] args) throws Exception{
        int size;
        URL url = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
        URLConnection conn = url.openConnection();
        size = conn.getContentLength();
        if(size<0){
            System.out.println("无法获取文件长度");
        }else{
            System.out.println("文件大小为："+size+" bytes");
            conn.getInputStream().close();
        }
    }
}
