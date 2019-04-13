package Directory;

import java.io.File;

public class TraverseDirectory {
    public static void main(String[] args) throws Exception{
        System.out.println("遍历目录");
        File file = new File("E:/File");
        visitAllDirectory(file);
    }
    static void visitAllDirectory(File dir){
        System.out.println(dir);
        if(dir.isDirectory()){
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                visitAllDirectory(new File(children[i]));
            }
        }
    }
}
