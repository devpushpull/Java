package File;

import java.io.File;

public class FileReadOnly {
    public static void main(String[] args) throws Exception{
        File ro = new File("E:/ro.txt");
        ro.createNewFile();
        System.out.println(ro.setReadOnly());
        System.out.println(ro.canWrite());
    }
}
