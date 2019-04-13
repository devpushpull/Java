package String;

import java.sql.SQLOutput;
import java.util.StringTokenizer;
public class SplitByStringTokenizer {
    public static void main(String[] args){
        String str = "ni chi fan le ma,wo chi guo le";
        StringTokenizer st1 = new StringTokenizer(str);
        System.out.println("-----通过空格分隔-----");
        while(st1.hasMoreElements()){
            System.out.println(st1.nextElement());
        }
        System.out.println("-----通过逗号分隔-----");
        StringTokenizer st2 = new StringTokenizer(str,",");
        while(st2.hasMoreElements()){
            System.out.println(st2.nextElement());
        }
    }
}
