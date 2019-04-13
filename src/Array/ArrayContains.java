package Array;

import java.util.ArrayList;

public class ArrayContains {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<String>();
        al1.add(0,"common1");
        al1.add(1,"common2");
        al2.add(0,"common1");
        al2.add(1,"common2");
        al2.add(2,"notcommon");
        System.out.println("数组al1的元素："+al1);
        System.out.println("数组al2的元素："+al2);
        System.out.println("数组al1是否包含字符串common2:"+al1.contains("common2"));
        System.out.println("数组al2是否包含数组al1:"+al2.contains(al1));
    }
}
