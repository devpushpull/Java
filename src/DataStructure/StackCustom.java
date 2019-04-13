/*
以下实例演示了用户如何通过创建用于插入元素的自定义函数 push() 方法和用于弹出元素的 pop() 方法来实现栈：
*/

package DataStructure;

import org.jetbrains.annotations.Contract;

public class StackCustom {
    private int maxSize;
    private long[] stackArray;
    private int top;
    @Contract(pure = true)
    public StackCustom(int i){
        maxSize = i;
        stackArray = new long[maxSize];
        top = -1;
    }
    public void push(long j){
        stackArray[++top] = j;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return (top == maxSize - 1);
    }
    public static void main(String[] args){
        StackCustom theStack = new StackCustom(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
    }
}
