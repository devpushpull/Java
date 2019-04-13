package Directory;

import java.io.File;

public class DirectoryRecursive {
    public static void main(String[] args){
        String directories = "E:\\File\\a\\b\\c\\d\\e\\f\\g\\h";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = "+result);
    }
}
