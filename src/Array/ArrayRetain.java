package Array;

import java.util.ArrayList;

public class ArrayRetain {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<String>();
        al1.add(0,"common1");
        al1.add(1,"common2");
        al1.add(2,"notcommon");
        al2.add(0,"common1");
        al2.add(1,"common2");
        System.out.println("数组al1的元素："+al1);
        System.out.println("数组al2的元素："+al2);
        al1.retainAll(al2);
        System.out.println("数组al1与数组al2的交集："+al1);
    }
}
