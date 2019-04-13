package Directory;

import java.io.File;

public class DirectoryIsEmpty {
    public static void main(String[] args){
        File file = new File("E:/File/File1");
        if(file.isDirectory()){
            if(file.list().length>0){
                System.out.println(file.getAbsolutePath()+":目录不为空！");
            }else{
                System.out.println(file.getAbsolutePath()+"目录为空！");
            }
        }else{
            System.out.println("这不是目录");
        }
    }
}
