package Directory;

import java.io.*;
import org.apache.commons.io.FileUtils;

public class DirectorySize {
    public static void main(String[] args){
        long size = FileUtils.sizeOfDirectory(new File("E:/File"));
        System.out.println("Size:"+size+"bytes");
    }
}
