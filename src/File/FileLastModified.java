package File;

import java.io.File;
import java.util.Date;

public class FileLastModified {
    public static void main(String[] args) throws Exception{
        File fileToChange = new File("E:/myjavafile.txt");
        fileToChange.createNewFile();
        Date fileTime = new Date(fileToChange.lastModified());
        System.out.println(fileTime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        fileTime = new Date(fileToChange.lastModified());
        System.out.println(fileTime.toString());
    }
}
