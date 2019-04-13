package DataStructure;

import java.util.LinkedList;

public class LinkedListModify {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add("B");
        list.add("B");
        list.add("T");
        list.add("H");
        list.add("P");
        System.out.println("修改前："+list);
        list.set(2,"M");
        System.out.println("修改后："+list);
    }
}
