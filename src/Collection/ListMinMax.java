package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMinMax {
    public static void main(String[] args){
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("list:"+list);
        System.out.println("list的最大值："+ Collections.max(list));
        System.out.println("list中的最小值："+Collections.min(list));
    }
}
