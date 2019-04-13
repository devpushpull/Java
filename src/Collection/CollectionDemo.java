/*
以下实例演示了在集合类中添加不同类型的元素：
*/

package Collection;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args){
        List lnkList = new LinkedList();
        lnkList.add("element1");
        lnkList.add("element2");
        lnkList.add("element3");
        lnkList.add("element4");
        displayAll(lnkList);
        List aryLst = new ArrayList();
        aryLst.add("x");
        aryLst.add("y");
        aryLst.add("z");
        aryLst.add("w");
        displayAll(aryLst);
        Set hashSet = new HashSet();
        hashSet.add("set1");
        hashSet.add("set2");
        hashSet.add("set3");
        hashSet.add("set4");
        displayAll(hashSet);
        SortedSet treeSet = new TreeSet();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        displayAll(treeSet);
        LinkedHashSet lnkHashSet = new LinkedHashSet();
        lnkHashSet.add("one");
        lnkHashSet.add("two");
        lnkHashSet.add("three");
        lnkHashSet.add("four");
        displayAll(lnkHashSet);
        Map map1 = new HashMap();
        map1.put("key1","J");
        map1.put("key2","K");
        map1.put("key3","L");
        map1.put("key4","M");
        displayAll(map1.keySet());
        displayAll(map1.values());
        SortedMap map2 = new TreeMap();
        map2.put("key1","JJ");
        map2.put("key2","KK");
        map2.put("key3","LL");
        map2.put("key4","MM");
        displayAll(map2.keySet());
        displayAll(map2.values());
        LinkedHashMap map3 = new LinkedHashMap();
        map3.put("key1","JJJ");
        map3.put("key2","KKK");
        map3.put("key3","LLL");
        map3.put("key4","MMM");
        displayAll(map3.keySet());
        displayAll(map3.values());
    }
    static void displayAll(Collection col){
        Iterator it = col.iterator();
        while(it.hasNext()){
            String str = (String)it.next();
            System.out.print(str+" ");
        }
        System.out.println();
    }
}
