/*
以下实例演示了如何使用 Collections 类的 replaceAll() 来替换List中所有的指定元素：
*/

package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReplaceElement {
    public static void main(String[] args){
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("list替换前的内容："+list);
        Collections.replaceAll(list,"one","hundrea");
        System.out.println("list替换后的内容："+list);
    }
}
