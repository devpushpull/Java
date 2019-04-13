package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy/MM/dd/ HH:mm:ss a");
        Date date = new Date();
        System.out.println(sdf.format(date));
    }
}
