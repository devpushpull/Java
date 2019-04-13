package File;

import java.io.File;

public class FileCompare {
    public static void main(String[] args) throws Exception{
        File file1 = new File("E:/File/File1/demo1.txt");
        file1.createNewFile();
        File file2 = new File("E:/File/file2/demo1.txt");
        file2.createNewFile();
        if(file1.compareTo(file2)==0){
            System.out.println("文件路径一致");
        }else{
            System.out.println("文件路径不一致");
        }
    }
}
