/*
以下实例演示了如何使用 LinkedList 类的 linkedlistname.getFirst() 和 linkedlistname.getLast() 来获取链表的第一个和最后一个元素：
*/

package DataStructure;

import java.util.LinkedList;

public class LinkedListGetElement1 {
    public static void main(String[] args){
        LinkedList<String> Ilist = new LinkedList<String>();
        Ilist.add("100");
        Ilist.add("200");
        Ilist.add("300");
        Ilist.add("400");
        Ilist.add("500");
        System.out.println("链表的第一个元素："+Ilist.getFirst());
        System.out.println("链表的组后一个元素："+Ilist.getLast());
    }
}
