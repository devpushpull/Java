/*
以下实例演示了使用 linkedlistname.indexof(element) 和 linkedlistname.Lastindexof(elementname) 方法在链表中获取元素第一次和最后一次出现的位置：
*/

package DataStructure;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args){
        LinkedList Ilist = new LinkedList();
        Ilist.add(1);
        Ilist.add(2);
        Ilist.add(3);
        Ilist.add(4);
        Ilist.add(5);
        Ilist.add(2);
        System.out.println("元素2第一次出现的位置："+Ilist.indexOf(2));
        System.out.println("元素2最后一次出现的位置："+Ilist.lastIndexOf(2));
    }
}
