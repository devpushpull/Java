package File;

import java.io.File;

public class FileExists {
    public static void main(String[] args){
        File file = new File("E:/ro.txt");
        System.out.println(file.exists());
    }
}
