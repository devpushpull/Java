package Directory;

import java.io.File;

public class FileIsHidden {
    public static void main(String[] args){
        File file1 = new File("E:/File/File1/demo1.txt");
        System.out.println(file1.isHidden());
        File file2 = new File("E:/File/file2/demo2.txt");
        System.out.println(file2.isHidden());
    }
}
