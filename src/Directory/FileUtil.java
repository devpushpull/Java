package Directory;

import java.io.File;
import java.io.IOException;

public class FileUtil {
    public static void main(String[] args) throws IOException {
        showDir(0,new File("e:\\File"));
    }
    static void showDir(int indent, File file) throws IOException {
        for (int i = 1; i < indent; i++)
            System.out.print('-');
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
                showDir(indent + 4, files[i]);
        }
    }
}
