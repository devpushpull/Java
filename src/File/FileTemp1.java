package File;

import java.io.*;

public class FileTemp1 {
    public static void main(String[] args) throws Exception{
        File temp = File.createTempFile("testbmp",".txt");
        System.out.println("文件路径："+temp.getAbsolutePath());
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("临时文件创建成功:");
        out.close();
    }
}
