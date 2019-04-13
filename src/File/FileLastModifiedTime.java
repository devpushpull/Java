package File;

import java.io.File;
import java.util.Date;

public class FileLastModifiedTime {
    public static void main(String[] args){
        File file = new File("E:/myjavafile.txt");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}
