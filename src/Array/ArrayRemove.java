package Array;

import java.util.ArrayList;

public class ArrayRemove {
    public static void main(String[] args) {
        ArrayList<String> objarray = new ArrayList<String>();
        objarray.clear();
        objarray.add(0,"第0个元素");
        objarray.add(1,"第1个元素");
        objarray.add(2,"第2个元素");
        System.out.println("删除元素前的数组："+objarray);
        objarray.remove(1);
        objarray.remove("第0个元素");
        System.out.println("删除元素后的数组："+objarray);
    }
}
