/*
以下实例演示了使用 clear() 方法来删除链表中的元素：
*/

package DataStructure;

import java.util.LinkedList;

public class LinkedListDeleteElement {
    public static void main(String[] args){
        LinkedList<String> Ilist = new LinkedList<String>();
        Ilist.add("1");
        Ilist.add("8");
        Ilist.add("6");
        Ilist.add("4");
        Ilist.add("5");
        System.out.println("删除元素前的链表"+Ilist);
        Ilist.subList(2,4).clear();
        System.out.println("删除指定元素后的链表"+Ilist);
    }
}
