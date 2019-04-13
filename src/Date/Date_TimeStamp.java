package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_TimeStamp {
    public static void main(String[] args){
        Long timeStamp = System.currentTimeMillis();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
        String sd1 = sdf1.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("格式化结果1："+sd1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
        String sd2 = sdf2.format(Long.parseLong(String.valueOf(timeStamp)));
        System.out.println("格式化结果2："+sd2);
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
        String sd3 = sdf3.format(timeStamp);
        System.out.println("格式化结果3："+sd3);
    }
}
