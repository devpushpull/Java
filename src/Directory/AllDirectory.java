package Directory;

import java.io.*;

public class AllDirectory {
    public static void main(String[] args){
        File dir = new File("E:/File");
        File[] files = dir.listFiles();
        FileFilter fileFilter = new FileFilter(){
            public boolean accept(File file){
                return file.isDirectory();
            }
        };
        files = dir.listFiles(fileFilter);
        System.out.println(files.length);
        if(files.length == 0){
            System.out.println("目录不存在或它不是一个目录");
        }else{
            for (int i = 0; i < files.length; i++) {
                File filename = files[i];
                System.out.println(filename);
            }
        }
    }
}
