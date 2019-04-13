package File;

import java.io.File;

public class FileReName {
    public static void main(String[] args) throws Exception{
        File oldName = new File("E:/Hello.txt");
        oldName.createNewFile();
        File newName = new File("E:/World.txt");
        if(oldName.renameTo(newName)){
            System.out.println("文件已重命名!");
        }else{
            System.out.println("Error");
        }
    }
}
