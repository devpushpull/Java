/*
以下实例演示了如何使用 Collection 类的 collection.remove() 方法来删除集合中的指定的元素：
*/

package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveAssighElement {
    public static void main(String[] args){
        System.out.println("集合实例\n");
        int size;
        HashSet collection = new HashSet();
        String str1 = "Yellow",str2 = "While",str3 = "Green",str4 = "Blue";
        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        System.out.println("集合数据：");
        iterator = collection.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();
        collection.remove(str2);
        System.out.println("删除["+str2+"]之后");
        System.out.println("现在的集合数据是：");
        iterator = collection.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();
        size = collection.size();
        System.out.println("集合的大小："+size);
    }
}
