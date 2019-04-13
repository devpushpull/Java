/*
以下实例演示了如何获取指定 URL 的响应头信息：
*/

package Network;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

public class NetworkDemo4 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.runoob.com");
        URLConnection conn = url.openConnection();
        Map headers = conn.getHeaderFields();
        Set<String> keys = headers.keySet();
        for(String key:keys){
            String value = conn.getHeaderField(key);
            System.out.println(key+"    "+value);
        }
        conn.getLastModified();
    }
}
