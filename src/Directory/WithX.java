package Directory;

import java.io.*;

public class WithX {
    public static void main(String[] args){
        File dir = new File("E:/File");
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("f");
            }
        };
        String[] children = dir.list(filter);
        if(children == null){
            System.out.println("目录不存在或它不是一个目录");
        }else{
            for (int i = 0; i < children.length; i++) {
                System.out.println(children[i]);
            }
        }
    }
}
