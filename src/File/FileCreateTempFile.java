package File;

import java.io.File;

public class FileCreateTempFile {
    public static void main(String[] args) throws Exception{
        File file = null;
        File dir = new File("E:/");
        file = File.createTempFile("haha",".txt",dir);
        System.out.println(file.getPath());
    }
}
