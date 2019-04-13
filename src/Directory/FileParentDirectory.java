package Directory;

import java.io.File;

public class FileParentDirectory {
    public static void main(String[] args){
        File file = new File("E:/file2/demo1.txt");
        String strDirectoryParent = file.getParent();
        System.out.println("文件的上级目录为："+strDirectoryParent);
    }
}
