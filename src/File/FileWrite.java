package File;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Myfile.txt"));
            bw.write("Hello World!");
            bw.close();
            System.out.println("文件创建并写入成功！");
        }catch(IOException e){
        }
    }
}
