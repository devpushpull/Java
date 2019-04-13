package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayReverse {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("反转前的数组："+arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后的数组："+arrayList);
    }
}
