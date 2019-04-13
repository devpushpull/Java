package Network;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.text.SimpleDateFormat;

public class NetworkDemo2 {
    public static void main(String[] args) throws Exception{
        URL u = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
        URLConnection uc = u.openConnection();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        System.out.println("newlogo.png最后的修改时间为："+ft.format(new Date(timestamp)));
    }
}
