/*
以下实例演示了如何遍历从Collection接口延伸出的List、Set和以键值对形式作存储的Map类型的集合，以下我们分别使用了普通for，增强型的 for ，iterator 等方式来遍历集合：
*/

package Collection;

import java.util.*;

public class CollectionTraverse {
    public static void main(String[] args){
        setTest();
        listTest();
    }
    private static void setTest(){
        Set<String> set = new HashSet<String>();
        set.add("JAVA");
        set.add("C");
        set.add("C++");
        set.add("JAVA");
        set.add("JAVASCRIPT");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println(value);
        }
        for (String s:set) {
            System.out.println(s);
        }
    }
    private static void listTest(){
        List<String> list = new ArrayList<String>();
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.runoob.com");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String value= it.next();
            System.out.println(value);
        }
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            System.out.println(value);
        }
        for (String value:list) {
            System.out.println(value);
        }
    }
}
