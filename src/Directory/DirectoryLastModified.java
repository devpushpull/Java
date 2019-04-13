package Directory;

import java.io.File;
import java.util.Date;

public class DirectoryLastModified {
    public static void main(String[] args){
        File file = new File("E:/File/File2");
        System.out.println("文件的最后修改时间："+new Date(file.lastModified()));
    }
}
