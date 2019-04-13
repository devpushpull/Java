/*
以下实例演示了使用 top() 和 pop() 方法来获取链表的元素：
*/

package DataStructure;

import java.util.*;

public class GetLinkedListElement {
    private LinkedList list = new LinkedList();
    public void push(Object v){
        list.addFirst(v);
    }
    public Object top(){
        return list.getFirst();
    }
    public Object pop(){
        return list.removeFirst();
    }
    public static void main(String[] args){
        GetLinkedListElement stack = new GetLinkedListElement();
        for (int i = 30; i < 40; i++)
            stack.push(new Integer(i));
            System.out.println(stack.top());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
    }
}