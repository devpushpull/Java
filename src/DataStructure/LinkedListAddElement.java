/*
以下实例演示了如何使用 LinkedList 类的 addFirst() 和 addLast() 方法在链表的开头和结尾添加元素：
*/

package DataStructure;

import java.util.LinkedList;

public class LinkedListAddElement {
    public static void main(String[] args){
        LinkedList<String> Ilist = new LinkedList<String>();
        Ilist.add("1");
        Ilist.add("2");
        Ilist.add("3");
        Ilist.add("4");
        Ilist.add("5");
        System.out.println("链表："+Ilist);
        Ilist.addFirst("0");
        System.out.println("在链表前添加元素："+Ilist);
        Ilist.addLast("6");
        System.out.println("在链表后添加元素："+Ilist);
    }
}
