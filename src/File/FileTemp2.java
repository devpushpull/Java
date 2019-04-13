package File;

import java.io.File;

public class FileTemp2 {
    public static void main(String[] args){
        File f = null;
        try{
            //创建临时文件
            f = File.createTempFile("tmp",".txt",new File("E:/"));
            //输出绝对路径
            System.out.println("文件路径："+f.getAbsolutePath());
            //终止后删除临时文件
            f.deleteOnExit();
            //创建临时文件
            f = File.createTempFile("temp",null,new File("F:/"));
            //终止后删除临时文件
            f.deleteOnExit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
