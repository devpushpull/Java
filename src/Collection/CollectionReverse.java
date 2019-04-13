/*
以下实例演示了如何使用 Collection 和 Listiterator 类的 listIterator() 和 collection.reverse() 方法来反转集合中的元素：
*/

package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CollectionReverse {
    public static void main(String[] args){
        String[] arry = {"A","B","C","D","E"};
        List arrylist = new ArrayList();
        for(int i = 0 ; i<arry.length ; i++)
            arrylist.add(arry[i]);
        ListIterator listiterator = arrylist.listIterator();
        System.out.println("反转前：");
        while(listiterator.hasNext())
            System.out.print(listiterator.next()+" ");
        System.out.println();
        Collections.reverse(arrylist);
        System.out.println("反转后：");
        listiterator = arrylist.listIterator();
        while(listiterator.hasNext())
            System.out.print(listiterator.next()+" ");
    }
}
